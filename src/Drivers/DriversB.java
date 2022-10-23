package Drivers;
import Transport.Car;
public class DriversB  extends Driver <Car> {

    public DriversB(String driverName,
                   int experienceYears,
                   Car car) {

        super(driverName, "category B", experienceYears, car);
    }
}