package by.tc.task01.entity.criteria;

import java.util.*;

public class Criteria<E> {

    private String applianceType;
    private Map<E, Object> criteria = new HashMap<>();

    public void add(E searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    public Collection<Object> getCriteriaValues() {
        return criteria.values();
    }

    public List<String> getCriteriaAsString() {
        ArrayList<String> parameters = new ArrayList<>();
        for (Map.Entry<E, Object> entry : criteria.entrySet()) {
            String parameter = entry.getKey() + "=" + entry.getValue();
            parameters.add(parameter);
        }

        return parameters;
    }
}
