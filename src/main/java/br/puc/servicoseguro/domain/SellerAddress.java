package br.puc.servicoseguro.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
public class SellerAddress implements Serializable {

    @Id
    private long id;

    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="city", nullable=false)
    private City city;

    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="state", nullable=false)
    private State state;

    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="country", nullable=false)
    private Country country;

    public SellerAddress() {
    }

    public SellerAddress(long id, City city, State state, Country country) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
