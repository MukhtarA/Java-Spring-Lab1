package com.lab1;

public class Account {
    private int pin;
    private int sum;
    private String name;

    public Account(int pin, int sum, String name) {
        this.pin = pin;
        this.sum = sum;
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
