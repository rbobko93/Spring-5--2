package com.rbobko93.spring5di.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the constructor";
    }
}
