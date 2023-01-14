import Mechanics.Mechanics;
import Transport.*;
import Drivers.Drivers;
import Mechanics.TypeAutoRepair;

import java.util.*;

public class Main  {
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

        Drivers<Bus> boris = new Drivers<Bus>("Долгов", "Борис", "Александрович", "D", 4);
         boris.drive(MAZ101);

        Drivers<Track> victor = new Drivers<Track>("Пирогов", "Виктор", "Васильевич", "C", 15);
        victor.drive(scaniaG380);

        MAZ101.printType();

        scaniaG380.printType();

        Transport.diagnostic(ford, MAZ101, scaniaG380, hyundai);

        System.out.println(boris);


        List<Drivers> drivers = new ArrayList<>();
        drivers.add(oleg);
        drivers.add(boris);
        drivers.add(victor);

        List<Transport> transports = new ArrayList<>();
        transports.add(ford);
        transports.add(hyundai);
        transports.add(lada);
        transports.add(volvo);
        transports.add(MAZ104);
        transports.add(MAZ103);
        transports.add(MAZ101);
        transports.add(MAZ203);
        transports.add(scaniaG440);
        transports.add(scaniaP600);
        transports.add(scaniaG380);
        transports.add(scaniaR520);

        Mechanics evgeni = new Mechanics("Евгений", "Пирогов", "Rolf", TypeAutoRepair.CAR);
        Mechanics alexandr = new Mechanics("Александр", "Коронов", "VW", TypeAutoRepair.BUS);
        Mechanics miron = new Mechanics("Мирон", "Попов", "Avangard", TypeAutoRepair.TRACK);
        Mechanics dima = new Mechanics("Дмитрий", "Ковалев", "Motors", TypeAutoRepair.MULTI);

        ArrayList<Mechanics> mechanics  = new ArrayList<>();
        mechanics.add(evgeni);
        mechanics.add(alexandr);
        mechanics.add(miron);
        mechanics.add(dima);





        /*scaniaG380.infoAboutTransport(mechanics, drivers); // Водители и механики ТС

        MAZ101.repairTransport(mechanics); // Ремонт ТС

        scaniaG440.maintenanceTransport(mechanics); // ТО ТС
*/





        /*Map<Transport, Mechanics> autoMechanic = new HashMap<>();

        autoMechanic.put(ford, evgeni);
        autoMechanic.put(MAZ101, alexandr);
        autoMechanic.put(scaniaG380, miron);
        autoMechanic.put(volvo, dima);

        for (Map.Entry<Transport, Mechanics> value : autoMechanic.entrySet()){
            System.out.println(value.getKey() + " " + value.getValue());
        }*/

        scaniaG380.addMechanicForTransport(); // Кто находится в команде по обслуживанию ТС







        /*Map<String, String> vocablurary = new HashMap<>();
        vocablurary.put("cat", "кошка");
        vocablurary.put("dog", "собака");
        vocablurary.put("fish", "рыба");

        System.out.println(vocablurary);

        System.out.println(vocablurary.containsKey("cat"));
        System.out.println(vocablurary.containsValue("кошка"));

        for (Map.Entry<String, String> contact: vocablurary.entrySet()) {
            System.out.println("Контакт " + contact.getKey() + ": " + contact.getValue());
        }*/

    }
}