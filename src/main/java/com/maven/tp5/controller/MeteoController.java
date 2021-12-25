package com.maven.tp5.controller;

import com.maven.tp5.model.AddressCourt;
import com.maven.tp5.objectFromRequest.meteo.*;
import com.maven.tp5.objectFromRequest.address.AddressQueryResult;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class MeteoController {

    @PostMapping(value = "/meteo",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String meteo(@ModelAttribute AddressCourt address, Model model){
        model.addAttribute("addresse",address);

        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate restTemplate = builder.build();


        double[] coordinate = getAddress(restTemplate, model, address.getAddress());
        getMeteo(restTemplate, model, coordinate[1], coordinate[0]);


        return "meteo";
    }

    private double[] getAddress(RestTemplate restTemplate, Model model, String addressMeteo){
        String uri = "https://api-adresse.data.gouv.fr/search/?limit=1&q=" + addressMeteo.replace(" ","+");

        AddressQueryResult result = restTemplate.getForObject(uri, AddressQueryResult.class);

        String name = result.getFeatures()[0].getProperties().getName();
        String city = result.getFeatures()[0].getProperties().getCity() + ", " +result.getFeatures()[0].getProperties().getContext();

        double lon = result.getFeatures()[0].getGeometry().getCoordinates()[0];
        double lat = result.getFeatures()[0].getGeometry().getCoordinates()[1];


        model.addAttribute("name", name);
        model.addAttribute("city", city);
        model.addAttribute("lon", lon);
        model.addAttribute("lat", lat);

        return new double[]{lon, lat};
    }


    private void getMeteo(RestTemplate restTemplate, Model model, double lat, double lon){
        String uri = "https://api.meteo-concept.com/api/forecast/daily?"+
                "token=267baadd7aee4b7fa0b9380996a1a90a69ba49b60bb94dea70fccc1870bfd2d5&" +
                "latlng="+lat + "," + lon;


        MeteoQueryResult result = restTemplate.getForObject(uri, MeteoQueryResult.class);

        int probrain = result.getForecast()[0].getProbrain();
        int tmin = result.getForecast()[0].getTmin();
        int tmax = result.getForecast()[0].getTmax();
        int weather = result.getForecast()[0].getWeather();

        model.addAttribute("probrain",probrain);
        model.addAttribute("tmin",tmin);
        model.addAttribute("tmax",tmax);
        model.addAttribute("weather",weather);
    }

}
