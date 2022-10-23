import Drivers.Driver;
import Drivers.DriversB;
import Drivers.DriversC;
import Drivers.DriversD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {

        Bus hyundai = new Bus("Hyundai","H350", 2.2f);
        Bus man = new Bus("MAN", "Lion’s Coach", 3.5f);
        Bus volvo = new Bus("Volvo", "9700", 3.8f);
        Bus foton = new Bus("Foton", "View", 2.4f);

        Car bmv = new Car("BMW", "X6", 2.8f);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f);
        Car bmvZ8 = new Car("BMW", "Z8", 3.0f);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f);

        Truck kamaz = new Truck("КамАЗ", "54901", 3.8f);
        Truck volkswagen = new Truck("Volkswagen", "Crafter", 3.2f);
        Truck zil = new Truck("ЗИЛ", "130", 3.0f);
        Truck gaz = new Truck("ГАЗель", "-Next", 2.5f);


        Driver vinDiesel = new DriversB("Вин Дизель", 4, bmv);
        System.out.println("vinDiesel = " + vinDiesel);
        Driver lightningMcQueen = new DriversC("Молния МакКуин", 6, zil);
        System.out.println("lightningMcQueen = " + lightningMcQueen);
        Driver paulWalker = new DriversD("Пол Уокер", 12, man);
        System.out.println("paulWalker = " + paulWalker);

    }
}