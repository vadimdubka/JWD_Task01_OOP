package by.tc.task01.dao.impl.searcher;// Created by sky-vd on 10.10.2017.

import by.tc.task01.dao.Searcher;
import by.tc.task01.entity.criteria.Criteria;

public class RefrigeratorSearcher implements Searcher {
    @Override
    public <E> boolean search(Criteria<E> criteria, String line) {
        return false;
    }
}
