package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.setApplianceType("Oven"); // TODO ЭТУ СТРОКУ Я ДОБАВИЛ САМ НА ОСНОВАНИИ ФОТКИ С КОНСУЛЬТАЦИИ
		criteriaOven.add(Oven.CAPACITY, 3); // TODO возвратить
//		criteriaOven.add(Oven.CAPACITY, 32); // TODO удалить

		appliance = service.find(criteriaOven);

//		System.out.println(appliance); // TODO удалить
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

	}

}
