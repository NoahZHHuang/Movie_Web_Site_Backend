package com.noah.model;

import java.util.List;

public class Movie {

    private String name;
    private String description;
    private String imdbUrl;
    private String posterFileUrl;
    private List<String> tags;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImdbUrl() {
        return imdbUrl;
    }

    public void setImdbUrl(String imdbUrl) {
        this.imdbUrl = imdbUrl;
    }

    public String getPosterFileUrl() {
        return posterFileUrl;
    }

    public void setPosterFileUrl(String posterFileUrl) {
        this.posterFileUrl = posterFileUrl;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



