package com.suits;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<StockAgency> agencyList = new ArrayList<>();
    private String stock;

    public void addAgency(StockAgency sa){
        agencyList.add(sa);
    }
    public void delAgency(StockAgency sa){
        agencyList.remove(sa);
    }

    public void notifyStockAgency(String msg){
        agencyList.forEach(sa -> {sa.update(msg);});
    }

    public void changeStock(String stockName, String msg){
        this.stock = stockName;
        notifyStockAgency(stockName + ": " + msg);
    }
}
