package org.pavelkortp.spring.context;

import org.pavelkortp.spring.context.city.City;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfiguredCity {
    public static void main(String[] args){

//        Створюємо контейнер базований на xml документі, який містить мета-конфігурацію
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("city-context.xml");

//        Отримуємо готовий до роботи об'єкт з контейнеру
        City city = xmlApplicationContext.getBean(City.class);
        City city1 = (City)xmlApplicationContext.getBean("city");

        System.out.println(city);
        System.out.println(city1);
    }
}
