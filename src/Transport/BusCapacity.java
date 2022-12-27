package Transport;

public enum BusCapacity {
    EXTRA_SMALL (0, 10),
    SMALL (0, 25),
    MEDIUM (40, 50),
    LARGE (60, 80),
    EXTRA_LARGE (100, 120);

    private final Integer minSeats;
    private final Integer maxSeats;

    BusCapacity(Integer minSeats, Integer maxSeats) {
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
    }

    public Integer getMinSeats() {
        return minSeats;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }

    @Override
    public String toString() {
        return  "Вместимость пассажиров: " + getMinSeats() + " - " + getMaxSeats() + " мест";
    }
}
