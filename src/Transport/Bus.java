package Transport;

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

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }


}
