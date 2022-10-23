package Transport;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {
    public Bus(String brand,
               String model,
               float engineVolume) {

        super(brand, model, engineVolume);
    }

    @Override
    public void getPitStop() {
        System.out.printf("Bus %s %s заехал на пит стоп" , getModel(),getBrand());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1,1000 );
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(10,150 );
    }

    @Override
    public void start() {
        System.out.printf("Start %s %s", getModel(),getBrand());
    }

    @Override
    public void finish() {
        System.out.printf("Finish %s %s", getModel(),getBrand());
    }
}
