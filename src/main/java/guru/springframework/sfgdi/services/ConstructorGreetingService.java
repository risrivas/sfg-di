package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by rishi on 03/06/2021
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
