package Drivers;
import Transport.Truck;
public class DriversC extends Driver<Truck> {
    public DriversC(String driverName,
                    int experienceYears,
                    Truck truck) {

        super(driverName, "category C", experienceYears, truck);
    }

    @Override
    public String getDriverName() {
        return super.getDriverName();
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public int getExperienceYears() {
        return super.getExperienceYears();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}