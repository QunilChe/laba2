package Task3;

import java.util.Date;

public class Ticket {
    private int ticketNumber;
    private Flight flight;
    private Passenger passenger;
    private double price;
    private boolean isCancelled;
    private Date saleDate; // Дата продажу квитка

    public Ticket(int ticketNumber, Flight flight, Passenger passenger, double price) {
        this.ticketNumber = ticketNumber;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
        this.isCancelled = false;
        this.saleDate = new Date(); // При створенні квитка автоматично встановлюємо поточну дату продажу
    }

    // Метод для отримання дати продажу квитка
    public Date getSaleDate() {
        return saleDate;
    }

    public void sellTicket(Date saleDate, Passenger passenger, Flight flight) {
        if (!isCancelled) {
            if (this.saleDate == null) {
                this.saleDate = saleDate;
                this.passenger = passenger;
                this.flight = flight;

                System.out.println("Квиток продано: Пасажир - " + passenger.getName() +
                        ", Рейс - " + flight.getFlightNumber() +
                        ", Дата продажу - " + saleDate);
            } else {
                System.out.println("Цей квиток вже проданий.");
            }
        } else {
            System.out.println("Цей квиток вже скасований і не може бути проданим.");
        }
    }
    // Метод для скасування квитка
    public void cancelTicket() {
        if (!isCancelled) {
            // Ваша логіка скасування квитка, наприклад, повернення коштів пасажиру і т. д.
            isCancelled = true;
        } else {
            System.out.println("Цей квиток вже скасований.");
        }
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }
    // Інші методи та геттери/сеттери, які можуть бути потрібні
}
