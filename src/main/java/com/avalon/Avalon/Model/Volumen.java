package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Volumen {

    @JsonProperty("ValorNumerico")
    private double ValorNumerico;

    @JsonProperty("UnidadDeMedida")
    private String UnidadDeMedida;

    Map<String , String> obtieneDato() {
        return Collections.unmodifiableMap(
                new HashMap<>() {{
                    put("ValorNumerico", String.valueOf(ValorNumerico));
                    put("UnidadDeMedida", UnidadDeMedida);
                }});
    }
}
