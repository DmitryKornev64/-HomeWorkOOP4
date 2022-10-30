package Transport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    private Type type;

    public Car(String brand,
               String model,
               float engineVolume,
               Type type) {

        super(brand, model, engineVolume);

        this.type = type;
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
    public void type() {
        if (type == null) {
            System.out.println(" Данных по авто недостаточно");
        } else {
            System.out.println(" Тип кузова автомобиля " + type);
        }
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


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

    public boolean texService() {
        return Math.random()> 0.5;
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
        return super.toString() + " Тип кузова: "
                + getType();
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


