package com.example.Polo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polo")
public class PoloEndpoint {

    private Polo polo;

    public PoloEndpoint(Polo polo) {
        this.polo = polo;
    }

    @PostMapping
    String post(@RequestBody String input){
     return polo.answer(input);
    }

}
