package com.arslan.homefin_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("ping")
public class PingController {
    @Autowired
    RestTemplate restTemplate;
    private final String server = "https://pizzars.herokuapp.com/ping/pingResponse";
    private double min = 20;
    private int count;
    private int responseCount;


    @GetMapping()
    public void ping() {
        infinitePingOfServer(server, min);
    }
    @GetMapping("pingResponse")
    public String pingResponse() {
        responseCount++;
        return "HomefinServer_response_OK";
    }
    @GetMapping("getResponseCount")
    public int getResponseCount() {
        return responseCount;
    }


    private void infinitePingOfServer(String url, double min){
        while (true) {
            getResponse(url);
            count++;
            System.out.println(count);
            sleepFor(min);
        }
    }
    private void getResponse(String url) {
        ResponseEntity<Object> entity = restTemplate.getForEntity(url, Object.class);
    }
    private void sleepFor(double min){
        long time = (long) min * 1000 * 60;
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}