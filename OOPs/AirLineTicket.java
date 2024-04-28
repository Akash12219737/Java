package OOPs;



public class AirLineTicket {
    private String passengerName;
    private String flightNumber;
    private double ticketPrice;

    public AirLineTicket(String passengerName, String flightNumber, double ticketPrice) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.ticketPrice = ticketPrice;
    }

    public void displayTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Ticket Price: $" + ticketPrice);
    }

    public static void main(String[] args) {
        AirLineTicket ticket1 = new AirLineTicket("Alice", "ABC123", 250.0);
        AirLineTicket ticket2 = new AirLineTicket("Bob", "XYZ789", 300.0);

        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
    }
}
