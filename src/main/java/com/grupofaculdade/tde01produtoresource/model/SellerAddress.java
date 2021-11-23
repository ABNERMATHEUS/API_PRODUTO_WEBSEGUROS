package com.grupofaculdade.tde01produtoresource.model;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class SellerAddress implements Serializable {

    @Id
    @Column(name = "ID", nullable = true)
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

    public SellerAddress(long id, City city, State state, Country country) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public SellerAddress() {
    }


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
