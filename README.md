# Vehicle Rental System

## Overview
The Vehicle Rental System is a Java-based application demonstrating core Object-Oriented Programming (OOP) concepts such as Inheritance, Abstraction, and Encapsulation. The system enables users to rent various types of vehicles, manage bookings, and calculate rental costs.

---

## Features

1. **Manage Vehicles:**
   - Add, update, and remove vehicles.
   - Manage different types of vehicles (cars, bikes, trucks).
2. **Booking System:**
   - Rent vehicles based on availability.
   - Return rented vehicles.
3. **Cost Calculation:**
   - Calculate rental costs based on vehicle type and rental duration.
4. **User-Friendly Interface:**
   - Simple console-based menu for sellers and customers.

---

## Project Structure
```
Vehicle_Rental_System/
│
├── src/
│   ├── models/        # Core OOP classes
│   │   ├── Vehicle.java
│   │   ├── Car.java
│   │   ├── Bike.java
│   │   ├── Truck.java
│   │   ├── Booking.java
│   │   └── Customer.java
│   ├── services/      # Service layer for operations
│   │   ├── VehicleService.java
│   │   ├── BookingService.java
│   │   └── CustomerService.java
│   |
│   │  
│   └── Main.java      # Entry point
├── README.md          # Project documentation
└── .gitignore         # Git ignored files
```

---

## Technologies Used
- **Java:** Core programming language.
- **Git:** Version control.
- **IDE:** IntelliJ IDEA or any Java-supported IDE.

---

## Installation and Usage

### Prerequisites
- Java Development Kit (JDK) installed.
- Git installed.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/grasyPatel/Vehicle-Rental-System-OOPS.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Vehicle_Rental_System
   ```
3. Compile the code:
   ```bash
   javac src/Main.java
   ```
4. Run the application:
   ```bash
   java src.Main
   ```

---

## Classes and Responsibilities

### Models
- **Vehicle:** Base class for all vehicles.
- **Car, Bike, Truck:** Inherit from `Vehicle` and represent specific vehicle types.
- **Booking:** Represents rental transactions.
- **Customer:** Manages customer information.

### Services
- **VehicleService:** Handles adding, updating, and removing vehicles.
- **BookingService:** Manages bookings and rental cost calculations.
- **CustomerService:** Handles customer information and operations.


---

## Example Usage

1. **Add a Vehicle:**
   - Add a car, bike, or truck with details such as name, type, and rate.

2. **Book a Vehicle:**
   - Enter customer details and vehicle ID to book.

3. **Return a Vehicle:**
   - Calculate and display the total rental cost.

4. **View Available Vehicles:**
   - Display all available vehicles.

