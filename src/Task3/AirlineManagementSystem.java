package Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineManagementSystem {
    private List<Ticket> tickets;

    public AirlineManagementSystem() {
        this.tickets = new ArrayList<>();
    }

    // Метод для додавання квитка до системи
    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    // Метод для розрахунку доходів за заданий період часу
    public double calculateRevenueForPeriod(Date startDate, Date endDate) {
        double revenue = 0.0;

        for (Ticket ticket : tickets) {
            Date saleDate = ticket.getSaleDate();

            // Перевіряємо, чи квиток був проданий в межах заданого періоду
            if (!ticket.isCancelled() && saleDate != null && saleDate.after(startDate) && saleDate.before(endDate)) {
                revenue += ticket.getPrice();
            }
        }

        return revenue;
    }


    private List<Flight> flights;


    // Додавання рейсу
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    // Отримання списку рейсів
    public List<Flight> getFlights() {
        return flights;
    }

    // Інші методи для управління системою, наприклад, додавання/видалення рейсів, пасажирів, літаків і т. д.
}
