package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;
//@Service - tells Spring it is a spring management component and to bring it to the Spring context.
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
