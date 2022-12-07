package ru.iashinme;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.iashinme.domain.City;
import ru.iashinme.service.CityService;
import ru.iashinme.service.CityServiceImpl;

@ComponentScan
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        CityService cityService = context.getBean(CityServiceImpl.class);

        City cityOmsk = new City("omsk", "omsk caption", 55);
        City cityKemerovo = new City("kemerovo", "kemerovo caption", 42);
        City cityKrasnodar = new City("krasnodar", "krasnodar caption", 23);
        City cityNovgorod = new City("novgorod", "novgorod caption", 53);

        cityService.printCaption(cityOmsk);
        cityService.printCaption(cityKemerovo);
        cityService.printCaption(cityKrasnodar);
        cityService.printCaption(cityNovgorod);
    }
}