package br.puc.servicoseguro.repository;

import br.puc.servicoseguro.domain.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, String> {
}
