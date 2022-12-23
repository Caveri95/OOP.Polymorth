package Transport;

public class Track extends Transport implements Rival {
    public Track(String brand, String model, double engineVol) {
        super(brand, model, engineVol);
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


}
