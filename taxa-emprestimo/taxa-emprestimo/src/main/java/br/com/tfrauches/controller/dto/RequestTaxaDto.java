package br.com.tfrauches.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestTaxaDto {

    @JsonProperty("cpf")
    public String cpf;

    @JsonProperty("idade")
    public Integer idade;

    @JsonProperty("uf")
    public String uf;

    @JsonProperty("renda_mensal")
    public Integer rendaMensal;

}
