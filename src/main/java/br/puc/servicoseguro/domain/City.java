package br.puc.servicoseguro.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter
public class City implements Serializable {

    @Id
    private String id;

    private String name;

    public City() {
    }

    public City(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
