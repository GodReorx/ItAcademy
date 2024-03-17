package com.suits;

public class StockAgency {

    private String name;
    private Broker broker = new Broker();

    public StockAgency(String name){
        this.name = name;
    }

    public void update(String stockChange){
        System.out.println(this.name + " --> " + stockChange);
    }
    public void asignBroker(Broker broker){
        this.broker = broker;
    }
}
