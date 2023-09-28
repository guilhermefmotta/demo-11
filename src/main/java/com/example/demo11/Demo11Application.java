package com.example.demo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo11Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
	}

  @RestController
  @RequestMapping(value = "health")
  public class Health {

    @GetMapping
    private String ok () {
      return "ok";
    }

    
  }


}
