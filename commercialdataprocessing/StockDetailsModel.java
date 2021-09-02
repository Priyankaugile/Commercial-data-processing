package com.commercialdataprocessing;

import java.util.Scanner;

public class StockDetailsModel {
    public String name;
    public int price;
    public int numberOfShares;

    public StockDetailsModel() {
    }

    public StockDetailsModel(String name, int price, int numberOfShares) {
        this.name = name;
        this.price = price;
        this.numberOfShares = numberOfShares;
    }

    @Override
    public String toString() {
        return "StockAccountModel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", numberOfShares=" + numberOfShares +
                '}';
    }

    static Scanner scan = new Scanner(System.in);

    public static String getName(){
        System.out.println("Enter name : ");
        return scan.next();
    }

    public static int getPrice(){
        System.out.println("Enter price : ");
        return scan.nextInt();
    }

    public static int getNumberOfShares(){
        System.out.println("Enter the number of stocks : ");
        return scan.nextInt();
    }
    public static void displayOptions(){
        System.out.println("****-Please Choose Any Option-****");
        System.out.println("Enter 1 for Add New portfolio.");
        System.out.println("Enter 2 for Stock Price.");
        System.out.println("Enter 3 for subtract your shares." );
        System.out.println("Enter 4 for Display record.");
        System.out.println("Enter 5 for leave.");
    }

    public static int readInteger() { return scan.nextInt();}

    public static double readDouble() { return scan.nextDouble();}

    public static String readString() { return scan.next();}

    public static String readStringLine() { return scan.nextLine();}

    public static float readFloat() { return scan.nextFloat();}
}
