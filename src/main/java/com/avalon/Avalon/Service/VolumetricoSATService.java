/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.VolumetricoSAT;
import java.util.List;

/**
 *
 * @author frank
 */
public interface VolumetricoSATService {

    public VolumetricoSAT saveVolumetricoSAT(VolumetricoSAT volumetricoSAT);

    public void delete(long id);

    public VolumetricoSAT findById(long id);

    public List<VolumetricoSAT> findAll();

}
