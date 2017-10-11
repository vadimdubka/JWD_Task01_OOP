package by.tc.task01.dao;// Created by sky-vd on 10.10.2017.

import by.tc.task01.entity.Appliance;

//TODO где правильно разместить данный класс
// TODO посмотреть паттерн команда в нете
public interface Creator {
    Appliance create(String parameters);
}
