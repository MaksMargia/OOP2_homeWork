package animal.clinic.core.patients;

import animal.clinic.core.Animal;
import animal.clinic.core.Goable;

public class Dog extends Animal implements Goable, Swimmable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public double go() {
        System.out.println("Собака " + name + " бежит со скоростью 15");
        return 15.0; // Скорость бега собаки
    }

    @Override
    public double swim () {
        System.out.println("Собака " + name + " плавает со скоростью 7");
        return 7.0; // Скорость плавания собаки
    }
}
