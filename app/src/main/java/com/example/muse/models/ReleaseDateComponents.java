
package com.example.muse.models;

import java.util.HashMap;
import java.util.Map;



public class ReleaseDateComponents {

    private Integer year;
    private Integer month;
    private Integer day;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReleaseDateComponents() {
    }

    /**
     * 
     * @param month
     * @param year
     * @param day
     */
    public ReleaseDateComponents(Integer year, Integer month, Integer day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
