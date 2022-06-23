
package com.example.muse.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("annotation_count")
    @Expose
    private Integer annotationCount;
    @SerializedName("api_path")
    @Expose
    private String apiPath;
    @SerializedName("artist_names")
    @Expose
    private String artistNames;
    @SerializedName("full_title")
    @Expose
    private String fullTitle;
    @SerializedName("header_image_thumbnail_url")
    @Expose
    private String headerImageThumbnailUrl;
    @SerializedName("header_image_url")
    @Expose
    private String headerImageUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lyrics_owner_id")
    @Expose
    private Integer lyricsOwnerId;
    @SerializedName("lyrics_state")
    @Expose
    private String lyricsState;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("pyongs_count")
    @Expose
    private Integer pyongsCount;
    @SerializedName("relationships_index_url")
    @Expose
    private String relationshipsIndexUrl;
    @SerializedName("release_date_components")
    @Expose
    private ReleaseDateComponents releaseDateComponents;
    @SerializedName("release_date_for_display")
    @Expose
    private String releaseDateForDisplay;
    @SerializedName("song_art_image_thumbnail_url")
    @Expose
    private String songArtImageThumbnailUrl;
    @SerializedName("song_art_image_url")
    @Expose
    private String songArtImageUrl;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_with_featured")
    @Expose
    private String titleWithFeatured;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("featured_artists")
    @Expose
    private List<FeaturedArtist> featuredArtists = null;
    @SerializedName("primary_artist")
    @Expose
    private PrimaryArtist primaryArtist;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param headerImageUrl
     * @param fullTitle
     * @param releaseDateComponents
     * @param annotationCount
     * @param relationshipsIndexUrl
     * @param songArtImageUrl
     * @param releaseDateForDisplay
     * @param primaryArtist
     * @param lyricsState
     * @param title
     * @param featuredArtists
     * @param pyongsCount
     * @param url
     * @param titleWithFeatured
     * @param artistNames
     * @param path
     * @param stats
     * @param apiPath
     * @param lyricsOwnerId
     * @param headerImageThumbnailUrl
     * @param id
     * @param songArtImageThumbnailUrl
     */
    public Result(Integer annotationCount, String apiPath, String artistNames, String fullTitle, String headerImageThumbnailUrl, String headerImageUrl, Integer id, Integer lyricsOwnerId, String lyricsState, String path, Integer pyongsCount, String relationshipsIndexUrl, ReleaseDateComponents releaseDateComponents, String releaseDateForDisplay, String songArtImageThumbnailUrl, String songArtImageUrl, Stats stats, String title, String titleWithFeatured, String url, List<FeaturedArtist> featuredArtists, PrimaryArtist primaryArtist) {
        super();
        this.annotationCount = annotationCount;
        this.apiPath = apiPath;
        this.artistNames = artistNames;
        this.fullTitle = fullTitle;
        this.headerImageThumbnailUrl = headerImageThumbnailUrl;
        this.headerImageUrl = headerImageUrl;
        this.id = id;
        this.lyricsOwnerId = lyricsOwnerId;
        this.lyricsState = lyricsState;
        this.path = path;
        this.pyongsCount = pyongsCount;
        this.relationshipsIndexUrl = relationshipsIndexUrl;
        this.releaseDateComponents = releaseDateComponents;
        this.releaseDateForDisplay = releaseDateForDisplay;
        this.songArtImageThumbnailUrl = songArtImageThumbnailUrl;
        this.songArtImageUrl = songArtImageUrl;
        this.stats = stats;
        this.title = title;
        this.titleWithFeatured = titleWithFeatured;
        this.url = url;
        this.featuredArtists = featuredArtists;
        this.primaryArtist = primaryArtist;
    }

    public Integer getAnnotationCount() {
        return annotationCount;
    }

    public void setAnnotationCount(Integer annotationCount) {
        this.annotationCount = annotationCount;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getArtistNames() {
        return artistNames;
    }

    public void setArtistNames(String artistNames) {
        this.artistNames = artistNames;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getHeaderImageThumbnailUrl() {
        return headerImageThumbnailUrl;
    }

    public void setHeaderImageThumbnailUrl(String headerImageThumbnailUrl) {
        this.headerImageThumbnailUrl = headerImageThumbnailUrl;
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

    public Integer getLyricsOwnerId() {
        return lyricsOwnerId;
    }

    public void setLyricsOwnerId(Integer lyricsOwnerId) {
        this.lyricsOwnerId = lyricsOwnerId;
    }

    public String getLyricsState() {
        return lyricsState;
    }

    public void setLyricsState(String lyricsState) {
        this.lyricsState = lyricsState;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPyongsCount() {
        return pyongsCount;
    }

    public void setPyongsCount(Integer pyongsCount) {
        this.pyongsCount = pyongsCount;
    }

    public String getRelationshipsIndexUrl() {
        return relationshipsIndexUrl;
    }

    public void setRelationshipsIndexUrl(String relationshipsIndexUrl) {
        this.relationshipsIndexUrl = relationshipsIndexUrl;
    }

    public ReleaseDateComponents getReleaseDateComponents() {
        return releaseDateComponents;
    }

    public void setReleaseDateComponents(ReleaseDateComponents releaseDateComponents) {
        this.releaseDateComponents = releaseDateComponents;
    }

    public String getReleaseDateForDisplay() {
        return releaseDateForDisplay;
    }

    public void setReleaseDateForDisplay(String releaseDateForDisplay) {
        this.releaseDateForDisplay = releaseDateForDisplay;
    }

    public String getSongArtImageThumbnailUrl() {
        return songArtImageThumbnailUrl;
    }

    public void setSongArtImageThumbnailUrl(String songArtImageThumbnailUrl) {
        this.songArtImageThumbnailUrl = songArtImageThumbnailUrl;
    }

    public String getSongArtImageUrl() {
        return songArtImageUrl;
    }

    public void setSongArtImageUrl(String songArtImageUrl) {
        this.songArtImageUrl = songArtImageUrl;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleWithFeatured() {
        return titleWithFeatured;
    }

    public void setTitleWithFeatured(String titleWithFeatured) {
        this.titleWithFeatured = titleWithFeatured;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<FeaturedArtist> getFeaturedArtists() {
        return featuredArtists;
    }

    public void setFeaturedArtists(List<FeaturedArtist> featuredArtists) {
        this.featuredArtists = featuredArtists;
    }

    public PrimaryArtist getPrimaryArtist() {
        return primaryArtist;
    }

    public void setPrimaryArtist(PrimaryArtist primaryArtist) {
        this.primaryArtist = primaryArtist;
    }

}
