package com.company;

import java.util.Locale;

public class StringWork {
    public static void main(String[] args) {
        String firstname = "Jessica";
        String lastname = "Thapa";


        String fullname = firstname.concat(" ");
        fullname = fullname.concat(lastname);

        boolean isEquals = firstname.equals(lastname);

        System.out.println("Name is "+fullname);
        System.out.println("Value at index 9 is "+fullname.charAt(9));
        System.out.println("First name is equal to Lastname "+isEquals);
        System.out.println("The length of fullname "+fullname.length());
        System.out.println("Full name in uppercase "+fullname.toUpperCase());
        System.out.println("Full name in lowercase "+fullname.toLowerCase());

        fullname=  fullname.replace("Jessica","Mamita");

        System.out.println("New name is "+fullname);
// Now name is Mamita Thapa
        String other = fullname.substring(2,6);
        System.out.println("Other is "+other);


    }
}
