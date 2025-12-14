package model;
import interfaces.Matchable;

//User.java
public abstract class User implements Matchable {
 protected int id;
 protected String name;
 protected int age;
 
 // "Has-a" Relationship: Her kullanıcının detayları vardır.
 protected ProfileDetails details; 

 // Static Variable: Toplam oluşturulan kullanıcı sayısını tutar.
 public static int totalUsers = 0;

 // Constructor
 public User(int id, String name, int age, ProfileDetails details) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.details = details;
     totalUsers++; // Her nesne oluştuğunda sayacı artır
 }

 // Abstract Method: Alt sınıflar bunu kendine göre doldurmak zorunda.
 public abstract void showProfileType();

 // Static Method
 public static void displayTotalUserCount() {
     System.out.println("Total Users Created in Friefind: " + totalUsers);
 }

 // Getter for ID (Search işleminde lazım olacak)
 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }
 
 public int getAge() {
     return age;
 }

 @Override
 public String toString() {
     return "ID: " + id + " | Name: " + name + " (" + age + ") | " + details;
 }
}
