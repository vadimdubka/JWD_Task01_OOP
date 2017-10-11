package by.tc.task01.dao;// Created by sky-vd on 10.10.2017.

import by.tc.task01.dao.impl.searcher.*;

import java.util.HashMap;
import java.util.Map;

public class SearcherDirector {
    private Map<String, Searcher> map = new HashMap<>();

    public SearcherDirector() {
        map.put("Oven", new OvenSearcher());
        map.put("Laptop", new LaptopSearcher());
        map.put("Refrigerator", new RefrigeratorSearcher());
        map.put("Speakers", new SpeakersSearcher());
        map.put("TabletPC", new TabletPCSearcher());
        map.put("VacuumCleaner", new VacuumCleanerSearcher());
    }

    public Searcher getSearch(String applianceType) {
        Searcher searcher = map.get(applianceType);
        return searcher;
    }
}
