package com.grupofaculdade.tde01produtoresource.services;

import com.grupofaculdade.tde01produtoresource.contracts.IUserRepository;
import com.grupofaculdade.tde01produtoresource.contracts.IUserService;
import com.grupofaculdade.tde01produtoresource.model.User;
import com.grupofaculdade.tde01produtoresource.security.UserSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    public static UserSS authenticated() {
        try {
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal(); // métododo Spring Security que retorna o usuário logado
        }
        catch (Exception e) {
            return null;
        }
    }

    @Override
    public User GetByEmail(String email) {
        return userRepository.getByEmail(email);
    }

    @Override
    public User Save(User user) {
        return userRepository.save(user);
    }
}
