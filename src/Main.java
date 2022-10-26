import Drivers.Driver;
import Drivers.DriversB;
import Drivers.DriversC;
import Drivers.DriversD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;
import Transport.*;
public class Main {
    public static void main(String[] args) {

        Bus hyundai = new Bus("Hyundai","H350", 2.2f, BusCapacityType.LARGE);
        Bus man = new Bus("MAN", "Lion’s Coach", 3.5f, BusCapacityType.MEDIUM);
        Bus volvo = new Bus("Volvo", "9700", 3.8f, BusCapacityType.MEDIUM);
        Bus foton = new Bus("Foton", "View", 2.4f, BusCapacityType.EXTRA_SMALL);

        Car bmv = new Car("BMW", "X6", 2.8f, Type.COUPE);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, Type.HATCHBACK);
        Car bmvZ8 = new Car("BMW", "Z8", 3.0f, Type.SEDAN);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f, Type.CROSSOVER);

        Truck kamaz = new Truck("КамАЗ", "54901", 3.8f, TruckLoadCapacity.N3);
        Truck volkswagen = new Truck("Volkswagen", "Crafter", 3.2f, TruckLoadCapacity.N1);
        Truck zil = new Truck("ЗИЛ", "130", 3.0f, TruckLoadCapacity.N2);
        Truck gaz = new Truck("ГАЗель", "-Next", 2.5f, TruckLoadCapacity.N2);


        Driver vinDiesel = new DriversB("Вин Дизель", 4, bmv);
        System.out.println("vinDiesel = " + vinDiesel);
        Driver lightningMcQueen = new DriversC("Молния МакКуин", 6, zil);
        System.out.println("lightningMcQueen = " + lightningMcQueen);
        Driver paulWalker = new DriversD("Пол Уокер", 12, man);
        System.out.println("paulWalker = " + paulWalker);

        System.out.println("gaz.toString() = " + gaz.toString());
        System.out.println("lada.toString() = " + hyundai.toString());

        volkswagen.type();
        man.type();
        volvo.type();
    }
}