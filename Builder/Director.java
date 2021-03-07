package Builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8 Engine");
        builder.setTripComputer("Allian");
        builder.setGPS("iGEO GPS");
    }

}
