package animal.clinic.core;

public abstract class Animal {
    private String name;

    public Animal() {
        this.setName(getName());
    }

    public Animal ( Object name ) {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + getName() +
                '}';
    }

    public abstract double swim ();

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }
}

