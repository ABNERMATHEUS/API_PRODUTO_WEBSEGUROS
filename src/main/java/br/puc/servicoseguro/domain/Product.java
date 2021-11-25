package br.puc.servicoseguro.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"id"}, allowGetters = true)
@Getter @Setter
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "MLB")
    private String id;

    private String site_id;
    private String title;
    private Long id_integracao;
    private String subtitle;
    private Long seller_id;
    private BigDecimal price;
    private BigDecimal base_price;
    private BigDecimal original_price;
    private String currency_id;
    private int initial_quantity;
    private int available_quantity;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date start_time;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date stop_time;

    private String condition;
    private String permalink;

    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="seller_address", nullable=false)
    private SellerAddress seller_address;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<Attribute> atributes;

}
