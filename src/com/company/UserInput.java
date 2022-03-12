package com.company;
// Step 1: Import
import  java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
 // Step No 2: Create Object of Scanner Class
 Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
//        Step No 3 Use
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are voter.");
        }else{
            System.out.println("You are not voter.");
        }

    }
}
