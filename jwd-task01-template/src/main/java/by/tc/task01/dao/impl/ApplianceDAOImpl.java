package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.dao.creator.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO{

	private final static String PATHWAY = "D:\\EPAM_Projects\\JWD_Task01_OOP\\jwd-task01-template\\src\\main\\resources\\appliances_db.txt";

	ApplianceCreator creator = new ApplianceCreator();


	@Override
	public <E> Appliance find(Criteria<E> criteria) {

		boolean fistInList = true;

		Appliance appl = null;

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(PATHWAY))) {

			String readiedLine;
			while ((readiedLine = bufferedReader.readLine()) != null) {			/** Skip  empty line */
				if (readiedLine.isEmpty()) {
					continue;
				}

				String applName = readiedLine.substring(0,readiedLine.indexOf(" "));
				if (applName.equals(criteria.getApplianceName())) {

					List<String> listCriteria = criteria.getListCriteria();
					Map <String, String> mapTmp = new HashMap<>();
					String[] splittedLine = readiedLine.split("[:;\\s,=]+");

					/** Creating map with criteria names and values from DB */

					for (int i=1; i<splittedLine.length; i = i + 2){
						mapTmp.put(splittedLine[i],splittedLine[i+1]);
					}

					/** Check same values */

					for (String readiedCriteria : listCriteria) {
						String criteriaName = readiedCriteria.substring(0,readiedCriteria.indexOf('='));
						String criteriaValue = readiedCriteria.substring(readiedCriteria.indexOf('=')+1, readiedCriteria.length());
						if (mapTmp.get(criteriaName).equals(criteriaValue) && fistInList) {
							Command command = creator.getCommand(applName);
							appl = command.create(readiedLine);
							fistInList = false;
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return appl;
	}
}