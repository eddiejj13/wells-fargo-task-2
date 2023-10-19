package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int riskFactor;

    @Column(nullable = false)
    private int level;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "clientId")
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String name, int riskFactor, int level) {
        this.name = name;
        this.riskFactor = riskFactor;
        this.level = level;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public int getRiskFactor() {return this.riskFactor;}
    public void setRiskFactor(int riskFactor) {this.riskFactor = riskFactor;}
    public int getLevel() {return this.level;}
    public void setLevel(int level) {this.level = level;}
}
