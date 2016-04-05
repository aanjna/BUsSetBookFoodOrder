package com.book.bus.busbooking;

/**
 * Created by Choudhary on 13-Jan-16.
 */
public class FoodIteamModel {
    String name;
    String price;
    int selectedIteamCount;

    public FoodIteamModel(String name, String price, int selectedIteamCount) {
        this.name = name;
        this.price = price;
        this.selectedIteamCount = selectedIteamCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSelectedIteamCount() {
        return selectedIteamCount;
    }

    public void setSelectedIteamCount(int selectedIteamCount) {
        this.selectedIteamCount = selectedIteamCount;
    }
}
