package com.grupofaculdade.tde01produtoresource.contracts;

import com.grupofaculdade.tde01produtoresource.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<User, UUID> {
    User getByEmail(String email);
}
