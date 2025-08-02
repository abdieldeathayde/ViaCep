package com.alura.buscacep;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Endereco(
        @JsonProperty("cep") String cep,
        @JsonProperty("logradouro") String logradouro,
        @JsonProperty("complemento") String complemento,
        @JsonProperty("unidade") String unidade,
        @JsonProperty("bairro") String bairro,
        @JsonProperty("localidade") String localidade,
        @JsonProperty("uf") String uf,
        @JsonProperty("estado") String estado,
        @JsonProperty("regiao") String regiao,
        @JsonProperty("ibge") String ibge,
        @JsonProperty("gia") String gia,
        @JsonProperty("ddd") String ddd,
        @JsonProperty("siafi") String siafi
) {}