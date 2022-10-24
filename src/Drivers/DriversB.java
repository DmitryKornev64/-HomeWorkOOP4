package Drivers;
import Transport.Car;
public class DriversB  extends Driver <Car> {

    public DriversB(String driverName,
                   int experienceYears,
                   Car car) {

        super(driverName, "category B", experienceYears, car);
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