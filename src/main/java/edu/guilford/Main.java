package edu.guilford;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Greet the user with a personalized message
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        // After greeting the user, update them on the current weather given their location
        System.out.println("What is your location?");
        String location = input.nextLine();
        
        // A dynamic system for updating the user on the weather given their location
        // This is a very simple example, but you could use a more complex API to get more accurate weather data
        if (location.equals("Greensboro")) {
            System.out.println("It is currently 70 degrees and sunny in Greensboro.");
        } else if (location.equals("New York")) {
            System.out.println("It is currently 50 degrees and cloudy in New York.");
        } else if (location.equals("London")) {
            System.out.println("It is currently 40 degrees and rainy in London.");
        } else {
            System.out.println("Sorry, I don't know the weather in " + location + ".");
        }
    }
}