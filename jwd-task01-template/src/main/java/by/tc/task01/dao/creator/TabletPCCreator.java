package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPCCreator implements Command{

    @Override
    public Appliance create(String paramsString) {

        String params[] = paramsString.split("[:;\\s,=]+");

        int batteryCapacity = Integer.parseInt(params[2]);
        double displayInches = Double.parseDouble(params[4]);
        int memoryRom = Integer.parseInt(params[6]);
        int flashMemoryCapacity = Integer.parseInt(params[8]);
        String color = params[10];

        return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }
}
