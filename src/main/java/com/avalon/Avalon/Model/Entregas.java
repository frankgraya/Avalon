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
public class Entregas {

    @JsonProperty("TotalEntregasMes")
    private long TotalEntregasMes;

    @JsonProperty("TotalDocumentosMes")
    private long TotalDocumentosMes;

    @JsonProperty("ImporteTotalEntregasMes")
    private long ImporteTotalEntregasMes;


}
