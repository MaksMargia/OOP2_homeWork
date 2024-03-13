package animal.clinic.core.staff;

public class Nurse extends Staff {
       private final int yearsOfExperience;

        public Nurse(String name, int yearsOfExperience) {
            super(name);
            this.yearsOfExperience = yearsOfExperience;
        }

        public int getYearsOfExperience() {
            return yearsOfExperience;
        }

        @Override
        public String toString() {
            return "Nurse{name='" + name + "', yearsOfExperience=" + yearsOfExperience + '}';
        }
    }

