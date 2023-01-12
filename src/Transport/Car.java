package Transport;

import Drivers.Drivers;
import Mechanics.TypeAutoRepair;
import Mechanics.Mechanics;

import java.util.List;
import java.util.Objects;

public class Car extends Transport implements Rival {

    private final BodyType bodyType;

    public Car(String brand, String model, double engineVol, BodyType bodyType) {
        super(brand, model, engineVol);
        this.bodyType = bodyType;
    }

    @Override
    public void start() {
        System.out.println("разогнать автомашину");
    }

    @Override
    public void stop() {
        System.out.println("остановить автомашину");
    }


    @Override
    public void pitStop() {
        System.out.println("заехать на автомашине в зону пит-стопа");
    }

    @Override
    public void bestLap(double time) {
        System.out.println("время лучшего круга на автомашине составляет" + time);
    }

    @Override
    public void maxSpeed(double speed) {
        System.out.println("максимальная скорость на автомашине составила" + speed);
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
        }
    }

    @Override
    public void diagnosticsTransport() throws CantPassDiagnostic {
        System.out.println("Автомашина " + getBrand() + " " + getModel() + " может пройти диагностику");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void addMechanicForTransport(List<Mechanics> mechanics) {
        System.out.println("Механики");
        for (Mechanics mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.CAR || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                System.out.println(mechanic.getName() + " " + mechanic.getSurname());
            }
        }
        System.out.println("в команде обслуживания транспортного средства " +
                getBrand() + " " + getModel());
    }

    @Override
    public void repairTransport(List<Mechanics> mechanics) {
        System.out.println("Механики: ");
        for (Mechanics mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.CAR || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                System.out.print(mechanic.getName() + " " +
                        mechanic.getSurname() + ", ");
            }
        }
        System.out.println("занимаются ремонтом " + getBrand() + " " + getModel());
    }

    @Override
    public void maintenanceTransport(List<Mechanics> mechanics) {
        System.out.println("Механики: ");
        for (Mechanics mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.CAR || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                System.out.print(mechanic.getName() + " " +
                        mechanic.getSurname() + ", ");
            }
        }
        System.out.println("проводят техническое обслуживание " + getBrand() + " " + getModel());
    }

    public void infoAboutTransport(List<Mechanics> mechanics, List<Drivers> drivers) {
        System.out.println("Транспортное средство: " + getBrand() + " " + getModel() + ". Техническое обслуживание проводят: ");
        for (Mechanics mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.CAR || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                System.out.println(mechanic.getName() + " " +
                                mechanic.getSurname());
            }
        }
        for (Drivers driver : drivers) {
            if (Objects.equals(driver.getDriverLicense(), "B")) {
                System.out.println("Водитель: " + driver.getName() + " " + driver.getSurname() );
            }
        }
    }
}
