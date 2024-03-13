package animal.clinic.core.patients;

public class Platypus implements Swimmable {
    private String name;

    public Platypus(String name) {
        this.name = name;
    }

    @Override
    public double swim() {
        System.out.println("Платипус " + name + " плавает со скоростью 3");
        return 3.0; // Скорость плавания платипуса
    }
}
