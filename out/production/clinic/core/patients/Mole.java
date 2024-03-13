package animal.clinic.core.patients;

import animal.clinic.core.Animal;

public abstract class Mole extends Animal {
    private final boolean injuredPaw;

    public Mole(String name, boolean injuredPaw) {
        super();
        this.injuredPaw = injuredPaw;
    }

    public boolean hasInjuredPaw() {
        return injuredPaw;
    }

    @Override
    public String toString() {
        return "Mole{name='" + getName() + "', injuredPaw=" + injuredPaw + '}';
    }
}