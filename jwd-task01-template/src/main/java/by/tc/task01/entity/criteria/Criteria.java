package by.tc.task01.entity.criteria;

import java.util.*;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	/** @return list of strings from map in "Key=Hashcode(value)" format */

	public List<String> getListCriteria() {
		List<String> list = new ArrayList<>();
		for (Map.Entry<E, Object> entry : criteria.entrySet()) {
			list.add(entry.getKey() + "=" + entry.getValue());
		}
		return list;
	}

	/** @return name of appliance*/

	public String getApplianceName() {
		for (E e : criteria.keySet()) {
			String applianceName = e.getClass().getCanonicalName();
			return applianceName.substring(applianceName.lastIndexOf('.') + 1, applianceName.length());
		}
		return null;
	}

}
