package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;

import configuration.JwtFilter;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2 // This might be in your main application class or a configuration class
public class RestaurantManagementSystemUpdatedApplication 
{

    //@Bean
    public FilterRegistrationBean<JwtFilter> jwtFilter() 
    {
        FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new JwtFilter());
        registrationBean.addUrlPatterns("/api/*");
        return registrationBean;
    }

    public static void main(String[] args) 
    {
        SpringApplication.run(RestaurantManagementSystemUpdatedApplication.class, args);
        System.out.println("Welcome to Restaurant management system");
    }

}


	 
	


