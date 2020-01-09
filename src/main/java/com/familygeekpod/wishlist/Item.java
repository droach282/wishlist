package com.familygeekpod.wishlist;

public class Item {
    private final long id;
    private final String name;
    private final float cost;

    public Item(long id, String name, float cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }
}