package Transport;

import java.util.Objects;

public abstract class   Transport {
    private    String brand; // «Марка»
    private    String model; // «Модель»
    private  float engineVolume; // «Объем двигателя»

    public Transport(String brand,
                     String model,
                     float engineVolume) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isBlank()) {
            this.model = model;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }
    }

    public abstract boolean texService();

    public abstract void start(); // метод «начать движение»

    public abstract void finish(); // метод «закончить движение»

    public abstract void type();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}