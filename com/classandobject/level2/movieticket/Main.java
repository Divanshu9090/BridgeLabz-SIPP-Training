package com.classandobject.level2.movieticket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Booking input
        System.out.print("Enter Movie Name: ");
        String movie = input.nextLine();

        System.out.print("Enter Seat Number: ");
        String seat = input.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = input.nextDouble();

        // Book and display ticket
        ticket.bookTicket(movie, seat, price);
        ticket.displayTicket();

        // Close the scanner
        input.close();
    }
}