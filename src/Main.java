import Drivers.Driver;
import Drivers.DriversB;
import Drivers.DriversC;
import Drivers.DriversD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;
import Transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Sponsor nike = new Sponsor("Nike", 7_000_000);
        Sponsor redbyll = new Sponsor("Red Byll ", 23_000_000);
        Sponsor xBet = new Sponsor("1X Bet", 8_000_000);
        Sponsor gDrive = new Sponsor("G-Drive", 3_000_000);

        Sponsor.add2(nike);
        Sponsor.add2(redbyll);
        Sponsor.add2(xBet);
        Sponsor.add2(gDrive);

        Mechanic alexey = new Mechanic("Алексей Федоров", "СТО");
        Mechanic ivan = new Mechanic("Иван Смольнов", "ПитСтоп");
        Mechanic<Truck> mihail = new Mechanic("Михаил Резников", "АраМоторс");
        Mechanic roman = new Mechanic("Роман Дубов", "G-Drive");


        Mechanic.addMechanics(alexey);
        Mechanic.addMechanics(ivan);
        Mechanic.addMechanics(mihail);
        Mechanic.addMechanics(roman);


        Bus hyundai = new Bus(
                "Hyundai",
                "H350",
                2.2f,
                BusCapacityType.LARGE);
        hyundai.addDriver(new DriversD("Егор", 33,
                hyundai));
        hyundai.addMechanic(alexey, mihail);
        hyundai.addSponsor(nike, gDrive);

        Bus man = new Bus(
                "MAN",
                "Lion’s Coach",
                3.5f,
                BusCapacityType.MEDIUM);
        Bus volvo = new Bus(
                "Volvo",
                "9700",
                3.8f,
                BusCapacityType.MEDIUM);
        Bus foton = new Bus(
                "Foton",
                "View",
                2.4f,
                BusCapacityType.EXTRA_SMALL);

        Car bmv = new Car(
                "BMW",
                "X6",
                2.8f,
                Type.COUPE);
        bmv.addDriver(new DriversB("Игорь", 35, bmv));
        bmv.addMechanic(new Mechanic<Car>("Иванов Иван", "Энергосети"));
        bmv.addSponsor(xBet);
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0f,
                Type.HATCHBACK);
        Car bmvZ8 = new Car(
                "BMW",
                "Z8",
                3.0f,
                Type.SEDAN);
        Car kia = new Car(
                "Kia",
                "Sportage 4 поколение",
                2.4f,
                Type.CROSSOVER);


        Truck kamaz = new Truck(
                "КамАЗ",
                "54901",
                3.8f,
                TruckLoadCapacity.N3);
        kamaz.addDriver(new DriversC("Мария", 25, kamaz));
        kamaz.addMechanic(roman, alexey);
        /*servis(
                hyundai, man, volvo, foton,
                bmv, audi, bmvZ8, kia,
                kamaz, volkswagen, zil, gaz
        );

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

        // Data.inputLog();

        servis();*/
        kamaz.addSponsor(redbyll);
        Truck volkswagen = new Truck(
                "Volkswagen",
                "Crafter",
                3.2f,
                TruckLoadCapacity.N1);
        Truck zil = new Truck(
                "ЗИЛ",
                "130",
                3.0f,
                TruckLoadCapacity.N2);
        Truck gaz = new Truck(
                "ГАЗель",
                "-Next",
                2.5f,
                TruckLoadCapacity.N2);

        Driver.addDriver(new DriversB("Владимир", 22, bmvZ8));
        Driver.addDriver(new DriversD("Иван", 5, volvo));
        Driver.addDriver(new DriversC("Даниил", 9, zil));

        List<Transport> transports = List.of(hyundai, man, volvo, foton,
                bmv, audi, bmvZ8, kia,
                kamaz, volkswagen, zil, gaz);

        for (Transport transport : transports) {
            printInfo(transport);
        }
        ServiceStation<Transport> serviceStation = new ServiceStation<Transport>();
        serviceStation.addCar(bmv);
        serviceStation.addCar(kia);
        serviceStation.addTruck(kamaz);
    }

        /*Queue<String> cashier1 = new ArrayDeque<>();
        randomFilling(cashier1);
        randomFilling(cashier2);
        System.out.println("Очередь 1" + cashier1);
        System.out.println("Очередь 2" + cashier2);

        addPeople("Сеня", cashier1, cashier2);
        System.out.println("Очередь 1" + cashier1);
        System.out.println("Очередь 2" + cashier2);
        removePeople(cashier1, cashier2);
        System.out.println("Очередь 1" + cashier1);
        System.out.println("Очередь 2" + cashier2);

        example();
    }*/

//        serviceStation.carInspection();




        // задача по супермаркету


        private static final List<String> PEOPLE = List.of("Человек1", "Человек2", "Человек3", "Человек4", "Человек5", "Человек6", "Человек7", "Человек8");

        public static final Random RANDOM = new Random();

        public static void addPeople(String people, Queue<String> cashier1, Queue<String> cashier2) {
            if (cashier1.size() < cashier2.size()) {
                cashier1.offer(people);
            } else if (cashier2.size() < cashier1.size()) {
                cashier2.offer(people);
            } else {

                System.out.println("Галя");
            }
        }

        public static void removePeople(Queue<String> cashier1, Queue<String> cashier2) {
            if (RANDOM.nextBoolean()) {
                cashier1.poll();
            } else {
                cashier2.poll();
            }
        }
        public static void randomFilling(Queue<String> queue) {
            int size = RANDOM.nextInt(6);
            for (int i = 0; i < size; i++) {
                queue.offer(PEOPLE.get(RANDOM.nextInt(PEOPLE.size())));
            }
        }
    public static void servis (Transport... transports) {
        for (Transport transport : transports) {
            servisPrintExpention(transport);
        }
    }
    public static void servisPrintExpention(Transport transports) {
        try {
            if (!transports.texService()) {
                throw new RuntimeException(transports.getBrand() + "" + transports.getModel() + " Не прошшел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void printInfo(Transport transport) {
        System.out.println("Информация по афтомобилю: " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители:");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getDriverName());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getSponsorName());
        }
        System.out.println("Механики: ");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getFullNameMech() + " из компании " + mechanic.getCompany());
        }
    }


    public static void example() {
                List<List<String>> biDemArrList = new ArrayList<>();
                for (int i = 0; i < 8; i++) {
                    biDemArrList.add(i, new ArrayList<>());
                    for (int j = 0; j < 8; j++) {
                        biDemArrList.get(i).add(j, (i + j) % 2 == 1 ? "●" : "◯");
                    }
                }
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(biDemArrList.get(i).get(j) + " ");
                    }
                    System.out.println();
                }

    }
}
