package org.pavelkortp.spring.context;

import org.pavelkortp.spring.context.city.City;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//NOT WORKING BECAUSE IDK
public class AnnotationConfiguredCity {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("city-annotation-context.xml");
        City city = context.getBean(City.class);
        System.out.println(city);
    }
}
