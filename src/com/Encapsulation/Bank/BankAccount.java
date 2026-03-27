package com.Encapsulation.Bank;

public class BankAccount {


    private String accountNumber;

    private String accountHolderName;

    private double balance;

    public BankAccount(double balance, String accountHolderName, String accountNumber) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("invalid amount");
        } else {
            balance = balance + money;
        }
    }

    public double withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println(" you enter invalid amount");

        } else if (balance >= money) {
            balance = balance - money;

        } else {
            System.out.println(" sorry , you don't have enough balance");
        }
        return money;
    }

    public static void main(String[] args) {
        BankAccount bank =new BankAccount(50,"shubham","55555");
        bank.depositMoney(50);
        System.out.println(bank.balance);
        bank.withdrawMoney(40);
        System.out.println(bank.balance);
        bank.withdrawMoney(0);
        bank.depositMoney(-40);
    }

    }
