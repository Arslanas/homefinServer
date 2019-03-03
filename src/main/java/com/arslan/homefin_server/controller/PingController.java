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
    private final String server = "https://homefin-server.herokuapp.com";
    private int min = 1;
    private int count;


    @GetMapping()
    public void ping() {
        infinitePingOfServer(server, min);
    }


    private void infinitePingOfServer(String url, int min){
        while (true) {
            sleepFor(min);
            getResponse(url);
            count++;
            System.out.println(count);
        }
    }
    private void getResponse(String url) {
        ResponseEntity<Object> entity = restTemplate.getForEntity(url, Object.class);
    }
    private void sleepFor(int min){
        try {
            Thread.sleep(min * 1000 * 60);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
