package Transport;

import Drivers.Drivers;
import Mechanics.Mechanic;
import Mechanics.TypeAutoRepair;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Track extends Transport implements Rival {

    private final Weight weight;
    public ArrayList<Mechanic> mechanicsForTrack = new ArrayList<>();



    public Track(String brand, String model, double engineVol, Weight weight) {
        super(brand, model, engineVol);
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("разогнать грузовик");
    }

    @Override
    public void stop() {
        System.out.println("остановить грузовик");
    }

    @Override
    public void pitStop() {
        System.out.println("заехать на грузовике в зону пит-стопа");
    }

    @Override
    public void bestLap(double time) {
        System.out.println("время лучшего круга на грузовике составляет" + time);
    }

    @Override
    public void maxSpeed(double speed) {
        System.out.println("максимальная скорость на грузовике составила" + speed);
    }

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getWeight());
        }
    }

    @Override
    public void diagnosticsTransport() throws CantPassDiagnostic {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " может пройти диагностику");
    }

    @Override
    public void addMechanicForTransport(List<Mechanic> mechanics) {
        if (mechanics != null) {
            System.out.println("К транспорту " + getBrand() + " " + getModel() + " добавлены механики: ");
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getTypeAutoRepair() == TypeAutoRepair.TRACK || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                    mechanicsForTrack.add(mechanic);
                }
            }
            System.out.println(mechanicsForTrack);
        }
    }

    @Override
    public void repairTransport(List<Mechanic> mechanics) {
        System.out.println("Механики: ");
        for (Mechanic mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.TRACK || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {

                System.out.print(mechanic.getName() + " " +
                        mechanic.getSurname() + ", ");
            }
        }
        System.out.println("занимаются ремонтом " + getBrand() + " " + getModel());
    }

    @Override
    public void maintenanceTransport(List<Mechanic> mechanics) {
        System.out.println("Механики: ");
        for (Mechanic mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.TRACK || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                System.out.print(mechanic.getName() + " " +
                        mechanic.getSurname() + ", ");
            }
        }
        System.out.println("проводят техническое обслуживание " + getBrand() + " " + getModel());
    }

    public void infoAboutTransport(List<Mechanic> mechanics, List<Drivers> drivers) {
        System.out.println("Транспортное средство: " + getBrand() + " " + getModel() + ". Техническое обслуживание проводят: ");
        for (Mechanic mechanic : mechanics) {
            if (mechanic.getTypeAutoRepair() == TypeAutoRepair.TRACK || mechanic.getTypeAutoRepair() == TypeAutoRepair.MULTI) {
                System.out.println(mechanic.getName() + " " +
                        mechanic.getSurname());
            }
        }
        for (Drivers driver : drivers) {
            if (Objects.equals(driver.getDriverLicense(), "C")) {
                System.out.println("Водитель: " + driver.getName() + " " + driver.getSurname() );
            }
        }
    }
    public Weight getWeight() {
        return weight;
    }
}
