package by.tc.task01.dao.impl.creator;

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersCreator implements Creator {
    public SpeakersCreator() {
    }

    @Override
    public Appliance createAppliance(String parameters) {
        String pattern = "Speakers : POWER_CONSUMPTION=|, NUMBER_OF_SPEAKERS=|, FREQUENCY_RANGE=|, CORD_LENGTH=|;";
        String[] values = parameters.split(pattern);

        Speakers appliance = new Speakers();
        appliance.setPowerConsumption(Double.parseDouble(values[1]));
        appliance.setNumberOfSpeakers(Double.parseDouble(values[2]));
        appliance.setFrequencyRange(values[3]);
        appliance.setCordLength(Double.parseDouble(values[4]));

        return appliance;
    }
}
