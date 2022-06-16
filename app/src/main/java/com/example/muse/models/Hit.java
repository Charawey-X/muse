
package com.example.muse.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Hit {

    private List<Object> highlights = null;
    private String index;
    private String type;
    private Result result;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hit() {
    }

    /**
     * 
     * @param result
     * @param highlights
     * @param index
     * @param type
     */
    public Hit(List<Object> highlights, String index, String type, Result result) {
        super();
        this.highlights = highlights;
        this.index = index;
        this.type = type;
        this.result = result;
    }

    public List<Object> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<Object> highlights) {
        this.highlights = highlights;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
