package com.aca.exam.exam2;

public class Order {

    private int id;
    private String name;
    private int price;
    private User purchasedUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public User getPurchasedUser() {
        return purchasedUser;
    }

    public void setPurchasedUser(User purchasedUser) {
        this.purchasedUser = purchasedUser;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", purchasedUser=" + purchasedUser +
                '}';
    }
}
