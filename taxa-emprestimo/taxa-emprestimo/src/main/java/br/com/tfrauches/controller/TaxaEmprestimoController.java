package br.com.tfrauches.controller;


import br.com.tfrauches.controller.dto.RequestTaxaDto;
import br.com.tfrauches.controller.dto.ResponseTaxaDto;
import br.com.tfrauches.controller.dto.TaxaDto;
import br.com.tfrauches.model.Taxa;
import br.com.tfrauches.repository.TaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/taxas")
public class TaxaEmprestimoController {

    @Autowired
    TaxaRepository taxaRepository;

    @PostMapping
    public ResponseEntity<ResponseTaxaDto> listar(@RequestBody RequestTaxaDto requestTaxaDto){

        List<Taxa> taxa = taxaRepository.findAll();
        List<TaxaDto> taxaDto = TaxaDto.converter(taxa);
        return ResponseEntity.ok(new ResponseTaxaDto(taxaDto));
    }
}
