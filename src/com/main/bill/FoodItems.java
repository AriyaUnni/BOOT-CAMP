package com.main.bill;

import java.util.Scanner;

public class FoodItems {

    int Coffee;
    int shake;
    int sandwitch;


    public FoodItems(int coffee, int shake, int sandwitch) {
        Coffee = coffee;
        this.shake = shake;
        this.sandwitch = sandwitch;
    }

    public int getCoffee() {
        return Coffee;
    }

    public void setCoffee(int coffee) {
        Coffee = coffee;
    }

    public int getShake() {
        return shake;
    }

    public void setShake(int shake) {
        this.shake = shake;
    }

    public int getSandwitch() {
        return sandwitch;
    }

    public void setSandwitch(int sandwitch) {
        this.sandwitch = sandwitch;
    }

}
