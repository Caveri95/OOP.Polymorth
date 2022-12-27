import Transport.*;
import Drivers.Drivers;

public class Main {
    public static void main(String[] args) {

        Car ford = new Car("Форд", "Фокус", 2.0, BodyType.SEDAN);
        Car hyundai = new Car("Хенде", "Солярис", 1.6, BodyType.SEDAN);
        Car lada = new Car("Лада", "Гранта", 1.6, null);
        Car volvo = new Car("Вольво", "XC90", 2.5, BodyType.JEEP);

        Bus MAZ101 = new Bus("МАЗ", "101", 7.1, null);
        Bus MAZ103 = new Bus("МАЗ", "103", 6.3, BusCapacity.LARGE);
        Bus MAZ104 = new Bus("МАЗ", "104", 11, BusCapacity.EXTRA_SMALL);
        Bus MAZ203 = new Bus("МАЗ", "203", 6, BusCapacity.MEDIUM);

        Track scaniaG380 = new Track("Скания", "G 380", 13, Weight.N1);
        Track scaniaG440 = new Track("Скания", "G 440", 13, Weight.N3);
        Track scaniaR520 = new Track("Скания", "R 520", 16, Weight.N1);
        Track scaniaP600 = new Track("Скания", "P 600", 14, null);


        Drivers<Car> oleg = new Drivers<Car>("Иванов", "Олег", "Иванович", "B", 8);
        oleg.drive(ford);

        Drivers<Bus> boris = new Drivers<Bus>("Долгов", "Борис", "Александрович", "C", 4);
        boris.drive(MAZ101);

        Drivers<Track> victor = new Drivers<Track>("Пирогов", "Виктор", "Васильевич", "D", 15);
        victor.drive(scaniaG380);



        MAZ101.printType();

        scaniaG380.printType();






    }

}