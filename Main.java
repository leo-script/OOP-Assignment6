import AbstractFactory.Config_abstract_factory;
import AbstractFactory.*;
import Builder.*;
import factory.*;
import factory.Application2;
import singleton.Database;

public class Main {

    public static void main(String[] args) throws Exception {

        // Singleton
        System.out.println("Singleton");
        Database foo = Database.getInstance();
        foo.query("SELECT ...");
        Database bar = Database.getInstance();
        bar.query("SELECT ...");
        System.out.println("******************************************\n");

        // Factory
        System.out.println("Factory");
        Application2 app2 = new Application2();
        app2.initialize(Config_factory.Windows).render();
        System.out.println("******************************************\n");

        // Abstract Factory
        System.out.println("Abstract factory");
        Application3 app3 = new Application3();
        app3.initialize(Config_abstract_factory.Mac);
        app3.createUI();
        app3.paint();
        System.out.println("******************************************\n");

        // Builder
        System.out.println("Builder");
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();

        CarManualBuilder builder1 = new CarManualBuilder();
        director.constructSportsCar(builder1);
        Manual manual = builder1.getResult();

        System.out.println(car);
        System.out.println(manual);
        System.out.println("******************************************\n");

    }


}

