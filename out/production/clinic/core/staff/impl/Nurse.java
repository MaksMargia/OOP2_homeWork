package animal.clinic.core.staff.impl;

import animal.clinic.core.staff.Staff;
import java.util.*;

public class Nurse extends Staff {
    public Nurse(String name) {
        super(name);
    }

    public void vaactination() {
        System.out.println("Вакцинация");
    }

    int random = (int) (1 * Math.random()) * 3;
}
