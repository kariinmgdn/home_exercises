package io.codelex.oop.runners;

public enum Runner {

    BEGINNER(421,600),
    INTERMEDIATE(361, 420),
    ADVANCED(240, 360);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        if (time < ADVANCED.getMaxTime()) {
            return ADVANCED;
        } else if (time < INTERMEDIATE.getMaxTime()) {
            return INTERMEDIATE;
        }
        return BEGINNER;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }
}
