package com.eureka.sample.SecondEurekaClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondEurekaClient {

    @RequestMapping("/secondClient")
    public String show()
    {
        return "This message coming from Second Eureka Client";
    }
}
