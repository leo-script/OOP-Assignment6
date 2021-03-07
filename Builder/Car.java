package Builder;

public class Car {
    private int seats;
    private String engine;
    private String TripComputer;
    private String GPS;

    public int getSeats() {
        return this.seats;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getTripComputer() {
        return this.TripComputer;
    }

    public String getGPS() {
        return this.GPS;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(String tripComputer) {
        this.TripComputer = tripComputer;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + this.seats +
                ", engine='" + this.engine + '\'' +
                ", TripComputer='" + this.TripComputer + '\'' +
                ", GPS='" + this.GPS + '\'' +
                '}';
    }

}
