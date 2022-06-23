
package com.example.muse.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class Stats {

    @SerializedName("unreviewed_annotations")
    @Expose
    private Integer unreviewedAnnotations;
    @SerializedName("concurrents")
    @Expose
    private Integer concurrents;
    @SerializedName("hot")
    @Expose
    private Boolean hot;
    @SerializedName("pageviews")
    @Expose
    private Integer pageviews;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stats() {
    }

    /**
     * 
     * @param concurrents
     * @param pageviews
     * @param unreviewedAnnotations
     * @param hot
     */
    public Stats(Integer unreviewedAnnotations, Integer concurrents, Boolean hot, Integer pageviews) {
        super();
        this.unreviewedAnnotations = unreviewedAnnotations;
        this.concurrents = concurrents;
        this.hot = hot;
        this.pageviews = pageviews;
    }

    public Integer getUnreviewedAnnotations() {
        return unreviewedAnnotations;
    }

    public void setUnreviewedAnnotations(Integer unreviewedAnnotations) {
        this.unreviewedAnnotations = unreviewedAnnotations;
    }

    public Integer getConcurrents() {
        return concurrents;
    }

    public void setConcurrents(Integer concurrents) {
        this.concurrents = concurrents;
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Integer getPageviews() {
        return pageviews;
    }

    public void setPageviews(Integer pageviews) {
        this.pageviews = pageviews;
    }

}
