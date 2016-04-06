package com.ituniver.model;

import com.ituniver.service.RSSReader;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="rss")
@XmlAccessorType(XmlAccessType.FIELD)
public class NewsFiller {

    @XmlElementWrapper(name="channel")
    @XmlElement(name="item")
    private List<NewsBean> newsList;

    public List<NewsBean> getNewsList() {
        return newsList;
    }

    public List<NewsBean> fillNewsList(){
        RSSReader rss = new RSSReader();
        try {
            newsList = rss.getNewsFromRSS();
        } catch (Exception e){

        }
        return newsList;
    }
}
