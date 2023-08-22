package com.example.demomvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan("com.example.demomvc")
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter {
}
