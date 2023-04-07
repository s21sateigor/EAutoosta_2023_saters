package model;

import java.time.LocalDate;

public class Cashier extends Employee {
    private static int cashierID;


    public Cashier(String name, String surname, String personCode, LocalDate contractDate, int cashierID) {
        super(name, surname, personCode, contractDate);
        this.cashierID = cashierID;
    }
}
