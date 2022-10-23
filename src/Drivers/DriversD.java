package Drivers;
import Transport.Bus;
public class DriversD extends Driver <Bus> {

    public DriversD(String driverName,
                    int experienceYears,
                    Bus bus) {

        super(driverName, "category D", experienceYears, bus);
    }
}