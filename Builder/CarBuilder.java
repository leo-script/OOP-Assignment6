package Builder;

public class CarBuilder implements Builder{
    private Car car;
    public void reset() {
        car = new Car();
    }
    @Override
    public void setSeats(int seats){
        car.setSeats(seats);
    }
    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }
    @Override
    public void setTripComputer(String trip_computer) {
        car.setTripComputer(trip_computer);
    }
    @Override
    public void setGPS(String GPS) {
        car.setGPS(GPS);
    }
    public Car getResult() {
        return this.car;
    }

}
