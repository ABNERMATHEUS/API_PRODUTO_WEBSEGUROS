package br.puc.servicoseguro.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter
public class Attribute implements Serializable {

    @Id
    private String id;

    private String value_name;

    public Attribute() {
    }

    public Attribute(String id, String value_name) {
        this.id = id;
        this.value_name = value_name;
    }
}
