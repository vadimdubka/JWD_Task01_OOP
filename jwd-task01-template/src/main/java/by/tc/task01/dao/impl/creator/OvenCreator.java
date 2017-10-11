package by.tc.task01.dao.impl.creator;// Created by sky-vd on 10.10.2017.

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

//TODO где правильно разместить данный класс
//TODO где правильно разместить данный класс
public class OvenCreator implements Creator {

    @Override
    public Appliance create(String parameters) {

        String pattern = "Oven : POWER_CONSUMPTION=|, WEIGHT=|, CAPACITY=|, DEPTH=|, HEIGHT=|, WIDTH=|;";
        String[] values = parameters.split(pattern);

        Oven oven = new Oven();
        oven.setPowerConsumption(Double.parseDouble(values[1]));
        oven.setWeight(Double.parseDouble(values[2]));
        oven.setCapacity(Double.parseDouble(values[3]));
        oven.setDepth(Double.parseDouble(values[4]));
        oven.setHeight(Double.parseDouble(values[5]));
        oven.setWidth(Double.parseDouble(values[6]));

        return oven;

    }

}
