
package com.example.muse.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class PrimaryArtist {

    @SerializedName("api_path")
    @Expose
    private String apiPath;
    @SerializedName("header_image_url")
    @Expose
    private String headerImageUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("is_meme_verified")
    @Expose
    private Boolean isMemeVerified;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("iq")
    @Expose
    private Integer iq;

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

}
