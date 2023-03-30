package org.pavelkortp.spring.context;

import org.pavelkortp.spring.context.city.City;
import org.pavelkortp.spring.context.city.ElectricitySystem;
import org.pavelkortp.spring.context.city.IndustrialDistrict;
import org.pavelkortp.spring.context.city.PipelineSystem;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

public class JavaConfiguredCity {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CityConfiguration.class);
        City city = context.getBean(City.class);
        System.out.println(city);
    }
}


@Configuration
class CityConfiguration{

    @Bean
    public ElectricitySystem electricitySystem(){
        return new ElectricitySystem();
    }

    @Bean
    public PipelineSystem pipelineSystem(){
        return new PipelineSystem();
    }

    @Bean
    public IndustrialDistrict industrialDistrict(){
        return new IndustrialDistrict();
    }

    @Bean
    public City city(PipelineSystem pipelineSystem, ElectricitySystem electricitySystem, IndustrialDistrict industrialDistrict){
        return new City(pipelineSystem, electricitySystem, industrialDistrict);
    }

}