package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Component;

/**
 * Created by rishi on 02/06/2021
 */
@Component
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!");
        return "Hi Folks";
    }

}
