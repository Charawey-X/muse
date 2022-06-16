
package com.example.muse.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MuseSearchResponse {

    private List<Hit> hits = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MuseSearchResponse() {
    }

    /**
     * 
     * @param hits
     */
    public MuseSearchResponse(List<Hit> hits) {
        super();
        this.hits = hits;
    }

    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
