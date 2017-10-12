package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

    public PrintApplianceInfo() {
    }

    public static void print(Appliance appliance) {
        if (appliance != null) {
            System.out.println(appliance);
        } else {
            System.out.println("Appliance is not found.");
        }
    }
}
