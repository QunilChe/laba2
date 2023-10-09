package Task3;
import Task3.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineManagementSystem {
    private List<Flight> flights;
    private List<Ticket> tickets;

    public AirlineManagementSystem() {
        flights = new ArrayList<>();
        tickets = new ArrayList<>();
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
        flights.removeIf(flight -> flight.getFlightNumber().equals(flightNumber));
    }


    // Method to edit a flight by flight number
    public void editFlight(String flightNumber, String newFlightNumber, Aircraft newAircraft, Airport newDepartureAirport, Airport newArrivalAirport, Date newDepartureTime, Date newArrivalTime) {
        Flight flightToEdit = findFlightByNumber(flightNumber);
        if (flightToEdit != null) {
            flightToEdit.setFlightNumber(newFlightNumber);
            flightToEdit.setAircraft(newAircraft);
            flightToEdit.setDepartureAirport(newDepartureAirport);
            flightToEdit.setArrivalAirport(newArrivalAirport);
            flightToEdit.setDepartureTime(newDepartureTime);
            flightToEdit.setArrivalTime(newArrivalTime);
        }
    }

    private Flight findFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }


    // Method to display flight schedules
    public void displayFlightSchedule() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }






    public void sellTicket(Ticket ticket, Date saleDate) {
            if (!ticket.isCancelled()) {
                if (ticket.getSaleDate() == null) {
                    ticket.sellTicket(saleDate);
                } else {
                    System.out.println("Квиток вже проданий.");
                }
            } else {
                System.out.println("Квиток скасований.");
            }
        }

        public void cancelTicket(Ticket ticket) {
            if (!ticket.isCancelled()) {
                ticket.cancelTicket();
            } else {
                System.out.println("Квиток вже скасований.");
            }
        }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public double calculateTotalRevenue(Date startDate, Date endDate) {
        double totalRevenue = 0.0;
        for (Ticket ticket : tickets) { // Припустимо, що tickets - це список всіх квитків у системі
            if (!ticket.isCancelled()) {
                Date saleDate = ticket.getSaleDate();
                if (saleDate != null && saleDate.after(startDate) && saleDate.before(endDate)) {
                    totalRevenue += ticket.getPrice();
                }
            }
        }
        return totalRevenue;
    }
}
