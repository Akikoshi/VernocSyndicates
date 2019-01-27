package com.semjasa.vernocsyndicates.models;

public class AuctionhouseEntry extends BaseEntity {
    private String itemName;
    private Integer costs;
    private String playerName;
    private Integer amount;
    private OnlineState onlineState;
    private SellBuyState sellBuyState;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getCosts() {
        return costs;
    }

    public void setCosts(Integer costs) {
        this.costs = costs;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public OnlineState getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(OnlineState onlineState) {
        this.onlineState = onlineState;
    }

    public SellBuyState getSellBuyState() {
        return sellBuyState;
    }

    public void setSellBuyState(SellBuyState sellBuyState) {
        this.sellBuyState = sellBuyState;
    }
}
