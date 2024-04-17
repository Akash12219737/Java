package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}

class UMS {
    private ArrayList<User> users;
    
    public UMS() {
        users = new ArrayList<>();
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    public boolean authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        UMS ums = new UMS();
        ums.addUser(new User("admin", "admin123"));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (ums.authenticate(username, password)) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
    }
}
