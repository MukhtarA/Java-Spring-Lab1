package com.lab1;

public class BankService {
    private String bank;
    private  String addressOfTheBank;
    private int transactionNumber;
    private  String cardType;

    BankService(String bank, String addressOfTheBank, int transactionNumber, String cardType){
        this.bank = bank;
        this.addressOfTheBank = addressOfTheBank;
        this.transactionNumber = transactionNumber;
        this.cardType = cardType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAddressOfTheBank() {
        return addressOfTheBank;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setAddressOfTheBank(String addressOfTheBank) {
        this.addressOfTheBank = addressOfTheBank;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
}

