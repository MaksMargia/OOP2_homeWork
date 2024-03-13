package animal.clinic;

public class Main {
    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();

        // Создание зверей
        Cat cat = new Cat("Murzic");
        Dog dog = new Dog("Barbos");
        Duck duck = new Duck("Donald");
        Beaver beaver = new Beaver("Bobby");
        Platypus platypus = new Platypus("Perry");


        // Добавление зверей в клинику
        clinic.addPatient(cat);
        clinic.addPatient(dog);
        clinic.addPatient(duck);
        clinic.addPatient(beaver);
        clinic.addPatient(platypus);


        // Вывод списка бегающих зверей
        System.out.println("Bегающие звери:");
        for (Animal animal : clinic.getGoables()) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.go() + " км/ч");
        }

        // Вывод списка плавающих зверей
        System.out.println("\nПлавающие звери:");
        for (Animal animal : clinic.getSwimmables()) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.swim() + " км/ч");
        }

        // Вывод списка летающих зверей
        System.out.println("\nЛетающие звери:");
        for (Animal animal : clinic.getFlyables()) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.fly() + " км/ч");
        }
    }

    private static class Beaver extends Animal {
        public Beaver ( String bobby ) {
        }

        @Override
        public double swim () {
            return 0;
        }
    }
}