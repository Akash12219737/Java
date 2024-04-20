package OOPs;

import java.util.Scanner;

class Ticket {
    private String passengerName;
    private int seatNumber;
    private String departureStation;
    private String destinationStation;
    
    public Ticket(String passengerName, int seatNumber, String departureStation, String destinationStation) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
    }
    
    public void displayTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Departure Station: " + departureStation);
        System.out.println("Destination Station: " + destinationStation);
    }
}

public class RailwayTicketSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter passenger name:");
        String passengerName = scanner.nextLine();
        
        System.out.println("Enter seat number:");
        int seatNumber = scanner.nextInt();
        
        scanner.nextLine(); // Consume newline character
        
        System.out.println("Enter departure station:");
        String departureStation = scanner.nextLine();
        
        System.out.println("Enter destination station:");
        String destinationStation = scanner.nextLine();
        
        Ticket ticket = new Ticket(passengerName, seatNumber, departureStation, destinationStation);
        System.out.println("\nTicket Details:");
        ticket.displayTicketDetails();
    }
}
