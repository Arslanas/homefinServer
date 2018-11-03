package com.arslan.homefin_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@SpringBootApplication
public class HomefinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomefinServerApplication.class, args);
    }

}
