package Task3;
import java.util.ArrayList;
import java.util.List;

public class FlightSchedule {
    private List<Flight> flights;

    public FlightSchedule() {
        this.flights = new ArrayList<>();
    }

    // Метод для додавання рейсу до розкладу
    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    // Метод для видалення рейсу з розкладу
    public void removeFlight(Flight flight) {
        this.flights.remove(flight);
    }

    // Інші методи, наприклад, отримання списку рейсів, пошук рейсу за номером і т. д.
}
