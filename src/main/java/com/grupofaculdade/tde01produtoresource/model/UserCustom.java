package com.grupofaculdade.tde01produtoresource.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserCustom {

    @Id
    private String email;
    private String senha;

    public UserCustom(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public UserCustom() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
