package Transport;

public class Car extends Transport implements Rival{
    public Car(String brand, String model, double engineVol) {
        super(brand, model, engineVol);
    }

    @Override
    public void start() {
        System.out.println("разогнать автомашине");
    }

    @Override
    public void stop() {
        System.out.println("остановить автомашине");
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
}
