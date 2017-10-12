package by.tc.task01.dao.impl.creator;

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerCreator implements Creator {
    public VacuumCleanerCreator() {
    }

    @Override
    public Appliance createAppliance(String parameters) {
        String pattern = "VacuumCleaner : POWER_CONSUMPTION=|, FILTER_TYPE=|, BAG_TYPE=|, WAND_TYPE=|, MOTOR_SPEED_REGULATION=|, CLEANING_WIDTH=|;";
        String[] values = parameters.split(pattern);

        VacuumCleaner appliance = new VacuumCleaner();
        appliance.setPowerConsumption(Double.parseDouble(values[1]));
        appliance.setFilterType(values[2]);
        appliance.setBagType(values[3]);
        appliance.setWandType(values[4]);
        appliance.setMotorSpeedRegulation(Double.parseDouble(values[5]));
        appliance.setCleaningWidth(Double.parseDouble(values[6]));

        return appliance;
    }
}
