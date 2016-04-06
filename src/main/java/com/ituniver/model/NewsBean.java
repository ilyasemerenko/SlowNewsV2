package com.ituniver.model;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class NewsBean {

    @XmlElement(name="title")
    private String header;
    @XmlElement(name="description")
    private String text;
    @XmlElement(name="image")
    private String image;
    @XmlElement(name="pubDate")
    private String date;
    @XmlElement(name="copyright")
    private String source;

    public NewsBean(){}

    public NewsBean( String header, String text, String image, String date, String source) {

        this.header = header;
        this.text = text;
        this.image = image;
        this.date = date;
        this.source = source;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


}
