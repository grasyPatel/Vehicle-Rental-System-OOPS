package service;

public class VehicleService {
    int id;
    String type;
    String brand;
    String model;
    double rentalPricePerDay;
    boolean available;

    public VehicleService() {
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
