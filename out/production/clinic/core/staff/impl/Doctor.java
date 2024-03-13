package animal.clinic.core.staff.impl;

import animal.clinic.core.staff.Staff;
import java.util.List;

public class Doctor extends Staff {
    private final List<String> diagnosis = List.of("чумка", "лишай", "перелом");

    public Doctor(String name) {
        super(name);
    }

    public void dodiagnose() {
        int random = (int) (1 * Math.random()) * 3;

        System.out.println("Диагноз: = " + diagnosis.get(random)); // Добавлен символ `;` в конце строки
    }
}
















