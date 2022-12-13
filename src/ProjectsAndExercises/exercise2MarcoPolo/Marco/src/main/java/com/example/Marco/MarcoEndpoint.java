package com.example.Marco;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marco")
public class MarcoEndpoint {

    private final PoloClient poloClient;

    public MarcoEndpoint(PoloClient poloClient) {
        this.poloClient = poloClient;
    }

    @GetMapping("/{input}")
    String get(@PathVariable String input){
        return poloClient.post(input);
    }
}
