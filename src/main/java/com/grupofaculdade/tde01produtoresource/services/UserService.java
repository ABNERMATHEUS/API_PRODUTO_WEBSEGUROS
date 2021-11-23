package com.grupofaculdade.tde01produtoresource.services;

import com.grupofaculdade.tde01produtoresource.contracts.IUserRepository;
import com.grupofaculdade.tde01produtoresource.contracts.IUserService;
import com.grupofaculdade.tde01produtoresource.model.UserCustom;
import com.grupofaculdade.tde01produtoresource.security.UserSS;
import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


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
    public Pair<String,String> GetByEmail(String email) {
        UserCustom userCustom = userRepository.getByEmail(email);
        return  new Pair(userCustom.getEmail(), userCustom.getPassword());
    }

    @Override
    public UserCustom Save(UserCustom userCustom) {
        return userRepository.save(userCustom);
    }
}
