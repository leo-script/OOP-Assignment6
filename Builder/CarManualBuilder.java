package Builder;

public class CarManualBuilder implements Builder {
    private Manual manual;
    public void reset() {
        manual = new Manual();
    }
    @Override
    public void setSeats(int seats) {
        manual.setManual_seats("Car have " + seats + " seats.");
    }
    @Override
    public void setEngine(String engine) {
        manual.setManual_engine("Car engine is " + engine + ".");
    }
    @Override
    public void setTripComputer(String trip_computer) {
        manual.setManual_TripComputer("Car trip computer is " + trip_computer + ".");
    }
    @Override
    public void setGPS(String gps) {
        manual.setManual_GPS("Car GPS model is " + gps + ".");
    }
    public Manual getResult() {
        return this.manual;
    }
}
