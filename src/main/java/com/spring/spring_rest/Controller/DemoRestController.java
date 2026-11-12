package com.spring.spring_rest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for handling demo HTTP requests.
 */
@RestController
@RequestMapping("/test")
public class DemoRestController {

    /**
     * Handles GET requests to the /test/hello endpoint.
     *
     * @return a greeting message
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}