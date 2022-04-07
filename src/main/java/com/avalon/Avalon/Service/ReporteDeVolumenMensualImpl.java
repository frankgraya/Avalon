package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.ReporteDeVolumenMensual;
import com.avalon.Avalon.Repository.ReporteDeVolumenMensualRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReporteDeVolumenMensualImpl implements ReporteDeVolumenMensualService{

    @Autowired
    private ReporteDeVolumenMensualRepository reporteDeVolumenMensualRepository;
    @Autowired
    private ControlDeExistenciasService controlDeExistenciasService;
    @Autowired
    private EntregasService entregasService;

    @Override
    public void save(ReporteDeVolumenMensual reporteDeVolumenMensual) {
        controlDeExistenciasService.save(reporteDeVolumenMensual.getControlDeExistencias());
        entregasService.save(reporteDeVolumenMensual.getEntregas());
        reporteDeVolumenMensualRepository.save(reporteDeVolumenMensual);
    }
}
