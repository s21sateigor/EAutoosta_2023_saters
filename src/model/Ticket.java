package model;

import java.time.LocalDateTime;

public class Ticket
{
    private int id;
    private static int ticketID = 1;
    private LocalDateTime localDateTime;
    private int discount;
    private boolean isVIP;
    private float price;
    private Cashier cashier;


    public Ticket() {
        super();
        id = ticketID;
        ticketID++;
    }

    public Ticket(Cashier cashier, int discount, boolean isVIP, float price) {
        super();
        this.cashier = cashier;
        this.discount = discount;
        this.isVIP = isVIP;
        this.price = price;
        id = ticketID;
        ticketID++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", discount=" + discount +
                ", isVIP=" + isVIP +
                ", price=" + price +
                '}';
    }
}
