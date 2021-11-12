package com.grupofaculdade.tde01produtoresource.services;

import com.grupofaculdade.tde01produtoresource.security.UserSS;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public static UserSS authenticated() {
        try {
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal(); // métododo Spring Security que retorna o usuário logado
        }
        catch (Exception e) {
            return null;
        }
    }
}
