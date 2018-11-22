package net.atos.jx.test.demo.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoResource {

    @GetMapping("/demo")
    public String getDemo() {
        return "It's alive!";
    }

}