package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.Creator;
import by.tc.task01.dao.CreatorDirector;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    private final static String resourceAddress = "/appliances_db.txt";
    private final static URL resourceURL = ApplianceDAOImpl.class.getResource(resourceAddress);

    private CreatorDirector creatorDirector = new CreatorDirector();

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        String applianceDescription = findLineInDB(criteria);
        if (applianceDescription == null) {
            return null;
        }

        Creator creator = creatorDirector.getCreator(criteria.getApplianceType());
        Appliance appliance = creator.createAppliance(applianceDescription);

        return appliance;
    }

    /**
     * Метод ищет в БД строку, описывающую прибор, соответствующий критериям.
     */
    private <E> String findLineInDB(Criteria<E> criteria) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(resourceURL.openStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                if (checkLine(criteria, line)) {
                    return line;
                }
            }
            return null;
        } catch (FileNotFoundException e) {
            System.err.println("Database is not available.");
        } catch (IOException e) {
            System.err.println(" I/O exception of some sort has occurred.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Can't close reader.");
            }
        }
        return null;
    }

    /**
     * Метод проверяет строку на соответствие списку критериев.
     */
    private <E> boolean checkLine(Criteria<E> criteria, String line) {

        String startLinePattern = String.format("^(%s) : .*", criteria.getApplianceType());
        if (!line.matches(startLinePattern)) {
            return false;
        }

        List<String> stringCriteria = criteria.getCriteriaAsString();

        for (String criterion : stringCriteria) {
            String criterionPattern = "(?i).* " + criterion + "(\\,|\\;).*";
            if (!line.matches(criterionPattern)) {
                return false;
            }
        }

        return true;
    }

}