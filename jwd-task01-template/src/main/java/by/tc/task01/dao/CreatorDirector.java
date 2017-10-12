package by.tc.task01.dao;// Created by sky-vd on 10.10.2017.

import by.tc.task01.dao.impl.creator.*;

import java.util.HashMap;
import java.util.Map;

public class CreatorDirector {
    private Map<String, Creator> map = new HashMap<>();

    public CreatorDirector() {
        map.put("Oven", new OvenCreator());
        map.put("Laptop", new LaptopCreator());
        map.put("Refrigerator", new RefrigeratorCreator());
        map.put("Speakers", new SpeakersCreator());
        map.put("TabletPC", new TabletPCCreator());
        map.put("VacuumCleaner", new VacuumCleanerCreator());
    }

    public Creator getCreator(String applianceType) {
        Creator creator = map.get(applianceType);
        return creator;
    }
}
