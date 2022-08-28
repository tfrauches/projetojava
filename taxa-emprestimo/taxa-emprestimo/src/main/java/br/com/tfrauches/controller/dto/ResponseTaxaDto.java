package br.com.tfrauches.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResponseTaxaDto {

    @JsonProperty("modalidade_emprestimos")
    public List<TaxaDto> taxa;

}
