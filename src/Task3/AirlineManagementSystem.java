package Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineManagementSystem {
    private List<Flight> flights;

    public AirlineManagementSystem() {
        flights = new ArrayList<>();
    }

    // Method to create a flight
    public void createFlight(String flightNumber, Aircraft aircraft, Airport departureAirport, Airport arrivalAirport, Date departureTime, Date arrivalTime) {
        Flight flight = new Flight(flightNumber, aircraft, departureAirport, arrivalAirport, departureTime, arrivalTime);
        flights.add(flight);
    }

    // Include the getFlights() method in the AirlineManagementSystem class
    public List<Flight> getFlights() {
        return flights;
    }

    // Method to delete a flight by flight number
    public void deleteFlight(String flightNumber) {
        Flight flightToRemove = null;
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                flightToRemove = flight;
                break;
            }
        }
        if (flightToRemove != null) {
            flights.remove(flightToRemove);
        }
    }

    // Method to edit a flight by flight number
    public void editFlight(String flightNumber, String newFlightNumber, Aircraft newAircraft, Airport newDepartureAirport, Airport newArrivalAirport, Date newDepartureTime, Date newArrivalTime) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                flight.setFlightNumber(newFlightNumber);
                flight.setAircraft(newAircraft);
                flight.setDepartureAirport(newDepartureAirport);
                flight.setArrivalAirport(newArrivalAirport);
                flight.setDepartureTime(newDepartureTime);
                flight.setArrivalTime(newArrivalTime);
                break;
            }
        }
    }

    // Method to display flight schedules
    public void displayFlightSchedule() {
        for (Flight flight : flights) {
            System.out.println("Flight: " + flight.getFlightNumber());
            System.out.println("Aircraft: " + flight.getAircraft().getModel());
            System.out.println("Departure from: " + flight.getDepartureAirport().getName());
            System.out.println("Destination: " + flight.getArrivalAirport().getName());
            System.out.println("Departure time: " + flight.getDepartureTime());
            System.out.println("Arrival time: " + flight.getArrivalTime());
            System.out.println();
        }
    }

    // Method to create a flight schedule (this can be additional logic)
    public void createFlightSchedule() {
        // Add logic to create a flight schedule here
    }
}
