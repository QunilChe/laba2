package Task3;
import java.util.Date;


public class Ticket {
    private String ticketId;
    private Passenger passenger;
    private Flight flight;
    private Date saleDate;
    private double price;
    private boolean isCancelled;

    public Ticket(String ticketId, Passenger passenger, Flight flight, double price) {
        this.ticketId = ticketId;
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
        this.isCancelled = false;
    }

    // Метод для продажу квитка
    public void sellTicket(Date saleDate) {
        if (!isCancelled) {
            if (this.saleDate == null) {
                this.saleDate = saleDate;
                System.out.println(" sold.");
            } else {
                System.out.println("its already sold.");
            }
        } else {
            System.out.println("its canseld ticket.");
        }
    }

    // Метод для скасування квитка
    public void cancelTicket() {
        if (!isCancelled) {
            isCancelled = true;
            System.out.println("ticket was canseld.");
        } else {
            System.out.println("already canseld.");
        }
    }

    // Геттери та сеттери для інших полів класу Ticket
    public String getTicketId() {
        return ticketId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public double getPrice() {
        return price;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

}
