package com.codecool.fileshare.requests;

import org.springframework.web.client.RestTemplate;

public class Request {

    public void getRequest() {
        // request url
        String url = "http://localhost:8080/console";

        // create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // make an HTTP GET request
        String json = restTemplate.getForObject(url, String.class);

        // print json
        System.out.println(json);

    }
    public void getRequest(int index) {
        // request url
        String url = "http://localhost:8080/console/" + index;

        // create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // make an HTTP GET request
        String json = restTemplate.getForObject(url, String.class);

        // print json
        System.out.println(json);

    }
}
