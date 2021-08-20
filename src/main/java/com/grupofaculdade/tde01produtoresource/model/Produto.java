package com.grupofaculdade.tde01produtoresource.model;

import java.util.UUID;

public class Produto {



    private UUID id;


    private String name;


    private int yearFabrication;


    private String EAN;

    public Produto(String name, int yearFabrication, String EAN) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.yearFabrication = yearFabrication;
        this.EAN = EAN;
    }

    public Produto() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFabrication() {
        return yearFabrication;
    }

    public void setYearFabrication(int yearFabrication) {
        this.yearFabrication = yearFabrication;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }
}
