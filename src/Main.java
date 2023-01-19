import Mechanics.Mechanic;
import Mechanics.Mechanic;
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

        ArrayList<Drivers> drivers = new ArrayList<>();
        drivers.add(oleg);
        drivers.add(boris);
        drivers.add(victor);


        List<Transport> transports = new ArrayList<>();
        transports.add(ford);
        transports.add(hyundai);
        transports.add(lada);
        transports.add(ford);
        transports.add(MAZ104);
        transports.add(MAZ103);
        transports.add(MAZ101);
        transports.add(MAZ203);
        transports.add(scaniaG440);
        transports.add(scaniaP600);
        transports.add(scaniaG380);
        transports.add(scaniaR520);

        Mechanic evgeni = new Mechanic("Евгений", "Пирогов", "Rolf", TypeAutoRepair.CAR);
        Mechanic alexandr = new Mechanic("Александр", "Коронов", "VW", TypeAutoRepair.BUS);
        Mechanic miron = new Mechanic("Мирон", "Попов", "Avangard", TypeAutoRepair.TRACK);
        Mechanic yra = new Mechanic("Юрий", "Попов", "Avangards", TypeAutoRepair.TRACK);
        Mechanic dima = new Mechanic("Дмитрий", "Ковалев", "Motors", TypeAutoRepair.MULTI);

        ArrayList<Mechanic> mechanics  = new ArrayList<>();
        mechanics.add(evgeni);
        mechanics.add(alexandr);
        mechanics.add(miron);
        mechanics.add(dima);
        mechanics.add(yra);

        scaniaG380.addDriverForTransport(drivers);
        scaniaG380.addMechanicForTransport(mechanics); // Кто находится в команде по обслуживанию ТС
        scaniaG380.repairTransport(); // Ремонт ТС
        scaniaG380.maintenanceTransport(); // ТО ТС
        scaniaG380.infoAboutTransport(); // Водители и механики ТС


        Map<Transport, Mechanic> autoMechanic = new HashMap<>();
        autoMechanic.put(ford, evgeni);
        autoMechanic.put(hyundai, dima);
        autoMechanic.put(lada, dima);
        autoMechanic.put(volvo, evgeni);
        autoMechanic.put(MAZ101, dima);
        autoMechanic.put(MAZ103, alexandr); //  Занесли два одиннаковых значения
        autoMechanic.put(MAZ103, alexandr); //  Занесли два одиннаковых значения
        autoMechanic.put(MAZ203, alexandr);
        autoMechanic.put(scaniaG380, yra);
        autoMechanic.put(scaniaP600, miron);
        autoMechanic.put(scaniaG440, yra);
        autoMechanic.put(scaniaR520, dima);

        for (Map.Entry<Transport, Mechanic> value : autoMechanic.entrySet()){
            System.out.println(value.getKey() + ", " + value.getValue());
        }

        Set<Drivers<?>> driversHashSet = new HashSet<>();
        driversHashSet.add(oleg);
        driversHashSet.add(boris);
        driversHashSet.add(victor);
        driversHashSet.add(boris);
        driversHashSet.add(victor);
        driversHashSet.add(boris);

        Iterator<Drivers<?>> iterator = driversHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}