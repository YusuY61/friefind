package main;
import model.*;
import service.*;

//Main.java
public class Main {
 public static void main(String[] args) {
     FriefindSystem app = new FriefindSystem();

     ProfileDetails p1 = new ProfileDetails("Loves hiking", "Mountaineering");
     ProfileDetails p2 = new ProfileDetails("Coffee addict", "Reading");
     ProfileDetails p3 = new ProfileDetails("Traveler", "Photography");

     User u1 = new StandardUser(101, "Ali", 25, p1);
     User u2 = new PremiumUser(102, "Ayşe", 29, p2, true);
     User u3 = new StandardUser(103, "Mehmet", 22, p3);

     app.addUser(u1);
     app.addUser(u2);
     app.addUser(u3);
     
    
     User.displayTotalUserCount(); 
     
     Location l1 = new Location("ankara", 20.5, 30.4);

     app.setMeeting(u1, u2, l1);
    
     app.displayAllUsers();

     System.out.println("\n--- Searching for 'Ayşe' ---");
     app.searchUser("Ayşe");

     System.out.println("\n--- Statistics ---");
     app.calculateAverageAge();

     System.out.println("\n--- Swiping Action ---");
     u2.swipeRight(u1); // Premium user swipe
     u1.swipeRight(u2); // Standard user swipe

 
     System.out.println("\n--- Deleting User 103 ---");
     app.deleteUser(103);
     app.displayAllUsers();
 }
}