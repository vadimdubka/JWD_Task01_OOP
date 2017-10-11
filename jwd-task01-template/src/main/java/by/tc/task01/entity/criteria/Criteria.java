package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria<E> {

    private String applianceType;

    private Map<E, Object> criteria = new HashMap<E, Object>();

    public void add(E searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    public Map<E, Object> getCriteria() { // TODO может можно обойти возвращение всей коллекции
        return criteria;
    }

    public List<String> parametersAsString() {
        ArrayList<String> parameters = new ArrayList<>();
        for (Map.Entry<E, Object> entry : criteria.entrySet()) {
            String parameter = entry.getKey() + "=" + entry.getValue();
            parameters.add(parameter);
        }

        return parameters;
    }
    // you may add your own code here
}
