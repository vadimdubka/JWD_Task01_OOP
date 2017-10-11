package by.tc.task01.dao.impl.searcher;// Created by sky-vd on 10.10.2017.

import by.tc.task01.dao.Searcher;
import by.tc.task01.entity.criteria.Criteria;

public class OvenSearcher implements Searcher {
    @Override
    public <E> boolean search(Criteria<E> criteria, String line) {

//        List<String> parameters = criteria.parametersAsString();
//
//        String pattern = String.format("^[%s] : .*", criteria.getApplianceType());
//        if (!line.matches(pattern)) {
//            return false;
//        }
//
//        for (String s : parameters) {
//            if (!line.contains(s)) {
//                return false;
//            }
//        }

        return true;
    }
}
