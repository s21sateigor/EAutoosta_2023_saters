package service;

import model.BusTrip;
import model.Cashier;
import model.Employee;
import model.Station;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MainService {
    public static void main(String[] args) throws Exception {
        ArrayList<BusTrip> busTrips = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Station> stations = new ArrayList<>();

        Cashier cashier = new Cashier("Baiba", "Straujupe", "010202-22143", LocalDate.now());
        Cashier cashier2 = new Cashier("Lats", "Straujupis", "010200-22143", LocalDate.now());

        System.out.println(cashier);
        System.out.println(cashier2);
        
    }
}
