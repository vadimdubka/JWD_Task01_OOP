package by.tc.task01.dao.impl.creator;// Created by sky-vd on 10.10.2017.

import by.tc.task01.dao.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

//TODO где правильно разместить данный класс
// TODO Наверно данный класс должен быть синглтоном со статик полями
public class LaptopCreator implements Creator {

    @Override
    public Appliance create(String parameters){

        new Laptop();

        //set

        return null;
    }

}
