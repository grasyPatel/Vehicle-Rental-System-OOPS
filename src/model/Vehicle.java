package model;

public class Vehicle {
    int id;
    String type;
    String brand;
    String model;
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
