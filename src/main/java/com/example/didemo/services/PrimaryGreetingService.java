package com.example.didemo.services;

import com.example.didemo.repository.GreetingRepository;

public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;


    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}