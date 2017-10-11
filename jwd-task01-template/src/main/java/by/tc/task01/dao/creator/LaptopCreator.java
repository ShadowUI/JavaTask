package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria;

public class LaptopCreator implements Command{

    @Override
    public Appliance create(String paramsString) {
        String params[] = paramsString.split("[:;\\s,=]+");
        double battaryCapacity = Double.valueOf(params[2]);
        String os = params[4];
        int memoryRom = Integer.parseInt(params[6]);
        int systemMemory = Integer.parseInt(params[8]);
        double cpu = Double.parseDouble(params[10]);
        int displayInchs = Integer.parseInt(params[12]);
        return new Laptop(battaryCapacity, os, memoryRom, systemMemory,cpu, displayInchs);
    }
}
