package service;

import model.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class MainService {
    public static void main(String[] args) throws Exception {
        ArrayList<BusTrip> busTrips = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Station> stations = new ArrayList<>();

        ArrayList<Cashier> cashiers = new ArrayList<>();
        Cashier cashier1 = new Cashier("Baiba", "Straujupe", "010202-22143", LocalDate.now());
        Cashier cashier2 = new Cashier("Lats", "Straujupis", "010200-22133", LocalDate.now());
        Cashier cashier3 = new Cashier("Raimonds", "Straujupis", "010210-22433", LocalDate.now());
        Cashier cashier4 = new Cashier("Zigmunds", "Straujupis", "010290-22223", LocalDate.now());
        cashiers.add(cashier1);
        cashiers.add(cashier2);
        cashiers.add(cashier3);
        cashiers.add(cashier4);
        System.out.println(cashier1);
        System.out.println(cashier2);

        //Finding cashier by personCode
        for(Cashier cashier: cashiers){
            if(cashier.getPersonCode().equals("010202-22143")){
                System.out.println("Cashier found: " + cashier);
            }
        }
        System.out.println();

        //Editing cashier data by personCode
        for(Cashier cashier: cashiers){
            if(cashier.getPersonCode().equals("010200-22133")){
                System.out.println("Cashier found: " + cashier);
                System.out.println("Changing cashiers name...");
                cashier.setName("Margots");
                System.out.println("Cashiers name changed successfully: " + cashier);
                System.out.println(cashier);
            }
        }
        System.out.println();

        //Deleting cashier by personCode
        ArrayList<Cashier> cashiersToRemove = new ArrayList<>();
        for (Cashier cashier : cashiers) {
            if (cashier.getPersonCode().equals("010200-22133")) {
                System.out.println("Cashier found: " + cashier);
                System.out.println("Adding the cashier to remove list...");
                cashiersToRemove.add(cashier);
            }
        }
        cashiers.removeAll(cashiersToRemove);
        System.out.println("Cashiers removed successfully!");
        //izveidoju atsevišķu sarakstu, jo ja atstāj tajā pašā tad met exception erroru, ka nedrikst izdzēst kamēr iterē cauri.

        System.out.println();
        System.out.println("Cashiers list now: ");
        for(Cashier cashier: cashiers){
            System.out.println(cashier);
        }


        System.out.println();
        System.out.println();
        ArrayList<BusCategory> categories = new ArrayList<>();

        //Adding new BusDriver

        ArrayList<BusDriver> busDrivers = new ArrayList<>();
//        categories.add(BusCategory.schoolbus);
        BusDriver busDriver1 = new BusDriver("Arvis", "Balodis", "090900-22334", LocalDate.now(), 4, categories);
        busDrivers.add(busDriver1);

        BusDriver busDriver2 = new BusDriver("Maigonis", "Vētra", "090900-22334", LocalDate.now(), 2, categories);
        busDriver2.addCategory(BusCategory.schoolbus);
        busDriver2.addCategory(BusCategory.minibus);
        busDrivers.add(busDriver2);

        BusDriver busDriver3 = new BusDriver("Ritvars", "Mežāzis", "080802-22211", LocalDate.now(), 7, categories);
        busDriver3.addCategory(BusCategory.largebus);
        busDrivers.add(busDriver3);
        //Finding all busdrivers by categories
        for(BusDriver busDriver: busDrivers){
            System.out.println(busDriver);
        }

        System.out.println();
        //Station
        Station station1 = new Station(City.Daugavpils, "Daugavpils SAO", "8.am. - 4.pm");
        Station station2 = new Station(City.Riga, "Rigas SAO", "8.am. - 4.pm");
        stations.add(station1);
        stations.add(station2);
        System.out.println(station1);
        System.out.println(station2);
        System.out.println();

        BusTrip busTrip1 = new BusTrip(station1, station2, LocalDateTime.of(2023,7,1,10,20),LocalDateTime.of(2023,7,1,12,30),busDriver1,40);
        System.out.println(busTrip1);
    }
}
