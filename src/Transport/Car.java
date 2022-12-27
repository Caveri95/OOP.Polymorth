package Transport;

public class Car extends Transport implements Rival{

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

    public BodyType getBodyType() {
        return bodyType;
    }
}
