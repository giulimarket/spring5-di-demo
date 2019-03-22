package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;


/**
 * Created by jt on 5/24/17.
 */

@Controller
public class PropertyInjectedController {

	@Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
