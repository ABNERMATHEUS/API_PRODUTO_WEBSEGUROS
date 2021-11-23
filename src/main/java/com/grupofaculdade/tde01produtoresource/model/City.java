package com.grupofaculdade.tde01produtoresource.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
