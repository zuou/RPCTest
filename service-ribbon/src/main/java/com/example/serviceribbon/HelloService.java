package com.example.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lipanpan
 * @create 2018-12-27 14:34
 */
@Service
public class HelloService {
@Autowired
    private RestTemplate restTemplate;

@HystrixCommand(fallbackMethod = "hiError")
public String hiService(String name) {
    return restTemplate.getForObject("http://service-clent/hi?name="+name,String.class);
}
public String hiError(String name) {
    return "hi,"+name+",sorry,error!";
}
}