package Transport;

public enum Weight {
    N1 (0, 3.5F),
    N2 (3.5F, 12.0F),
    N3 (12F, null);

    private final float lowerLimit;
    private final Float upperLimit;

    Weight(float lowerLimit, Float upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public float getLowerLimit() {
        return lowerLimit;
    }

    public Float getUpperLimit() {
        return upperLimit;
    }

    @Override
    public String toString() {
        if (lowerLimit != 0 && upperLimit != null) {
            return "Грузоподъемность: от " + lowerLimit +
                    " тонн до " + upperLimit + " тонн";
        } else if (lowerLimit == 0) {
            return "Грузоподъемность: до " + upperLimit + " тонн";
        } else {
            return "Грузоподъемность: от " + lowerLimit + " тонн";
        }
    }
}
