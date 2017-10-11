package by.tc.task01.dao.impl.creator;// Created by sky-vd on 10.10.2017.

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

//TODO где правильно разместить данный класс
// TODO Наверно данный класс должен быть синглтоном со статик полями
public class LaptopCreator implements Creator {

    @Override
    public Appliance create(String parameters){

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
