package by.tc.task01.dao.impl.creator;

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorCreator implements Creator {

    public RefrigeratorCreator() {
    }

    @Override
    public Appliance createAppliance(String parameters) {
        String pattern = "Refrigerator : POWER_CONSUMPTION=|, WEIGHT=|, FREEZER_CAPACITY=|, OVERALL_CAPACITY=|, HEIGHT=|, WIDTH=|;";
        String[] values = parameters.split(pattern);

        Refrigerator appliance = new Refrigerator();
        appliance.setPowerConsumption(Double.parseDouble(values[1]));
        appliance.setWeight(Double.parseDouble(values[2]));
        appliance.setFreezerCapacity(Double.parseDouble(values[3]));
        appliance.setOverallCapacity(Double.parseDouble(values[4]));
        appliance.setHeight(Double.parseDouble(values[5]));
        appliance.setWidth(Double.parseDouble(values[6]));

        return appliance;
    }
}
