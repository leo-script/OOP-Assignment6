package Builder;

public class Manual {
    private String manual_seats;
    private String manual_engine;
    private String manual_TripComputer;
    private String manual_GPS;

    public String getManual_seats() {
        return this.manual_seats;
    }

    public String getManual_engine() {
        return this.manual_engine;
    }

    public String getManual_TripComputer() {
        return this.manual_TripComputer;
    }

    public String getManual_GPS() {
        return this.manual_GPS;
    }

    public void setManual_seats(String manual_seats) {
        this.manual_seats = manual_seats;
    }

    public void setManual_engine(String manual_engine) {
        this.manual_engine = manual_engine;
    }

    public void setManual_TripComputer(String manual_TripComputer) {
        this.manual_TripComputer = manual_TripComputer;
    }

    public void setManual_GPS(String manual_GPS) {
        this.manual_GPS = manual_GPS;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "manual_seats='" + this.manual_seats + '\'' +
                ", manual_engine='" + this.manual_engine + '\'' +
                ", manual_TripComputer='" + this.manual_TripComputer + '\'' +
                ", manual_GPS='" + this.manual_GPS + '\'' +
                '}';
    }
}
