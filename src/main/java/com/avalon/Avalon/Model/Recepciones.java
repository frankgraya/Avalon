package com.avalon.Avalon.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Recepciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonProperty("TotalRecepcionesMes")
    private long TotalRecepcionesMes;

    @JsonProperty("SumaVolumenRecepcionMes")
    private Volumen SumaVolumenRecepcionMes;

    @JsonProperty("TotalDocumentosMes")
    private long TotalDocumentosMes;

    @JsonProperty("ImporteTotalRecepcionesMensual")
    private double ImporteTotalRecepcionesMensual;

    @JsonProperty("Complemento")
    private transient List<Complemento> Complemento;

}
