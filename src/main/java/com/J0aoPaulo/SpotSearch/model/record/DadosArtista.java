package com.J0aoPaulo.SpotSearch.model.record;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosArtista(@JsonProperty("id") String id,
                           @JsonProperty("name") String nome) {
}
