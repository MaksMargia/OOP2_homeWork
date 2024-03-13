package animal.clinic.core.patients;

import animal.clinic.core.Animal;

public class Duck extends Animal implements Flyable, Swimmable {
    private String name;

    public Duck(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public double fly() {
        System.out.println("Утка " + name + " летит со скоростью 20");
        return 20.0; // Скорость полета утки
    }

    @Override
    public double swim() {
        System.out.println("Утка " + name + " плавает со скоростью 5");
        return 5.0; // Скорость плавания утки
    }
}