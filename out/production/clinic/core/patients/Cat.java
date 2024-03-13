package animal.clinic.core.patients;

import animal.clinic.core.Animal;
import animal.clinic.core.Goable;

public class Cat extends Animal implements Goable, Swimmable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public double go() {
        return 10.0; // Скорость бега кошки
    }

    @Override
    public double swim() {
        return 5.0; // Скорость плавания кошки
    }
}
