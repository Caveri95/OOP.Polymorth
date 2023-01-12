package Mechanics;

public enum TypeAutoRepair {

    CAR("Ремонтирует и обслуживает машины"),
    BUS("Ремонтирует и обслуживает автобусы"),
    TRACK("Ремонтирует и обслуживает грузовики"),
    MULTI("Ремонтирует и обслуживает все виды");
    private final String repair;

    TypeAutoRepair(String repair) {
        this.repair = repair;
    }

    public String getRepair() {
        return repair;
    }

    @Override
    public String toString() {
        return "Специализация: " + repair;
    }
}
