package Drivers;

import Transport.Transport;
import Transport.Rival;

public class DriverC <T extends Transport & Rival> extends Drivers {
    public DriverC(String name, String surname, String patronymic, String driverLicense, double drivingExperience) {
        super(name, surname, patronymic, "C", drivingExperience);

    }

    public void drive(T transport) {
        System.out.println("Водитель: " + getName() + " " + getSurname() + " " + getPatronymic() + " с водительской категорией - " +
                getDriverLicense() + " управляет: " + transport.getBrand() + " " +
                transport.getModel() + " и будет учавствовать в заезде.");
    }

    @Override
    public void start() {
        System.out.println("Водитель: " + getName() + " " + getSurname() + " " + getPatronymic() +
                " с категорией прав " + getDriverLicense() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель: " + getName() + " " + getSurname() + " " + getPatronymic() +
                " с категорией прав " + getDriverLicense() + " останавливается");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель: " + getName() + " " + getSurname() + " " + getPatronymic() +
                " с категорией прав " + getDriverLicense() + " начинает заправляться");
    }
}
