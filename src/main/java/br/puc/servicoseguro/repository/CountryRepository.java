package br.puc.servicoseguro.repository;

import br.puc.servicoseguro.domain.City;
import br.puc.servicoseguro.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
