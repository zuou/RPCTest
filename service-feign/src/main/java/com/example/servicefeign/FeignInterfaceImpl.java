package com.example.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author Lipanpan
 * @create 2018-12-28 12:33
 */
@Component
public class FeignInterfaceImpl implements FeignInterface {

    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry," + name;
    }
}