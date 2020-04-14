package com.example.chucknorris;

import com.google.gson.annotations.SerializedName;

public class Joke {

    @SerializedName("url")
    public String url;
    @SerializedName("icon_url")
    public String icon_url;
    @SerializedName("value")
    public String value;

    public Joke(String url, String icon_url, String value) {
        this.url = url;
        this.icon_url = icon_url;
        this.value = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}