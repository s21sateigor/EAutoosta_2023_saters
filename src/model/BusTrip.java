package model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class BusTrip {
    private int id;
    private static int busTripID = 1;
    private LocalDateTime fromDateTime;
    private LocalDateTime toDateTime;
    private Station stationTo;
    private Station stationFrom;
    private int howManySeats;
    private BusDriver busDriver;
    private PriorityQueue<Ticket> tickets;

    public BusTrip(Station stationFrom, Station stationTo, LocalDateTime fromDateTime, LocalDateTime toDateTime, BusDriver busDriver, int howManySeats) throws Exception {
        setId(busTripID++);
        setStationFrom(stationFrom);
        setStationTo(stationTo);
        setFromDateTime(fromDateTime);
        setToDateTime(toDateTime);
        setBusDriver(busDriver);
        setHowManySeats(howManySeats);
        this.tickets = new PriorityQueue<>();
    }

    public void addTicketToBusTrip(Ticket ticket) {
        tickets.add(ticket);
    }

    public void changeBusDriver(BusDriver busDriver) throws Exception {
        ArrayList<BusCategory> busCategory = busDriver.getCategories();
        if (howManySeats < 30 && busCategory.equals(BusCategory.largebus) ) {
            throw new Exception("The driver must have minibus category");
        }
        if (howManySeats >= 30 && busCategory.equals(BusCategory.minibus)) {
            throw new Exception("The driver must have largebus category");
        }
        this.busDriver = busDriver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Station getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(Station stationFrom) {
        if(stationFrom != stationTo){
            this.stationFrom = stationFrom;
        }
    }

    public Station getStationTo() {
        return stationTo;
    }

    public void setStationTo(Station stationTo) {
        if(stationTo != stationFrom){
            this.stationTo = stationTo;
        }
    }

    public LocalDateTime getFromDateTime() {
        return fromDateTime;
    }

    public void setFromDateTime(LocalDateTime fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    public LocalDateTime getToDateTime() {
        return toDateTime;
    }

    public void setToDateTime(LocalDateTime toDateTime) {
        this.toDateTime = toDateTime;
    }

    public int getHowManySeats() {
        return howManySeats;
    }

    public void setHowManySeats(int howManySeats) {
        this.howManySeats = howManySeats;
    }

    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) throws Exception {
        ArrayList<BusCategory> busCategory = busDriver.getCategories();
        if (howManySeats < 30 && busCategory.equals(BusCategory.largebus) ) {
            throw new Exception("The driver must have minibus category");
        }
        if (howManySeats >= 30 && busCategory.equals(BusCategory.minibus) ) {
            throw new Exception("The driver must have largebus category");
        }
        this.busDriver = busDriver;
    }

    public PriorityQueue<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(PriorityQueue<Ticket> tickets) {
        this.tickets = tickets;
    }
    @Override
    public String toString() {
        return "BusTrip{" +
                "id=" + id +
                ", fromDateTime=" + fromDateTime +
                ", toDateTime=" + toDateTime +
                ", stationTo=" + stationTo +
                ", stationFrom=" + stationFrom +
                ", howManySeats=" + howManySeats +
                ", busDriver=" + busDriver +
                ", tickets=" + tickets +
                '}';
    }
}
