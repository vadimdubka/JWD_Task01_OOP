package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.HashSet;
import java.util.Set;

public class Validator {
    // TODO исходим из дого, что все числа - double ?
    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        Set<Object> criteriaValues = new HashSet<>(criteria.getCriteria().values());
        if (criteriaValues.size()==0){
            return false;
        }
        for (Object value : criteriaValues) {
            if (value == null) {
                return false;
            }

            if (value instanceof Number) {
                Number valueNumber = (Number) value;
                double number = valueNumber.doubleValue();
                if (number <= 0) {
                    return false;
                }
            } else if (value instanceof String) {
                String valueString = (String) value;
                if (valueString.isEmpty() || valueString.length() == 0) {
                    return false;
                }
            }
        }

        return true;
    }

}