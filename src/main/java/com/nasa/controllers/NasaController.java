package com.nasa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/nasa")
@RestController
public class NasaController {
    private String nasaApodEndpoint = "https://api.nasa.gov/planetary/apod?api_key=";
    private String apiKey = "fDsVUxHsc9BwJCrAekBlD5ibCyx2dnrYSoIKaVNd";

    @GetMapping("apod")
    public Object apodHandler(RestTemplate restTemplate) {
        return restTemplate.getForObject(nasaApodEndpoint + apiKey, Object.class);
    }

}
