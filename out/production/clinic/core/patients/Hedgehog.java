package animal.clinic.core.patients;

import animal.clinic.core.Animal;

public abstract class Hedgehog extends Animal {
    private final double temperature;

    public Hedgehog(String name, double temperature) {
        super();
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Hedgehog{name='" + getName() + "', temperature=" + temperature + '}';
    }
}