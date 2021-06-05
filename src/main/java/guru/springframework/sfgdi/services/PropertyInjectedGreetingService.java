package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by rishi on 06/06/2021
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
