package by.tc.task01.dao;// Created by sky-vd on 10.10.2017.

import by.tc.task01.entity.criteria.Criteria;

public interface Searcher {
    <E> boolean search(Criteria<E> criteria, String line); // TODO почему везде надо параметризовать метод
}
