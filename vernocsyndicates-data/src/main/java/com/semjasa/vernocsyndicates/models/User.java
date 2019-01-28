package com.semjasa.vernocsyndicates.models;

public class User extends BaseEntity {

    private String ingameName;
    private String userName;
    private Rank rank;
    private String email;

    public String getIngameName() {
        return ingameName;
    }

    public void setIngameName(String ingameName) {
        this.ingameName = ingameName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
