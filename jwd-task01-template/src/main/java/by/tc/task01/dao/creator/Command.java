package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;

public interface Command {

    public Appliance create(String paramsString);
}
