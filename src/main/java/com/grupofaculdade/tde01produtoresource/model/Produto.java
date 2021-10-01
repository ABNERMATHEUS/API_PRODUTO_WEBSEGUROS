package com.grupofaculdade.tde01produtoresource.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "produto")
public class Produto {


    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;


    private String name;
    private String site_id;
    private String title;
    private String subtitle;
    private String currency_id;
    private String condition;
    private String permalink;
    private String seller_contact;
    private long id_integracao;
    private long saller_id;
    private long initial_quantity;
    private long avaliable_quantity;
    private double price;
    private double base_price;
    private double original_price;
    private Date start_time;
    private Date stop_time;


    @ManyToOne
    @JoinColumn(name = "seller_address", referencedColumnName = "ID")
    private SellerAddress seller_address;



    //private ArrayList<Attributes> list_attributes;


    public Produto(long id, String name, String site_id, String title, String subtitle, String currency_id, String condition, String permalink, long id_integracao, long saller_id, long initial_quantity, long avaliable_quantity, double price, double base_price, double original_price, Date start_time, Date stop_time, SellerAddress seller_address, String seller_contact, ArrayList<Attributes> attributes) {
        this.id = id;
        this.name = name;
        this.site_id = site_id;
        this.title = title;
        this.subtitle = subtitle;
        this.currency_id = currency_id;
        this.condition = condition;
        this.permalink = permalink;
        this.id_integracao = id_integracao;
        this.saller_id = saller_id;
        this.initial_quantity = initial_quantity;
        this.avaliable_quantity = avaliable_quantity;
        this.price = price;
        this.base_price = base_price;
        this.original_price = original_price;
        this.start_time = start_time;
        this.stop_time = stop_time;
        this.seller_address = seller_address;
        this.seller_contact = seller_contact;
//        this.attributes = attributes;
    }


    @Deprecated
    public Produto() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public long getId_integracao() {
        return id_integracao;
    }

    public void setId_integracao(long id_integracao) {
        this.id_integracao = id_integracao;
    }

    public long getSaller_id() {
        return saller_id;
    }

    public void setSaller_id(long saller_id) {
        this.saller_id = saller_id;
    }

    public long getInitial_quantity() {
        return initial_quantity;
    }

    public void setInitial_quantity(long initial_quantity) {
        this.initial_quantity = initial_quantity;
    }

    public long getAvaliable_quantity() {
        return avaliable_quantity;
    }

    public void setAvaliable_quantity(long avaliable_quantity) {
        this.avaliable_quantity = avaliable_quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public double getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(double original_price) {
        this.original_price = original_price;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getStop_time() {
        return stop_time;
    }

    public void setStop_time(Date stop_time) {
        this.stop_time = stop_time;
    }

//    public SellerAddress getSeller_address() {
//        return seller_address;
//    }
//
//    public void setSeller_address(SellerAddress seller_address) {
//        this.seller_address = seller_address;
//    }

    public String getSeller_contact() {
        return seller_contact;
    }

    public void setSeller_contact(String seller_contact) {
        this.seller_contact = seller_contact;
    }

//    public ArrayList<Attributes> getAttributes() {
//        return attributes;
//    }
//
//    public void setAttributes(ArrayList<Attributes> attributes) {
//        this.attributes = attributes;
//    }
}
