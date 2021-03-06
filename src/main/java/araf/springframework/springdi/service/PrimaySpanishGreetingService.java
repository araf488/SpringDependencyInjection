package araf.springframework.springdi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaySpanishGreetingService implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public PrimaySpanishGreetingService(GreetingRepository greetingRepository) {
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
