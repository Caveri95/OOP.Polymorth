package Drivers;

import Transport.Car;
import Transport.Bus;
import Transport.Rival;
import Transport.Transport;

import java.util.Objects;

public abstract class Drivers {
    private final String name;
    private final String surname;
    private final String patronymic;
    private String driverLicense;
    private double drivingExperience;

    public Drivers(String name, String surname, String patronymic, String driverLicense, double drivingExperience) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "данных нет";
        }
        if (surname != null && !surname.isEmpty() && !surname.isBlank()) {
            this.surname = surname;
        } else {
            this.surname = "данных нет";
        }
        if (patronymic != null && !patronymic.isEmpty() && !patronymic.isBlank()) {
            this.patronymic = patronymic;
        } else {
            this.patronymic = "данных нет";
        }
        this.driverLicense = driverLicense;
        if (drivingExperience > 0) {
            this.drivingExperience = drivingExperience;
        } else {
            this.drivingExperience = 0;
        }
    }

    public abstract void start();
    public abstract void stop();
    public abstract void refuel();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public double getDrivingExperience() {
        return drivingExperience;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense.equals("B") || driverLicense.equals("C") || driverLicense.equals("D")) {
            this.driverLicense = driverLicense;
        } else {
            this.driverLicense = null;
        }
    }

    public void setDrivingExperience(double drivingExperience) {
        if (drivingExperience > 0) {
            this.drivingExperience = drivingExperience;
        } else {
            this.drivingExperience = 0;
        }
    }

    @Override
    public String toString() {
        return "Водитель: " + getName() + " " + getSurname() + " " + getPatronymic() + ". Категория водительский прав: " +
                getDriverLicense() + ". Водительский стаж: " + getDrivingExperience();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drivers)) return false;
        Drivers drivers = (Drivers) o;
        return Double.compare(drivers.drivingExperience, drivingExperience) == 0 &&
                Objects.equals(name, drivers.name) &&
                Objects.equals(surname, drivers.surname) &&
                Objects.equals(patronymic, drivers.patronymic) &&
                Objects.equals(driverLicense, drivers.driverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, driverLicense, drivingExperience);
    }
}
