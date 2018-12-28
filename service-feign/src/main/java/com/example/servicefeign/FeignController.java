package com.example.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lipanpan
 * @create 2018-12-27 17:29
 */
@RestController
public class FeignController {
    @Autowired
    private FeignInterface feignInterface;

    @GetMapping(value = "/hi")
    public String feighSayHi(@RequestParam String name) {
        return feignInterface.sayHiFromClientOne(name);
    }
}