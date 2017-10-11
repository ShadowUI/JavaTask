package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;

public class OvenCreator implements Command{

    @Override
    public Appliance create(String paramsString) {

        String params[] = paramsString.split("[:;\\s,=]+");

        int powerConsumption = Integer.parseInt(params[2]);
        double weight = Double.parseDouble(params[4]);
        int capacity = Integer.parseInt(params[6]);
        double depth = Double.parseDouble(params[8]);
        double height  = Double.parseDouble(params[10]);
        double width = Double.parseDouble(params[12]);

        return new Oven(powerConsumption, weight,capacity, depth, height, width);
    }
}
