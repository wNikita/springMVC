package com.example.demomvc.RequestMapping;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan("com.example.demomvc.RequestMapping")
public class WebConfig extends WebMvcConfigurerAdapter {

}
