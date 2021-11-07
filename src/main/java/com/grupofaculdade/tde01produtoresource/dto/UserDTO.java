package com.grupofaculdade.tde01produtoresource.dto;

import com.grupofaculdade.tde01produtoresource.model.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    //@NotEmpty(message="Preenchimento obrigatório")
    //@Email(message="Email inválido")
    private String email;

    public UserDTO() {
    }

    public UserDTO(User obj) {
        id = obj.getId();
        email = obj.getEmail();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
