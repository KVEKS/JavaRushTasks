package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/*
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        ivan.setAllMoney(2000, 5000, 300);
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
        }

        public void setAllMoney(double hrivna, double ruble, double usd) {
            allMoney.add(new Hrivna(hrivna));
            allMoney.add(new Ruble(ruble));
            allMoney.add(new USD(usd));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}


public  class Money {
    public Money(double amount) {
        this.amount = amount;
    }
    private double amount;
    public double getAmount() {
        return amount;
    }


    public  String getCurrencyName() {
        return null;
    }
}

public class Hrivna extends Money {
    private double amount;
    public Hrivna(double amount){
        super(amount);
        this.amount = amount;
    }
    public  String getCurrencyName() {
        return "UAH";
    }
}

public class USD extends Money {
    private double amount;
    public USD(double amount){
        super(amount);
        this.amount = amount;
    }
    public  String getCurrencyName() {
        return "USD";
    }
}

public class RUB extends Money {
    private double amount;
    public RUB(double amount){
        super(amount);
        this.amount = amount;
    }
    public  String getCurrencyName() {
        return "RUB";
    }
}
