/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.VolumetricoSAT;
import com.avalon.Avalon.Repository.VolumetricoSATRepository;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author frank
 */
@Service
@Slf4j
public class VolumetricoSATServiceImpl implements VolumetricoSATService {

    @Autowired
    private VolumetricoSATRepository volumetricoSATRepository;

    @Override
    public VolumetricoSAT saveVolumetricoSAT(VolumetricoSAT volumetricoSAT) {
        log.info("Se guardo saveEmployee con exito ");
        return volumetricoSATRepository.save(volumetricoSAT);
    }

    @Override
    public void delete(long id) {
        volumetricoSATRepository.deleteById(id);
    }

    @Override
    public VolumetricoSAT findById(long id) {
        Optional<VolumetricoSAT> optional = volumetricoSATRepository.findById(id);
        VolumetricoSAT volumetricoSAT = null;
        if (optional.isPresent()) {
            volumetricoSAT = optional.get();
        } else {
            throw new RuntimeException(" VOLUMENTRICO NO ENCONTRADO POR ID :: " + id);
        }
        return volumetricoSAT;
    }

    @Override
    public List<VolumetricoSAT> findAll() {
        return (List<VolumetricoSAT>) volumetricoSATRepository.findAll();
    }

}
