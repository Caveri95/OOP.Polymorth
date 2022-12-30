package Drivers;
import Transport.Rival;
import Transport.Transport;
import java.util.Objects;

public class Drivers <T extends Transport & Rival>  {
    private final String name;
    private final String surname;
    private final String patronymic;
    private String driverLicense;
    private double drivingExperience;
    private final String s = "ABCDE";

    public void drive(T transport) {
        System.out.println("Водитель: " + getName() + " " + getSurname() + " " +
                getPatronymic() + " с водительской категорией - " +
                getDriverLicense() + " управляет: " + transport.getBrand() + " " +
                transport.getModel() + " и будет учавствовать в заезде.");
    }

    public Drivers(String surname, String name, String patronymic, String driverLicense, double drivingExperience) {
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
        setDriverLicense(driverLicense);
        if (drivingExperience > 0) {
            this.drivingExperience = drivingExperience;
        } else {
            this.drivingExperience = 0;
        }
    }

    public void start() {
        System.out.println("Водитель: " + getName() + " " + getSurname() + " " + getPatronymic() +
                " с категорией прав " + getDriverLicense() + " начинает движение");

    }
    public void stop() {
        System.out.println("Водитель: " + getName() + " " + getSurname() + " " + getPatronymic() +
                " с категорией прав " + getDriverLicense() + " останавливается");
    }
    public void refuel() {
        System.out.println("Водитель: " + getName() + " " + getSurname() + " " + getPatronymic() +
                " с категорией прав " + getDriverLicense() + " начинает заправляться");

    }

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
        try {
            if (s.contains(driverLicense)) {
                this.driverLicense = driverLicense;
            } else {
                throw new NoValidDriverLicense("Необходимо указать корректный тип прав для водителя: " +
                        getSurname() + " " + getName() + " " + getPatronymic() + " ");
            }
        } catch (NoValidDriverLicense e) {
            System.out.println(e.getMessage());
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
