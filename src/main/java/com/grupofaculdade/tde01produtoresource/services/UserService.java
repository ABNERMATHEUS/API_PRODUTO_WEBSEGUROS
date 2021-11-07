package com.grupofaculdade.tde01produtoresource.services;

import com.grupofaculdade.tde01produtoresource.model.User;
import com.grupofaculdade.tde01produtoresource.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private BCryptPasswordEncoder pe;

    /*
    public User find(Integer id) throws ObjectNotFoundException {

        UserSS user = UserService.authenticated();
        if (user == null || !user.hasRole(Perfil.ADMIN) && !id.equals(user.getId())) {
            throw new AuthorizationException("Acesso negado");
        }

        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + User.class.getName()));
    }

    @Transactional
    public User insert(User obj) {
        obj.setId(null);
        obj = repo.save(obj);
        return obj;
    }

    public User update(User obj) throws ObjectNotFoundException {
        User newObj = find(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    /*
    public User findByEmail(String email) throws ObjectNotFoundException {
        UserSS user = UserService.authenticated();
        if (user == null || !user.hasRole(Perfil.ADMIN) && !email.equals(user.getUsername())) {
            throw new AuthorizationException("Acesso negado");
        }

        User obj = repo.findByEmail(email);
        if (obj == null) {
            throw new ObjectNotFoundException(
                    "Objeto não encontrado! Id: " + user.getId() + ", Tipo: " + User.class.getName());
        }
        return obj;
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getEmail(), null);
    }

    public User fromDTO(UserNewDTO objDto) {
        User cli = new User(null, objDto.getEmail(), pe.encode(objDto.getSenha()));
        return cli;
    }
    */
    private void updateData(User newObj, User obj) {
        newObj.setEmail(obj.getEmail());
    }

}
