package by.tc.task01.dao.impl.creator;

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopCreator implements Creator {

    public LaptopCreator() {
    }

    @Override
    public Appliance createAppliance(String parameters) {

        String pattern = "Laptop : BATTERY_CAPACITY=|, OS=|, MEMORY_ROM=|, SYSTEM_MEMORY=|, CPU=|, DISPLAY_INCHS=|;";
        String[] values = parameters.split(pattern);

        Laptop appliance = new Laptop();
        appliance.setBatteryCapacity(Double.parseDouble(values[1]));
        appliance.setOs(values[2]);
        appliance.setMemoryROM(Double.parseDouble(values[3]));
        appliance.setSystemMemory(Double.parseDouble(values[4]));
        appliance.setCpu(Double.parseDouble(values[5]));
        appliance.setDisplayInchs(Double.parseDouble(values[6]));

        return appliance;
    }

}
