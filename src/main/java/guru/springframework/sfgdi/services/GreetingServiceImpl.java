package guru.springframework.sfgdi.services;

/**
 * Created by rishi on 03/06/2021
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
