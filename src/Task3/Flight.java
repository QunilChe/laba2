package Task3;
import java.util.Date;

public class Flight {
    private String flightNumber;
    private Aircraft aircraft;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;

    public Flight(String flightNumber, Aircraft aircraft, Airport departureAirport, Airport arrivalAirport, Date departureTime, Date arrivalTime) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}