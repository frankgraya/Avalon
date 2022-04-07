/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author frank
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "VolumetricoSAT")
public class VolumetricoSAT implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonProperty("Version")
    @Column(name = "Version", nullable = false, length = 150)
    private String Version;

    @JsonProperty("RfcContribuyente")
    @Column(name = "RfcContribuyente", nullable = false, length = 150)
    private String RfcContribuyente;

    @JsonProperty("RfcRepresentanteLegal")
    @Column(name = "RfcRepresentanteLegal", nullable = false, length = 150)
    private String RfcRepresentanteLegal;

    @JsonProperty("RfcProveedor")
    @Column(name = "RfcProveedor", nullable = false, length = 150)
    private String RfcProveedor;

    @JsonProperty("Caracter")
    @Column(name = "Caracter", nullable = false, length = 150)
    private String Caracter;

    @JsonProperty("ModalidadPermiso")
    @Column(name = "ModalidadPermiso", nullable = false, length = 150)
    private String ModalidadPermiso;

    @JsonProperty("NumPermiso")
    @Column(name = "NumPermiso", nullable = false, length = 150)
    private String NumPermiso;

    @JsonProperty("ClaveInstalacion")
    @Column(name = "ClaveInstalacion", nullable = false, length = 150)
    private String ClaveInstalacion;

    @JsonProperty("DescripcionInstalacion")
    @Column(name = "DescripcionInstalacion", nullable = false, length = 150)
    private String DescripcionInstalacion;

    @JsonProperty("NumeroPozos")
    @Column(name = "NumeroPozos", nullable = false)
    private int NumeroPozos;

    @JsonProperty("NumeroTanques")
    @Column(name = "NumeroTanques", nullable = false)
    private int NumeroTanques;

    @JsonProperty("NumeroDuctosEntradaSalida")
    @Column(name = "NumeroDuctosEntradaSalida", nullable = false)
    private int NumeroDuctosEntradaSalida;

    @JsonProperty("NumeroDuctosTransporteDistribucion")
    @Column(name = "NumeroDuctosTransporteDistribucion", nullable = false)
    private int NumeroDuctosTransporteDistribucion;

    @JsonProperty("NumeroDispensarios")
    @Column(name = "NumeroDispensarios", nullable = false, length = 150)
    private int NumeroDispensarios;

//    @Column(name = "FechaYHoraReporteMes", updatable = false, nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private String FechaYHoraReporteMes;
//    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Producto producto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VolumetricoSAT that = (VolumetricoSAT) o;
        return  Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
