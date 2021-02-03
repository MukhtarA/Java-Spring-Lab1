package com.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ATMMenu ATMMenu = context.getBean("ATMMenu", ATMMenu.class);
        Account account = context.getBean("account", Account.class);
        Scanner scan = new Scanner(System.in);

        int userPin;
        int userChoice;
        int userInput;

        while (true) {
            userPin = scan.nextInt();
            if (userPin == account.getPin()){
                System.out.println("Everything is correct");
                break;
            }else{
                System.out.println("Pin wrong, try again");
            }
        }

        while (true){
            ATMMenu.menu();
            userChoice = scan.nextInt();
            if (userChoice == 1){
                System.out.print("Enter sum: ");
                userInput = scan.nextInt();
                account.setSum(account.getSum() - userInput);
            }
            if (userChoice == 2){
                System.out.print("Enter sum: ");
                userInput = scan.nextInt();
                account.setSum(account.getSum() + userInput);
            }
            if (userChoice == 3){
                System.out.print("Current balance: " + account.getSum());
            }
            if (userChoice == 4){
                System.out.println("Enter new pin: ");
                userInput = scan.nextInt();
                account.setPin(userInput);
            }
            if (userChoice == 0){
                break;
            }
        }

    }
}
