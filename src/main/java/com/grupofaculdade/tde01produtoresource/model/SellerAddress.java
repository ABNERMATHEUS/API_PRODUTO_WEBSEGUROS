package com.grupofaculdade.tde01produtoresource.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class SellerAddress implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "city", referencedColumnName = "ID")
    private City city;

    @ManyToOne
    @JoinColumn(name = "state", referencedColumnName = "ID")
    private State state;

    @ManyToOne
    @JoinColumn(name = "country", referencedColumnName = "ID")
    private Country country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
