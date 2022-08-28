package br.com.tfrauches.controller.dto;

import br.com.tfrauches.model.Taxa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxaDto {

    private String tipo;
    private Integer taxa;

    public TaxaDto(Taxa taxa){
        this.tipo =  taxa.getTipo();
        this.taxa = taxa.getTaxa();
    }

    public static List<TaxaDto> converter(List<Taxa> taxa) {
        return taxa.stream().map(TaxaDto::new).collect(Collectors.toList());
    }
}
