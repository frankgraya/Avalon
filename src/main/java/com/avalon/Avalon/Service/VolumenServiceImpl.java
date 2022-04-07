package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.Volumen;
import com.avalon.Avalon.Repository.VolumenRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VolumenServiceImpl implements VolumenService{

    @Autowired
    private VolumenRepository volumenRepository;

    @Override
    public void save(Volumen volumen) {
        volumenRepository.save(volumen);
    }
}
