package com.vinvith.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" tht return "Hello World"
    @Value("${user.name1}")
    private String userName1;
    @GetMapping
    public String sayHello(){
        System.out.println(userName1);
        return "Hello "+userName1;
    }

    @GetMapping("/workout")
    public String getDaily5kRun(){
        return userName1+" is going for 5k Run!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return userName1+"'s fortune is really good today!";
    }

    @GetMapping("/learn")
    public String getDailyLessons(){
        return userName1+" is learning!";
    }

    @GetMapping("/sleep")
    public String getToBed(){
        return userName1+" is about to sleep now!";
    }
}
