package com.rbobko93.spring5di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pl")
@Primary
public class PrimaryPolishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Witaj - Podstawowy serwis";
    }
}
