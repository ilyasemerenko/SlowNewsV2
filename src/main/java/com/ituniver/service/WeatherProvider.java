package com.ituniver.service;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.*;

public class WeatherProvider {

    public String getWeather(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.forecast.io").path("/forecast/ccc9e70f9fbe7b36c2ceea0201205811/50.450100,30.523400");

        String bean = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        JSONParser parser = new JSONParser();
        List weatherList = new ArrayList();

        try{
            JSONObject jsonObj = (JSONObject)parser.parse(bean);
            JSONObject currently = (JSONObject) jsonObj.get("currently");


            int temperature = (int) Math.round((((Double)currently.get("temperature") - 32)*5)/9);

            weatherList.add( currently.get("summary"));
            weatherList.add(temperature);

        } catch(ParseException pe){
            System.out.println("position: " + pe.getPosition());
        }
        return new String("Weather: " + weatherList.get(0) + ", t=" + weatherList.get(1) + "\\u00b0" + "C");
    }
}
