package org.pavelkortp.spring.context;

import org.pavelkortp.spring.context.city.City;
import org.pavelkortp.spring.context.city.ElectricitySystem;
import org.pavelkortp.spring.context.city.IndustrialDistrict;
import org.pavelkortp.spring.context.city.PipelineSystem;

public class TraditionalConfiguredCity {
    public static void main(String[] args){
        ElectricitySystem electricitySystem = new ElectricitySystem();
        PipelineSystem pipelineSystem = new PipelineSystem();
        IndustrialDistrict industrialDistrict = new IndustrialDistrict();

        City city = new City(pipelineSystem, electricitySystem, industrialDistrict);

        System.out.println(city);
    }
}
