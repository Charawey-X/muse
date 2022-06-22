
package com.example.muse.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Hit {

    @SerializedName("highlights")
    @Expose
    private List<Object> highlights = null;
    @SerializedName("index")
    @Expose
    private String index;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("result")
    @Expose
    private Result result;

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

}
