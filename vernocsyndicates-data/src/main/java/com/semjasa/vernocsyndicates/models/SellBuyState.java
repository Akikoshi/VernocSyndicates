package com.semjasa.vernocsyndicates.models;

public class SellBuyState {
    public SellBuyState sellBuyState;

    public SellBuyState(SellBuyState sellBuyState) {
        this.sellBuyState = sellBuyState;
    }

    public SellBuyState getSellBuyState() {
        return sellBuyState;
    }

    public void setSellBuyState(SellBuyState sellBuyState) {
        this.sellBuyState = sellBuyState;
    }
}

enum SellOrBuy{
    Sell, Buy
}
