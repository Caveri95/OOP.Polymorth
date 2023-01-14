package Transport;

import Drivers.Drivers;
import Mechanics.Mechanics;
import Mechanics.TypeAutoRepair;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bus extends Transport implements Rival {
    private final BusCapacity busCapacity;


    public Bus(String brand, String model, double engineVol, BusCapacity busCapacity) {
        super(brand, model, engineVol);
        this.busCapacity = busCapacity;
    }

    @Override
    public void start() {
        System.out.println("разогнать автобус");
    }
    @Override
    public void stop() {
        System.out.println("остановить автобус");
    }


    @Override
    public void pitStop() {
        System.out.println("заехать на автобусе в зону пит-стопа");
    }

    @Override
    public void bestLap(double time) {
        System.out.println("время лучшего круга на автобусе составляет" + time);
    }

    @Override
    public void maxSpeed(double speed) {
        System.out.println("максимальная скорость на автобусе составила" + speed);
    }

    @Override
    public void printType() {
        if (busCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBusCapacity());
        }
    }

    @Override
    public void addMechanicForTransport() {
        if (mechanics != null) {
            System.out.println("Механики");
            for (Mechanics mechanic : mechanics) {
                if (mechanic.getTypeAutoRepair() == TypeAutoRepair.BUS || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                    System.out.println(mechanic.getName() + " " + mechanic.getSurname());
                }
            }
            System.out.println("в команде обслуживания транспортного средства " +
                    getBrand() + " " + getModel());
        }
    }

    @Override
    public void repairTransport() {
        System.out.println("Механики: ");
        for (Mechanics mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.BUS || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
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
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.BUS || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                System.out.print(mechanic.getName() + " " +
                        mechanic.getSurname() + ", ");
            }
        }
        System.out.println("проводят техническое обслуживание " + getBrand() + " " + getModel());
    }


    public void infoAboutTransport(List<Mechanics> mechanics, List<Drivers> drivers) {
        System.out.println("Транспортное средство: " + getBrand() + " " + getModel() + ". Техническое обслуживание проводят: ");
        for (Mechanics mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.BUS || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                System.out.println(mechanic.getName() + " " +
                        mechanic.getSurname());
            }
        }
        for (Drivers driver : drivers) {
            if (Objects.equals(driver.getDriverLicense(), "D")) {
                System.out.println("Водитель: " + driver.getName() + " " + driver.getSurname() );
            }
        }
    }
    @Override
    public void diagnosticsTransport() throws CantPassDiagnostic {
        throw new CantPassDiagnostic(" Автобус не может проходить диагностику", this);
    }
    public BusCapacity getBusCapacity() {
        return busCapacity;
    }
}
