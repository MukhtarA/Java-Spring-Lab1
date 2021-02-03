package com.lab1;

public class ATMMenu {
    private String menu;

    public ATMMenu(String menu) {
        this.menu = menu;
    }

    public void menu(){
        System.out.println("[1] Get cash");
        System.out.println("[2] Deposit");
        System.out.println("[3] Balance");
        System.out.println("[4] Change pin");
        System.out.println("[0] Exit");
    }
}
