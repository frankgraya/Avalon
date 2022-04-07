package com.avalon.Avalon.Model;

import com.avalon.Avalon.Util.NumericBooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("ClaveProducto")
    private String ClaveProducto;

    @JsonProperty("ClaveSubProducto")
    private String ClaveSubProducto;

    @JsonDeserialize(using= NumericBooleanDeserializer.class) //Deserializer class created below
    @JsonProperty("DieselConCombustibleNoFosil")
    private boolean DieselConCombustibleNoFosil = false;

    @JsonDeserialize(using= NumericBooleanDeserializer.class) //Deserializer class created below
    @JsonProperty("GasolinaConCombustibleNoFosil")
    private boolean GasolinaConCombustibleNoFosil = false;

    @JsonProperty("ComposOctanajeGasolina")
    private long ComposOctanajeGasolina;

    @Transient
    @JsonProperty("ReporteDeVolumenMensual")
    private ReporteDeVolumenMensual ReporteDeVolumenMensual;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "volumetricosat_id", nullable = false)
    private VolumetricoSAT volumetricoSAT;

    public void setVolumetricoSAT(VolumetricoSAT volumetricoSAT){
        this.volumetricoSAT = volumetricoSAT;
    }
}
