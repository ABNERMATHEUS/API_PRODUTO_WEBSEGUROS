package com.grupofaculdade.tde01produtoresource.dto;

import java.io.Serializable;

public class UserNewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    //@NotEmpty(message="Preenchimento obrigatório")
    //@Email(message="Email inválido")
    private String email;

    //@NotEmpty(message="Preenchimento obrigatório")
    private String senha;

    public UserNewDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
