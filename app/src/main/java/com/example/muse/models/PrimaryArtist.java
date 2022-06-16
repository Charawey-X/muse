
package com.example.muse.models;

import java.util.HashMap;
import java.util.Map;



public class PrimaryArtist {

    private String apiPath;
    private String headerImageUrl;
    private Integer id;
    private String imageUrl;
    private Boolean isMemeVerified;
    private Boolean isVerified;
    private String name;
    private String url;
    private Integer iq;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrimaryArtist() {
    }

    /**
     * 
     * @param headerImageUrl
     * @param isVerified
     * @param apiPath
     * @param imageUrl
     * @param name
     * @param iq
     * @param id
     * @param isMemeVerified
     * @param url
     */
    public PrimaryArtist(String apiPath, String headerImageUrl, Integer id, String imageUrl, Boolean isMemeVerified, Boolean isVerified, String name, String url, Integer iq) {
        super();
        this.apiPath = apiPath;
        this.headerImageUrl = headerImageUrl;
        this.id = id;
        this.imageUrl = imageUrl;
        this.isMemeVerified = isMemeVerified;
        this.isVerified = isVerified;
        this.name = name;
        this.url = url;
        this.iq = iq;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getIsMemeVerified() {
        return isMemeVerified;
    }

    public void setIsMemeVerified(Boolean isMemeVerified) {
        this.isMemeVerified = isMemeVerified;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
