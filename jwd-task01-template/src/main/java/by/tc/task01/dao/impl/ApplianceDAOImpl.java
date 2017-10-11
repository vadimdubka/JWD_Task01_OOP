package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.Creator;
import by.tc.task01.dao.CreatorDirector;
import by.tc.task01.dao.SearcherDirector;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

//TODO проверить модификаторы у полей
public class ApplianceDAOImpl implements ApplianceDAO {

    private CreatorDirector creatorDirector = new CreatorDirector();
    private SearcherDirector searcherDirector = new SearcherDirector();

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        String applianceInDB = findApplianceInDB(criteria);
        if (applianceInDB == null) {
            return null;
        }

        Creator creator = creatorDirector.getCreator(criteria.getApplianceType());
        Appliance appliance = creator.create(applianceInDB);

        return appliance;
    }

    private <E> String findApplianceInDB(Criteria<E> criteria) {
//        Searcher searcher = searcherDirector.getSearch(criteria.getApplianceType());
        try {
            String fileName = "src\\main\\resources\\appliances_db.txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while (reader.ready()) { // TODO проверить такой способ
                line = reader.readLine();
                if (search(criteria, line)) {
                    return line;
                }
            }
            return null;
        } catch (FileNotFoundException e) { // TODO обработать ошибки
            System.out.println("Database is not available");
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    private  <E> boolean search(Criteria<E> criteria, String line) {
        String pattern = String.format("^(%s) : .*", criteria.getApplianceType());
        if (!line.matches(pattern)) {
            return false;
        }


        List<String> parameters = criteria.parametersAsString();

        for (String s : parameters) {
            if (!line.contains(s)) {
                return false;
            }
        }

        return true;
    }
}