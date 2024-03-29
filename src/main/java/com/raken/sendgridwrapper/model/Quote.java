package com.raken.sendgridwrapper.model;

import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("content")
    private String content;

    @SerializedName("author")
    private String author;

    public Quote() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return String.format("%s - %s", content, author);
    }
}