package com.neu.entity;

import java.util.Date;

public class Reply {
    private Integer id;

    private String content;

    private String title;

    private String author;

    private Date submittme;

    private Integer topicid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getSubmittme() {
        return submittme;
    }

    public void setSubmittme(Date submittme) {
        this.submittme = submittme;
    }

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }
}