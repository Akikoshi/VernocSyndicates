package com.semjasa.vernocsyndicates.models;

public class AuctionhouseEntry extends BaseEntity {
    private String itemName;
    private Integer costs;
    private User user;
    private Integer amount;
    private String onlineState;
    private String sellBuyState;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(String onlineState) {
        this.onlineState = onlineState;
    }

    public String getSellBuyState() {
        return sellBuyState;
    }

    public void setSellBuyState(String sellBuyState) {
        this.sellBuyState = sellBuyState;
    }
}
