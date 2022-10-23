package Drivers;
import Transport.Truck;
public class DriversC extends Driver<Truck>{
    public DriversC(String driverName,
                    int experienceYears,
                    Truck truck) {

        super(driverName, "category C", experienceYears, truck);
    }
}