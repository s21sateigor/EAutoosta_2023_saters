package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class BusDriver extends Employee {
    private ArrayList<BusCategory> categories = new ArrayList<>();
    private int experience;

    public BusDriver(String name, String surname, String personCode, LocalDate contractDate, int experience, ArrayList<BusCategory> categories) throws Exception {
        super(name, surname, personCode, contractDate);
        setExperience(experience);

    }

    public ArrayList<BusCategory> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<BusCategory> categories) {
        this.categories = categories;
    }

    public void addCategory(BusCategory busCategory){
        categories.add(busCategory);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void removeCategory(BusCategory busCategory){
        categories.add(busCategory);
    }
}
