package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.Speakers.CORD_LENGTH;
import static by.tc.task01.entity.criteria.SearchCriteria.Speakers.FREQUENCY_RANGE;
import static by.tc.task01.entity.criteria.SearchCriteria.Speakers.NUMBER_OF_SPEAKERS;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.*;
import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.CLEANING_WIDTH;

public class Main {

    public static void main(String[] args) {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////
        Criteria<Oven> criteriaOven = new Criteria<>();
        criteriaOven.setApplianceType("Oven"); // тут и дальше в методе строки подобного типа созданы исходя из информации, полученной во время консультации 2017.10.09
        criteriaOven.add(Oven.CAPACITY, 3);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////
        criteriaOven = new Criteria<>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(Oven.HEIGHT, 200);
        criteriaOven.add(Oven.DEPTH, 300);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////
        Criteria<TabletPC> criteriaTabletPC = new Criteria<>();
        criteriaTabletPC.setApplianceType("TabletPC");
        criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

//////////////////////////////////////////////////////////////////
        Criteria<SearchCriteria.Oven> criteriaOven2 = new Criteria<>();

        criteriaOven2.setApplianceType("Oven");
        criteriaOven2.add(SearchCriteria.Oven.HEIGHT, 40);
        criteriaOven2.add(SearchCriteria.Oven.DEPTH, 60);
        criteriaOven2.add(SearchCriteria.Oven.WIDTH, 70);
        criteriaOven2.add(SearchCriteria.Oven.WEIGHT, 11);
        criteriaOven2.add(SearchCriteria.Oven.POWER_CONSUMPTION, 2000);
        criteriaOven2.add(SearchCriteria.Oven.CAPACITY, 33);
        appliance = service.find(criteriaOven2);
        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////
        Criteria<SearchCriteria.Laptop> criteriaLaptop = new Criteria<>();

        criteriaLaptop.setApplianceType("Laptop");
        criteriaLaptop.add(SearchCriteria.Laptop.BATTERY_CAPACITY, 1.5);
        criteriaLaptop.add(SearchCriteria.Laptop.OS, "Linux");
        criteriaLaptop.add(SearchCriteria.Laptop.MEMORY_ROM, 8000);
        criteriaLaptop.add(SearchCriteria.Laptop.SYSTEM_MEMORY, 1000);
        criteriaLaptop.add(SearchCriteria.Laptop.CPU, 2.2);
        criteriaLaptop.add(SearchCriteria.Laptop.DISPLAY_INCHS, 19);
        appliance = service.find(criteriaLaptop);
        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////
        Criteria<SearchCriteria.Refrigerator> criteriaRefrigerator = new Criteria<>();

        criteriaRefrigerator.setApplianceType("Refrigerator");
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION, 150);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.WEIGHT, 35);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.FREEZER_CAPACITY, 20);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.OVERALL_CAPACITY, 350.5);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.HEIGHT, 250);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.WIDTH, 75);
        appliance = service.find(criteriaRefrigerator);
        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////
        Criteria<SearchCriteria.VacuumCleaner> criteriaVacuumCleaner = new Criteria<>();
        criteriaVacuumCleaner.setApplianceType("VacuumCleaner");
        criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION, 90);
        criteriaVacuumCleaner.add(FILTER_TYPE, "C");
        criteriaVacuumCleaner.add(BAG_TYPE, "XX00");
        criteriaVacuumCleaner.add(WAND_TYPE, "all-in-one");
        criteriaVacuumCleaner.add(MOTOR_SPEED_REGULATION, 2950);
        criteriaVacuumCleaner.add(CLEANING_WIDTH, 30);

        appliance = service.find(criteriaVacuumCleaner);
        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////
        Criteria<SearchCriteria.TabletPC> criteriaTabletPC2 = new Criteria<>();
        criteriaTabletPC2.setApplianceType("TabletPC");
        criteriaTabletPC2.add(SearchCriteria.TabletPC.COLOR, "red");
        criteriaTabletPC2.add(SearchCriteria.TabletPC.BATTERY_CAPACITY, 4);
        criteriaTabletPC2.add(SearchCriteria.TabletPC.DISPLAY_INCHES, 15);
        criteriaTabletPC2.add(SearchCriteria.TabletPC.MEMORY_ROM, 8000);
        criteriaTabletPC2.add(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY, 6);

        appliance = service.find(criteriaTabletPC2);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////
        Criteria<SearchCriteria.Speakers> criteriaSpeakers = new Criteria<>();
        criteriaSpeakers.setApplianceType("Speakers");
        criteriaSpeakers.add(CORD_LENGTH, 3);
        criteriaSpeakers.add(FREQUENCY_RANGE, "3-4");
        criteriaSpeakers.add(SearchCriteria.Speakers.POWER_CONSUMPTION, 20);
        criteriaSpeakers.add(NUMBER_OF_SPEAKERS, 3);

        appliance = service.find(criteriaSpeakers);
        PrintApplianceInfo.print(appliance);

    }

}
