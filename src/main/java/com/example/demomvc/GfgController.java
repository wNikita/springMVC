package com.example.demomvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GfgController {

    @RequestMapping("/welcome")
    @ResponseBody

    public String helloGfg()
    {
        return "Welcome to GeeksForGeeks!";
    }
}

