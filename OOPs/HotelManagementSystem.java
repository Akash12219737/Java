package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private boolean isOccupied;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}

class Hotel {
    private ArrayList<Room> rooms;

    public Hotel(int numRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                System.out.println("Room " + room.getRoomNumber());
            }
        }
    }

    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isOccupied()) {
                room.setOccupied(true);
                System.out.println("Room " + roomNumber + " booked successfully.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is either occupied or doesn't exist.");
    }

    public void releaseRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isOccupied()) {
                room.setOccupied(false);
                System.out.println("Room " + roomNumber + " released successfully.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not occupied or doesn't exist.");
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rooms in the hotel: ");
        int numRooms = scanner.nextInt();
        Hotel hotel = new Hotel(numRooms);

        int choice;
        do {
            System.out.println("\n1. Display available rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Release a room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter the room number to book: ");
                    int roomToBook = scanner.nextInt();
                    hotel.bookRoom(roomToBook);
                    break;
                case 3:
                    System.out.print("Enter the room number to release: ");
                    int roomToRelease = scanner.nextInt();
                    hotel.releaseRoom(roomToRelease);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
