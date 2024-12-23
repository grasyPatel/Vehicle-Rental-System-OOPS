package service;

import model.Bike;
import model.Car;
import model.Truck;
import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {

    private List<Vehicle> vehicles=new ArrayList<>();

    public void addVehicle(String type, String brand, String registrationNumber, double pricePerDay) {
        Vehicle newVehicle;
        switch (type.toLowerCase()){
            case "car":
                newVehicle=new Car(brand,registrationNumber,pricePerDay);
                break;
            case "bike":
                newVehicle=new Bike(brand,registrationNumber,pricePerDay);
            case "truck":
                newVehicle=new Truck(brand,registrationNumber,pricePerDay);
            default:
                System.out.println("Invalid vehicle type, only CAR, BIKE and Truck are allowed.");
                return;

        }
        vehicles.add(newVehicle);
        System.out.println("Vehicles Added Successfully, "+newVehicle);


    }

    public void removeVehicle(String regiNum) {
    }

    public void viewAllVehicle() {

    }

    public void viewAvailableVehicles() {
        
    }
}
