/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avalon.Avalon.Repository;

import com.avalon.Avalon.Model.VolumetricoSAT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author frank
 */
@Repository
public interface VolumetricoSATRepository extends JpaRepository<VolumetricoSAT, Long> {

}
