package com.gogozs.consumeruser01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerUser01Application {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerUser01Application.class, args);
  }

  @Bean
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
