package com.hfad.viewpager.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Niki on 2016-11-17.
 */

public class News {

    private String headline;
<<<<<<< HEAD
    private String summary;
    private String url;
    private String publicationDate;

    public News(String headline, String summary, String url, String publicationDate) {
        this.headline = headline;
        this.summary = summary;
        this.url = url;
=======
    @SerializedName("summary_short")
    private String summaryShort;
    private Link link;
    @SerializedName("publication_date")
    private String publicationDate;

    public News(String headline, String summaryShort, Link link, String publicationDate) {
        this.headline = headline;
        this.summaryShort = summaryShort;
        this.link = link;
>>>>>>> refs/remotes/origin/master
        this.publicationDate = publicationDate;
    }

    public String getHeadline() {
        return headline;
    }

    public String getSummary() {
        return summary;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

<<<<<<< HEAD
    public String getUrl() {
        return url;
    }
=======
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setSummaryShort(String summaryShort) {
        this.summaryShort = summaryShort;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
>>>>>>> refs/remotes/origin/master
}
