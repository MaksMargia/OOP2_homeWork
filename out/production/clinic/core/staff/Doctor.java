package animal.clinic.core.staff;

public class Doctor extends Staff {
    private final String specialization;

    public Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Doctor{name='" + name + "', specialization='" + specialization + "'}";
    }
}
