package model;

public abstract class Vehicle {
    int id;
    String type;
    String brand;
    String registrationNumber;
    double rentalPricePerDay;
    boolean available;

    public Vehicle() {
    }

    public int getId() {
        return id;
    }
    public boolean checkAvailability(){
        return available;

    }
    public void toggleAvailability(){

    }
    public void  displayDetails(){

    }
}
