package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ReporteDeVolumenMensual {

    @JsonProperty("ControlDeExistencias")
    private ControlDeExistencias ControlDeExistencias;

    @JsonProperty("Entregas")
    private Entregas Entregas;

}
