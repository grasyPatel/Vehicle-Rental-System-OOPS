import model.Customer;
import service.BookingService;
import service.CustomerService;
import service.PaymentService;
import service.VehicleService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BookingService bookingService=new BookingService();
        VehicleService vehicleService=new VehicleService();
        PaymentService paymentService=new PaymentService();
        CustomerService customerService=new CustomerService();
        Scanner sc=new Scanner(System.in);

        boolean running =true;

        System.out.println("Welcome to Vehicle Rental Platform!!!");

        while (running){
            System.out.println("\n Main Menu:- ");
            System.out.println("1. Administrator Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose one option : ");

            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    handleAdminMenu(sc,vehicleService);
                    break;
                case 2:
                    handleUserMenu(sc,bookingService,customerService,paymentService,vehicleService);
                    break;

                case 3:
                    running=false;
                    System.out.println("Exiting the platform, Goodbye!!");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again...");

            }
        }



    }

    private static void handleUserMenu(Scanner sc, BookingService bookingService, CustomerService customerService, PaymentService paymentService, VehicleService vehicleService) {
    }

    private static void handleAdminMenu(Scanner sc, VehicleService vehicleService) {
        System.out.println("\n Administrator Menu:  ");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Remove Vehicle");
        System.out.println("3. View All Vehicle");
        System.out.print("Choose one option : ");

        int choice= sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                System.out.print("Enter the vehicle type (Car/bike/truck): ");
                String type=sc.nextLine();
                System.out.print("Enter the vehicle brand:  ");
                String brand=sc.nextLine();

                System.out.print("Enter vehicle registration number: ");
                String registrationNumber=sc.nextLine();
                System.out.print("Enter price per day for the vehicle: ");
                double pricePerDay= sc.nextDouble();

                vehicleService.addVehicle(type,brand,registrationNumber,pricePerDay);
                break;
            case 2:
                System.out.print("Enter Vehicle Registration Number to remove:");
                String RegiNum=sc.next();
                vehicleService.removeVehicle(RegiNum);
                break;
            case 3:
                vehicleService.viewAllVehicle();
                break;
            default:
                System.out.print("Invalid choice, Please try again...");

        }


    }
}