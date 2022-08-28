package br.com.tfrauches.repository;

import br.com.tfrauches.model.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxaRepository extends JpaRepository<Taxa, Long> {

}
