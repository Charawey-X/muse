
package com.example.muse.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;


@Parcel
@Generated("jsonschema2pojo")
public class ReleaseDateComponents {

    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("month")
    @Expose
    private Integer month;
    @SerializedName("day")
    @Expose
    private Integer day;

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

}
