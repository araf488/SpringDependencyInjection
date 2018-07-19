package araf.springframework.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_JAVA = "Hello Java !!!!!";

    @Override
    public String sayGreeting(){
        return HELLO_JAVA;
    }
}
