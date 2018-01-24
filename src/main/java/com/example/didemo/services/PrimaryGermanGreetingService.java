package com.example.didemo.services;

import com.example.didemo.repository.GreetingRepository;

public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;


    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
