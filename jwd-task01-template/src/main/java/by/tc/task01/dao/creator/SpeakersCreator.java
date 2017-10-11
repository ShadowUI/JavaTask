package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria;

public class SpeakersCreator implements Command {

    @Override
    public Appliance create(String paramsString) {

        String params[] = paramsString.split("[:;\\s,=]+");

        int powerConsumption = Integer.parseInt(params[2]);
        int numberOfSpeakers = Integer.parseInt(params[4]);
        String frequencyRange = params[6];
        double cordLength = Double.parseDouble(params[8]);

        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}
