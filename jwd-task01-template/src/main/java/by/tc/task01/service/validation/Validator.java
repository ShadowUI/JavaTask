package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public class Validator {

	private final static String stringTypedCriteria = "OS, FILTER_TYPE, BAG_TYPE, WAND_TYPE, COLOR, FREQUENCY_RANGE";

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		List<String> listCriteria = criteria.getListCriteria();
		if (listCriteria.isEmpty()) {
			return false;
		}

		for (String a: listCriteria) {
			String criteriaName = a.substring(0,a.indexOf("="));
			if (!stringTypedCriteria.contains(criteriaName)) {
				String value = a.substring(a.indexOf("=")+1,a.length());
				try {
					Double doubleForCheck = Double.parseDouble(value);
				} catch (NumberFormatException e) {
					return false;
				}
			}
		}
		return true;
	}
}