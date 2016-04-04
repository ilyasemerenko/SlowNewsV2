package com.ituniver.model;

import java.util.ArrayList;
import java.util.List;

public class NewsFiller {

    public List<NewsBean> fillNewsList(){
        List<NewsBean> newsList = new ArrayList<NewsBean>();
        for (int i = 0; i < 10; i++){
            newsList.add(new ChaosNewsGenerator().getNews());
        }
        return newsList;
    }
}
