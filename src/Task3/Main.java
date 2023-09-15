package Task3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення літаків
        Aircraft aircraft1 = new Aircraft("Boeing 737", 150);
        Aircraft aircraft2 = new Aircraft("Airbus A320", 180);

        // Відображення інформації про літаки
        System.out.println("Літак 1: Модель - " + aircraft1.getModel() + ", Вмістимість - " + aircraft1.getCapacity());
        System.out.println("Літак 2: Модель - " + aircraft2.getModel() + ", Вмістимість - " + aircraft2.getCapacity());

        // Редагування даних про літаки
        aircraft1.editModel("Boeing 747");
        aircraft2.editCapacity(200);


        // Відображення оновленої інформації про літаки
        System.out.println("Літак 1 (після редагування): Модель - " + aircraft1.getModel() + ", Вмістимість - " + aircraft1.getCapacity());
        System.out.println("Літак 2 (після редагування): Модель - " + aircraft2.getModel() + ", Вмістимість - " + aircraft2.getCapacity());


        Airport airport1 = new Airport("JFK", "John F. Kennedy International Airport");
        Airport airport2 = new Airport("LAX", "Los Angeles International Airport");

        // Відображення інформації про аеропорти
        System.out.println("Аеропорт 1: Код - " + airport1.getCode() + ", Назва - " + airport1.getName());
        System.out.println("Аеропорт 2: Код - " + airport2.getCode() + ", Назва - " + airport2.getName());

        // Редагування даних про аеропорти
        airport1.setName("JFK Airport");
        airport2.setCode("LAX1");

        // Відображення оновленої інформації про аеропорти
        System.out.println("Аеропорт 1 (після редагування): Код - " + airport1.getCode() + ", Назва - " + airport1.getName());
        System.out.println("Аеропорт 2 (після редагування): Код - " + airport2.getCode() + ", Назва - " + airport2.getName());


        Flight flight1 = new Flight("FL123", aircraft1, airport1, airport2, new Date(), new Date());
        Flight flight2 = new Flight("FL456", aircraft2, airport2, airport1, new Date(), new Date());

        // Відображення інформації про рейси
        System.out.println("Рейс 1: Номер - " + flight1.getFlightNumber() + ", Модель літака - " + flight1.getAircraft().getModel());
        System.out.println("Рейс 2: Номер - " + flight2.getFlightNumber() + ", Модель літака - " + flight2.getAircraft().getModel());

        // Редагування даних про рейси
        flight1.setFlightNumber("FL789");
        flight2.getAircraft().editModel("Boeing 777");

        // Відображення оновленої інформації про рейси
        System.out.println("Рейс 1 (після редагування): Номер - " + flight1.getFlightNumber() + ", Модель літака - " + flight1.getAircraft().getModel());
        System.out.println("Рейс 2 (після редагування): Номер - " + flight2.getFlightNumber() + ", Модель літака - " + flight2.getAircraft().getModel());


        Passenger passenger1 = new Passenger("John Smith", "AB123456");
        Passenger passenger2 = new Passenger("Alice Johnson", "CD789012");

        // Відображення інформації про пасажирів
        System.out.println("Пасажир 1: Ім'я - " + passenger1.getName() + ", Номер паспорта - " + passenger1.getPassportNumber());
        System.out.println("Пасажир 2: Ім'я - " + passenger2.getName() + ", Номер паспорта - " + passenger2.getPassportNumber());

        // Редагування даних про пасажирів
        passenger1.setName("John Johnson");
        passenger2.setPassportNumber("EF456789");

        // Відображення оновленої інформації про пасажирів
        System.out.println("Пасажир 1 (після редагування): Ім'я - " + passenger1.getName() + ", Номер паспорта - " + passenger1.getPassportNumber());
        System.out.println("Пасажир 2 (після редагування): Ім'я - " + passenger2.getName() + ", Номер паспорта - " + passenger2.getPassportNumber());


        // Створення системи управління авіакомпанією
        AirlineManagementSystem airlineSystem = new AirlineManagementSystem();

        // Додавання рейсів до системи
        airlineSystem.addFlight(flight1);
        airlineSystem.addFlight(flight2);

        // Відображення розкладів польотів
        List<Flight> flights = airlineSystem.getFlights();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Розклад польотів:");

        for (Flight flight : flights) {
            System.out.println("Рейс: " + flight.getFlightNumber());
            System.out.println("Літак: " + flight.getAircraft().getModel());
            System.out.println("Відправлення з: " + flight.getDepartureAirport().getName() +
                    " (" + flight.getDepartureAirport().getCode() + ")");
            System.out.println("Призначення: " + flight.getArrivalAirport().getName() +
                    " (" + flight.getArrivalAirport().getCode() + ")");
            System.out.println("Час відправлення: " + dateFormat.format(flight.getDepartureTime()));
            System.out.println("Час прибуття: " + dateFormat.format(flight.getArrivalTime()));
            System.out.println();


        }
    }
}
