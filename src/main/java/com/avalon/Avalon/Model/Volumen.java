package com.avalon.Avalon.Model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Volumen {

    private long ValorNumerico;
    private String UnidadDeMedida;

    Map<String , String> obtieneDato() {
        return Collections.unmodifiableMap(
                new HashMap<>() {{
                    put("ValorNumerico", String.valueOf(ValorNumerico));
                    put("UnidadDeMedida", "UnidadDeMedida");
                }});
    }
}
