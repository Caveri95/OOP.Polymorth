package Mechanics;

public class   Mechanic {

    private final String name;
    private final String surname;
    private final String companyWork;
    private final TypeAutoRepair typeAutoRepair;


    public Mechanic(String name, String surname, String companyWork, TypeAutoRepair typeAutoRepair) {
        this.name = name;
        this.surname = surname;
        this.companyWork = companyWork;
        this.typeAutoRepair = typeAutoRepair;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompanyWork() {
        return companyWork;
    }

    public TypeAutoRepair getTypeAutoRepair() {
        return typeAutoRepair;
    }

    public void runTO() {
        System.out.println(getName() + " " + getSurname() + " проводит техобслуживание");
    }

    public void maintenance() {
        System.out.println(getName() + " " + getSurname() + " чинит автомобиль");
    }
    @Override

    public String toString() {
        return "Механик: " +
                "имя - " + name +
                ", фамилия - " + surname +
                ", компания - " + companyWork;
    }


}
