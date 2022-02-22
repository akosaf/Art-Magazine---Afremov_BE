package com.codecool.fileshare.requests;

import org.springframework.web.client.RestTemplate;

public class Request {

    public void getRequest() {
        String url = "http://localhost:8080/console";

        RestTemplate restTemplate = new RestTemplate();

        String json = restTemplate.getForObject(url, String.class);

        System.out.println(json);

    }

    public void getRequest(int index) {
        String url = "http://localhost:8080/console/" + index;

        RestTemplate restTemplate = new RestTemplate();

        String json = restTemplate.getForObject(url, String.class);

        System.out.println(json);

    }
}
