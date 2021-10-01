package com.grupofaculdade.tde01produtoresource.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Attributes {

    @Id
    @Column(name = "ID", nullable = false)
    private long id;
    private String value_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue_name() {
        return value_name;
    }

    public void setValue_name(String value_name) {
        this.value_name = value_name;
    }
}
