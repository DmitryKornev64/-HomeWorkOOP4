package Transport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    public Car(String brand,
               String model,
               float engineVolume) {

        super(brand, model, engineVolume);
    }
    ///////////////////////////////////////
    @Override
    public void start() {
        System.out.printf("Start %s %s", getModel(), getBrand());
    }

    @Override
    public void finish() {
        System.out.printf("Finish %s %s ",
                getBrand(), getModel());
    }
    ///////////////////////////////////////

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public float getEngineVolume() {
        return super.getEngineVolume();
    }

    @Override
    public void getPitStop() {
        System.out.printf(" Car %s %S заехал на пит-стоп", getBrand(), getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(60, 300);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

