package br.puc.servicoseguro.repository;

import br.puc.servicoseguro.domain.SellerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerAddressRepository  extends JpaRepository<SellerAddress, String> {
}
