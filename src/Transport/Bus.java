package Transport;

public class Bus extends Transport implements Rival {
    public Bus(String brand, String model, double engineVol) {
        super(brand, model, engineVol);
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
}
