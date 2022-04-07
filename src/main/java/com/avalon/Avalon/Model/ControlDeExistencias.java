package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ControlDeExistencias {

    @JsonProperty("VolumenExistenciasMes")
    private double VolumenExistenciasMes;

    @JsonProperty("FechaYHoraEstaMedicionMes")
    private Date FechaYHoraEstaMedicionMes;

    Map<String , String> obtieneDato() {
        return Collections.unmodifiableMap(
                new HashMap<>() {{
                    put("VolumenExistenciasMes", String.valueOf(VolumenExistenciasMes));
                    put("FechaYHoraEstaMedicionMes", String.valueOf(FechaYHoraEstaMedicionMes));
                }});
    }
}
