package com.grupofaculdade.tde01produtoresource.services;

import com.grupofaculdade.tde01produtoresource.model.User;
import com.grupofaculdade.tde01produtoresource.model.enums.Perfil;
import com.grupofaculdade.tde01produtoresource.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class DBService {

    @Autowired
    private BCryptPasswordEncoder pe;

    @Autowired
    private UserRepository userRepository;

    public void instantiateTestDatabase() throws ParseException {

        User user1 = new User(1, "email@example.com", pe.encode("123"));
        user1.addPerfil(Perfil.ADMIN);

    }
}
