package by.tc.task01.dao.impl.creator;

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCCreator implements Creator {

    public TabletPCCreator() {
    }

    @Override
    public Appliance createAppliance(String parameters) {
        String pattern = "TabletPC : BATTERY_CAPACITY=|, DISPLAY_INCHES=|, MEMORY_ROM=|, FLASH_MEMORY_CAPACITY=|, COLOR=|;";
        String[] values = parameters.split(pattern);

        TabletPC appliance = new TabletPC();
        appliance.setBatteryCapacity(Double.parseDouble(values[1]));
        appliance.setDisplayInches(Double.parseDouble(values[2]));
        appliance.setMemoryROM(Double.parseDouble(values[3]));
        appliance.setFlashMemoryCapacity(Double.parseDouble(values[4]));
        appliance.setColor(values[5]);

        return appliance;
    }
}
