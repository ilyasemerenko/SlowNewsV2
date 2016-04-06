package com.ituniver.service;
import com.ituniver.model.NewsBean;
import com.ituniver.model.NewsFiller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.net.URL;
import java.util.List;

public class RSSReader {

    public static void main (String[] args) throws Exception{
        JAXBContext jc = JAXBContext.newInstance(NewsFiller.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        NewsFiller newsFiller = (NewsFiller) unmarshaller.unmarshal(new URL("https://rss.sciencedaily.com/top.xml"));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(newsFiller, System.out);
    }

    public List<NewsBean> getNewsFromRSS() throws Exception {
        JAXBContext jc = JAXBContext.newInstance(NewsFiller.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        NewsFiller newsFiller = (NewsFiller) unmarshaller.unmarshal(new URL("https://rss.sciencedaily.com/top.xml"));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(newsFiller, System.out);
        return newsFiller.getNewsList();
    }
}
