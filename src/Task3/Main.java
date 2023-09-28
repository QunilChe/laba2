package Task3;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Airline Management System
        // AirlineManagementSystem airlineSystem = new AirlineManagementSystem();

        // Creating aircraft
        Aircraft aircraft1 = new Aircraft("Boeing 737", 150);
        Aircraft aircraft2 = new Aircraft("Airbus A320", 180);

        // Displaying aircraft information
        System.out.println("Aircraft 1: Model - " + aircraft1.getModel() + ", Capacity - " + aircraft1.getCapacity());
        System.out.println("Aircraft 2: Model - " + aircraft2.getModel() + ", Capacity - " + aircraft2.getCapacity());

        // Editing aircraft data
        aircraft1.editModel("Boeing 747");
        aircraft2.editCapacity(200);

        // Displaying updated aircraft information
        System.out.println("Aircraft 1 (after editing): Model - " + aircraft1.getModel() + ", Capacity - " + aircraft1.getCapacity());
        System.out.println("Aircraft 2 (after editing): Model - " + aircraft2.getModel() + ", Capacity - " + aircraft2.getCapacity());

        // Creating airports
        Airport airport1 = new Airport("JFK", "John F. Kennedy International Airport");
        Airport airport2 = new Airport("LAX", "Los Angeles International Airport");

        // Displaying airport information
        System.out.println("Airport 1: Code - " + airport1.getCode() + ", Name - " + airport1.getName());
        System.out.println("Airport 2: Code - " + airport2.getCode() + ", Name - " + airport2.getName());

        // Editing airport data
        airport1.setName("JFK Airport");
        airport2.setCode("LAX1");

        // Displaying updated airport information
        System.out.println("Airport 1 (after editing): Code - " + airport1.getCode() + ", Name - " + airport1.getName());
        System.out.println("Airport 2 (after editing): Code - " + airport2.getCode() + ", Name - " + airport2.getName());

        // Creating passengers
        Passenger passenger1 = new Passenger("John Smith", "AB123456");
        Passenger passenger2 = new Passenger("Alice Johnson", "CD789012");

        // Displaying passenger information
        System.out.println("Passenger 1: Name - " + passenger1.getName() + ", Passport Number - " + passenger1.getPassportNumber());
        System.out.println("Passenger 2: Name - " + passenger2.getName() + ", Passport Number - " + passenger2.getPassportNumber());

        // Editing passenger data
        passenger1.setName("John Johnson");
        passenger2.setPassportNumber("EF456789");

        // Displaying updated passenger information
        System.out.println("Passenger 1 (after editing): Name - " + passenger1.getName() + ", Passport Number - " + passenger1.getPassportNumber());
        System.out.println("Passenger 2 (after editing): Name - " + passenger2.getName() + ", Passport Number - " + passenger2.getPassportNumber());

        System.out.println("RACES");
        // AirlineManagementSystem.displayFlightSchedule;

        // Creating an airline management system object with an existing list of flights
        AirlineManagementSystem airlineSystem = new AirlineManagementSystem();

        // Creating flights
        airlineSystem.createFlight("FL123", aircraft1, airport1, airport2, new Date(), new Date());
        airlineSystem.createFlight("FL456", aircraft2, airport2, airport1, new Date(), new Date());

        // Displaying flight schedule
        System.out.println("Flight Schedule:");
        airlineSystem.displayFlightSchedule();

        // Editing a flight
        airlineSystem.editFlight("FL123", "FL789", aircraft1, airport1, airport2, new Date(), new Date());

        // Displaying the updated flight schedule
        System.out.println("Updated Flight Schedule:");
        airlineSystem.displayFlightSchedule();

        // Ticket sales
        Ticket ticket1 = new Ticket("T123", passenger1, airlineSystem.getFlights().get(0), 100.0);
        Ticket ticket2 = new Ticket("T456", passenger2, airlineSystem.getFlights().get(1), 120.0);

        // Ticket sales
        ticket1.sellTicket(new Date());
        ticket2.sellTicket(new Date());

        // Displaying ticket data
        System.out.println("Ticket Data:");
        System.out.println("Ticket 1: " + ticket1.getTicketId() + ", Sold on: " + ticket1.getSaleDate());
        System.out.println("Ticket 2: " + ticket2.getTicketId() + ", Sold on: " + ticket2.getSaleDate());

        // Ticket cancellation
        // ticket1.cancelTicket();
        ticket2.cancelTicket();

        // Displaying ticket status
        System.out.println("Ticket Status:");
        System.out.println("Ticket 1 is canceled: " + ticket1.isCancelled());
        System.out.println("Ticket 2 is canceled: " + ticket2.isCancelled());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.SEPTEMBER, 1); // September 1, 2023
        Date startDate = calendar.getTime();

        calendar.add(Calendar.MONTH, 6); // Adding 6 months to the date
        Date endDate = calendar.getTime();

        double totalRevenue = 0.0;

        if (!ticket1.isCancelled()) {
            Date saleDate = ticket1.getSaleDate();
            if (saleDate != null && saleDate.after(startDate) && saleDate.before(endDate)) {
                totalRevenue += ticket1.getPrice();
            }
        }

        if (!ticket2.isCancelled()) {
            Date saleDate = ticket2.getSaleDate();
            if (saleDate != null && saleDate.after(startDate) && saleDate.before(endDate)) {
                totalRevenue += ticket2.getPrice();
            }
        }

        System.out.println("Total revenue for the period: " + totalRevenue);
    }
}
