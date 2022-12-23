import Transport.Bus;
import Transport.Car;
import Transport.Track;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class Main {
    public static void main(String[] args) {

        Car ford = new Car("Форд", "Фокус", 2.0);
        Car hyundai = new Car("Хенде", "Солярис", 1.6);
        Car lada = new Car("Лада", "Гранта", 1.6);
        Car volvo = new Car("Вольво", "XC90", 2.5);

        Bus MAZ101 = new Bus("МАЗ", "101", 7.1);
        Bus MAZ103 = new Bus("МАЗ", "103", 6.3);
        Bus MAZ104 = new Bus("МАЗ", "104", 11);
        Bus MAZ203 = new Bus("МАЗ", "203", 6);

        Track scaniaG380 = new Track("Скания", "G 380", 13);
        Track scaniaG440 = new Track("Скания", "G 440", 13);
        Track scaniaR520 = new Track("Скания", "R 520", 16);
        Track scaniaP600 = new Track("Скания", "P 600", 14);


        DriverB<Car> Oleg = new DriverB<Car>("Иванов", "Олег", "Иванович", "jjhkjbkj", 8);
        Oleg.drive(ford);

        DriverC<Bus> Boris = new DriverC<Bus>("Долгов", "Борис", "Александрович", "C", 4);
        Boris.drive(MAZ101);

        DriverD<Track> Victor = new DriverD<Track>("Пирогов", "Виктор", "Васильевич", "D", 15);
        Victor.drive(scaniaG380);
        System.out.println(Oleg);
        MAZ103.pitStop();

    }
}