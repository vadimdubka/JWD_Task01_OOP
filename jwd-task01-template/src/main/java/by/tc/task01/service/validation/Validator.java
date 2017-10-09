package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		// you may add your own code here
		
		return true;
	}

	//TODO проверяет параметры E, например микроволновки. Может создать объект по имени класса Class.forName(className). Должны быть целые числа.

}

//you may add your own new classes