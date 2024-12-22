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
        System.out.println("\nCustomer Menu:");
        System.out.println("1. Register Customer");
        System.out.println("2. View Available Vehicles");
        System.out.println("3. Book a Vehicle");
        System.out.println("4. Return a Vehicle");
        System.out.println("5. View Booking History");
        System.out.println("6. Make Payment");
        System.out.print("Choose an option: ");

        int customerChoice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (customerChoice) {
            case 1:
                System.out.print("Enter customer name: ");
                String name = sc.nextLine();
                System.out.print("Enter customer contact number: ");
                String contact = sc.nextLine();
                customerService.registerCustomer(name, contact);
                break;

            case 2:
                vehicleService.viewAvailableVehicles();
                break;

            case 3:
                System.out.print("Enter vehicle registration number to book: ");
                String regNumber = sc.nextLine();
                System.out.print("Enter rental duration in hours: ");
                int hours = sc.nextInt();
                bookingService.bookVehicle(regNumber, hours, vehicleService);
                break;

            case 4:
                System.out.print("Enter vehicle registration number to return: ");
                String returnRegNumber = sc.nextLine();
                bookingService.returnVehicle(returnRegNumber, vehicleService);
                break;

            case 5:
                bookingService.viewBookingHistory();
                break;

            case 6:
                System.out.print("Enter booking ID for payment: ");
                int bookingId = sc.nextInt();
                paymentService.processPayment(bookingId);
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
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