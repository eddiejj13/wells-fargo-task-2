package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private int securityId;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int total;

    @Column(nullable = false)
    private String date;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", referencedColumnName = "portfolioId")
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(String symbol, String type, int quantity, int price, int total, String date) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.date = date;
    }

    public String getSymbol() {return this.symbol;}
    public void setSymbol(String symbol) {this.symbol = symbol;}
    public String getType() {return this.type;}
    public void setType(String type) {this.type = type;}
    public int getQuantity(){return this.quantity;}
    public void setQuantity(int quantity){this.quantity = quantity;}
    public int getPrice(){return this.price;}
    public void setPrice(int price){this.price = price;}
    public int getTotal(){return this.total;}
    public void setTotal(int total){this.total = total;}
    public String getDate(){return this.date;}
    public void setDate(String date){this.date = date;}

}
