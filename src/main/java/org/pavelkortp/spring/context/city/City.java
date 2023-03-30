package org.pavelkortp.spring.context.city;

import org.springframework.beans.factory.annotation.Autowired;

public class City {

    public City(@Autowired(required = false) PipelineSystem pipelineSystem,
                @Autowired(required = false) ElectricitySystem electricitySystem,
                @Autowired(required = false) IndustrialDistrict industrialDistrict) {
        this.pipelineSystem = pipelineSystem;
        this.electricitySystem = electricitySystem;
        this.industrialDistrict = industrialDistrict;
    }

    private PipelineSystem pipelineSystem;
    private ElectricitySystem electricitySystem;
    private IndustrialDistrict industrialDistrict;

    @Override
    public String toString() {
        return "City{" +
                "pipelineSystem=" + pipelineSystem +
                ", electricitySystem=" + electricitySystem +
                ", industrialDistrict="+industrialDistrict+
                '}';
    }
}
