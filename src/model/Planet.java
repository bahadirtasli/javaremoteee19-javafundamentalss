package model;

/**
 * 1. Create enum Planets.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * E.g. „Huge Jupiter”, „Small Pluto”.
 * b) Create distanceFromEarth method.
 * c) Verify both methods for multiple planets
 */

public enum Planet {
    MARS(2500000, "Mars"),
    EARTH(300000,"My Earth"),
    JUPITER(4000000,"Huge Jupiter"),
    SATURN(3500000, "Saturn"),
    PLUTO(10000,"Pluto"),
    VENUS(150000, "Venus");

    private float relativeSize;
    private String name;

    Planet(float relativeSize, String name) {
        this.relativeSize = relativeSize;
        this.name = name;
    }

    public void setRelativeSize(float relativeSize) {
        this.relativeSize = relativeSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "relativeSize=" + relativeSize +
                ", name='" + name + '\'' +
                '}';
    }
    public double distanceFromEarth() {
        return EARTH.relativeSize - this.relativeSize;
    }
}
