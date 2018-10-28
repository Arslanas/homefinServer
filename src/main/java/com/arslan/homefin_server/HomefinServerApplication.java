package com.arslan.homefin_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

@SpringBootApplication
@EnableWebSecurity(debug = true)
public class HomefinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomefinServerApplication.class, args);
    }

//    @Bean
//    @Order(Ordered.HIGHEST_PRECEDENCE)
//    public Filter characterEncodingFilter() {
//        CharacterEncodingFilter filter = new CharacterEncodingFilter();
//        filter.setEncoding("UTF-8");
//        filter.setForceEncoding(true);
//        return filter;
//    }

}
