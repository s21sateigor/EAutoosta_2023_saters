package model;

import java.time.LocalDate;

public class Cashier extends Employee {
    private int id;
    private static int cashierID = 1;


    public Cashier(){
        super();
        id = cashierID;
        cashierID++;
    }

    public Cashier(String name, String surname, String personCode, LocalDate contractDate) throws Exception {
        super(name, surname, personCode, contractDate);
        id = cashierID;
        cashierID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                "; name= " + getName() +
                "; surname= " + getSurname() +
                "; personCode= " + getPersonCode() +
                "; contractDate= " + getContractDate() +
                '}';
    }
}
