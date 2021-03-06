package by.tc.task01.dao.impl.creator;

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenCreator implements Creator {

    public OvenCreator() {
    }

    @Override
    public Appliance createAppliance(String parameters) {
        String pattern = "Oven : POWER_CONSUMPTION=|, WEIGHT=|, CAPACITY=|, DEPTH=|, HEIGHT=|, WIDTH=|;";
        String[] values = parameters.split(pattern);

        Oven appliance = new Oven();
        appliance.setPowerConsumption(Double.parseDouble(values[1]));
        appliance.setWeight(Double.parseDouble(values[2]));
        appliance.setCapacity(Double.parseDouble(values[3]));
        appliance.setDepth(Double.parseDouble(values[4]));
        appliance.setHeight(Double.parseDouble(values[5]));
        appliance.setWidth(Double.parseDouble(values[6]));

        return appliance;
    }

}
