package Transport;

import java.util.Objects;

public abstract class Transport implements Rival {
    private final String brand;
    private final String model;
    private final double engineVol;

    public Transport(String brand, String model, double engineVol) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "данных нет";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "данных нет";
        }
        if (engineVol > 0) {
            this.engineVol = engineVol;
        } else {
            this.engineVol = 0;
        }
    }

    public abstract void start();
    public abstract void stop();
    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVol() {
        return engineVol;
    }

    @Override
    public String toString() {
        return  "Марка - " + brand +
                ", модель - " + model +
                ", объем двигателя - " + engineVol + "л";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVol, engineVol) == 0 &&
                Objects.equals(brand, transport.brand) &&
                Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVol);
    }
}