package Bus;

public class Bus {
    private String name;
    private String plateNumber;
    private String routeNumber;
    private int passengers;

    public Bus(String name, String plateNumber, String routeNumber, int passengers) {
        this.name = name;
        this.plateNumber = plateNumber;
        this.routeNumber = routeNumber;
        this.passengers = passengers;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

}
