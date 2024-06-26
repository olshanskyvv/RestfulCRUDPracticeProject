package com.example.practiceproject.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Weapon")
@XmlAccessorType(XmlAccessType.FIELD)
public class Weapon {
    @XmlElement(name = "SerialNumber")
    private Integer serial_number;
    @XmlElement(name = "Type")
    private String type;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "SightingRange")
    private Double sighting_range;
    @XmlElement(name = "Capacity")
    private Integer capacity;
    @XmlElement(name = "Weight")
    private Double weight;
    @XmlElement(name = "RateOfFire")
    private Integer rate_of_fire;

    public Integer getSerialNumber() {
        return this.serial_number;
    }

    public void setSerialNumber(Integer serial_number) {
        this.serial_number = serial_number;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSightingRange() {
        return this.sighting_range;
    }

    public void setSightingRange(Double sighting_range) {
        this.sighting_range = sighting_range;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getRateOfFire() {
        return this.rate_of_fire;
    }

    public void setRateOfFire(Integer rate_of_fire) {
        this.rate_of_fire = rate_of_fire;
    }
}
