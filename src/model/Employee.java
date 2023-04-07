package model;

//import java.util.Date;
import java.time.LocalDate;

public class Employee extends Person{
    private LocalDate contractDate;
    private String contractNumber;

    public LocalDate getContractDate() {
        return contractDate;
    }

    public String getContractNumber() {
        return contractNumber;
    }


    //kods no https://java2blog.com/check-if-date-is-between-two-dates-java/
    public void setContractDate(LocalDate inputContractDate) throws Exception {
        LocalDate theStartDate = LocalDate.of(2023,3,24);
        if(inputContractDate.isAfter(theStartDate)){
            this.contractDate = inputContractDate;
        } else {
            throw new Exception("Incorrect Date");
        }
    }

    public void generateContractNumber(String name, String surname){
        int year = LocalDate.now().getYear();
        String firstInitial = name.substring(0,1);
        String lastInitial = surname.substring(0,1);
        this.contractNumber = year + "_" + firstInitial.toUpperCase() + "_" + lastInitial.toUpperCase();
    }

    public void setContractNumber(String name, String surname) {
        generateContractNumber(name, surname);
    }

    public Employee(){
        super();
        this.contractDate = LocalDate.now();
        this.contractNumber = "";
    }

    public Employee(String name, String surname, String personCode, LocalDate contractDate) throws Exception {
        super(name, surname, personCode);
        setContractDate(contractDate);
        generateContractNumber(name, surname);
    }

}
