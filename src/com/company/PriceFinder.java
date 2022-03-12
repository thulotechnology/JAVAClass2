package com.company;
import java.util.Scanner;

public class PriceFinder {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of product: ");
        double price = sc.nextDouble();

        if(price >= 500){
            System.out.println("Price is equal or more than 500");
        }else{
            System.out.println("Price is less than 500");
        }

    }
}
