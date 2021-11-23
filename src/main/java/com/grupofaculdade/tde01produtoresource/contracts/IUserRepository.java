package com.grupofaculdade.tde01produtoresource.contracts;

import com.grupofaculdade.tde01produtoresource.model.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<UserCustom, UUID> {
    UserCustom getByEmail(String email);
}
