package model;

public class Station
{
    private int id;
    private static int stationID = 1;
    private String title;
    private String workingHour;
    private City city;

    public Station(){
        super();
    }

    public Station(City city, String title, String workingHour){
        super();
    }

    public City getCity(){
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(String workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", workingHour='" + workingHour + '\'' +
                '}';
    }
}
