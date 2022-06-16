
package com.example.muse.models;

import java.util.HashMap;
import java.util.Map;



public class Stats {

    private Integer unreviewedAnnotations;
    private Boolean hot;
    private Integer pageviews;
    private Integer concurrents;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public Stats(Integer unreviewedAnnotations, Boolean hot, Integer pageviews, Integer concurrents) {
        super();
        this.unreviewedAnnotations = unreviewedAnnotations;
        this.hot = hot;
        this.pageviews = pageviews;
        this.concurrents = concurrents;
    }

    public Integer getUnreviewedAnnotations() {
        return unreviewedAnnotations;
    }

    public void setUnreviewedAnnotations(Integer unreviewedAnnotations) {
        this.unreviewedAnnotations = unreviewedAnnotations;
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

    public Integer getConcurrents() {
        return concurrents;
    }

    public void setConcurrents(Integer concurrents) {
        this.concurrents = concurrents;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
