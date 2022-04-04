/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.Avalon.Model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author frank
 */
@Data
@Entity
@Table(name = "VolumetricoSAT")
public class VolumetricoSAT implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Version", nullable = false, length = 150)
    private long Version;

    @Column(name = "RfcContribuyente", nullable = false, length = 150)
    private String RfcContribuyente;

    @Column(name = "RfcRepresentanteLegal", nullable = false, length = 150)
    private String RfcRepresentanteLegal;

    @Column(name = "RfcProveedor", nullable = false, length = 150)
    private String RfcProveedor;

    @Column(name = "Caracter", nullable = false, length = 150)
    private String Caracter;

    @Column(name = "ModalidadPermiso", nullable = false, length = 150)
    private String ModalidadPermiso;

    @Column(name = "NumPermiso", nullable = false, length = 150)
    private String NumPermiso;

    @Column(name = "ClaveInstalacion", nullable = false, length = 150)
    private String ClaveInstalacion;

    @Column(name = "DescripcionInstalacion", nullable = false, length = 150)
    private String DescripcionInstalacion;

    @Column(name = "NumeroPozos", nullable = false)
    private int NumeroPozos;

    @Column(name = "NumeroTanques", nullable = false)
    private int NumeroTanques;

    @Column(name = "NumeroDuctosEntradaSalida", nullable = false)
    private int NumeroDuctosEntradaSalida;

    @Column(name = "NumeroDuctosTransporteDistribucion", nullable = false)
    private int NumeroDuctosTransporteDistribucion;

    @Column(name = "NumeroDispensarios", nullable = false, length = 150)
    private String NumeroDispensarios;

//    @Column(name = "FechaYHoraReporteMes", updatable = false, nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private String FechaYHoraReporteMes;
//    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Producto producto;
}
