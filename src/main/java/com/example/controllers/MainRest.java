package com.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LeoVS09 on 10.09.2016.
 */

@RestController
public class MainRest {
    private static final Logger log = LoggerFactory.getLogger(MainRest.class);

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping(value="/page/{name}",method = RequestMethod.GET)
    public String getPage(@RequestHeader HttpHeaders headers, @PathVariable String name){
        log.info("getPage");
        return name;
    }
}
