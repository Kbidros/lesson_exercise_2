package com.kristian.demo;

public class Main {

    public static void main(String[] args) {


        int age = 17;

        if (age < 18) {

            System.out.println("Underage");

            // om int age = under 18 så skrivs svaret: Underage

        } else {
            System.out.println("Adult");
        }

        // om svaret är 18 eller mer så skrivs svaret: Adult

        for (int i = 0; i <= 10; i++) {

            System.out.println(i);

            if (i == 10) {
                System.out.println("index is 10");
            } else {
                System.out.println("index is not 10");
            }
        }
        // Om svaret är 10 skrivs det: index is 10, om inte så skrivs index is not 10


        String name = "Anton";

        switch (name) {

            case "Anton":
                System.out.println("Welcome to Microsoft, this is Anton speaking.");
                break;

            case "Richard":
                System.out.println("Welcome to Pied piper, this is Richard speaking");
                break;

            default:
                System.out.println("Sorry, who are you again?");


        }


    }
}