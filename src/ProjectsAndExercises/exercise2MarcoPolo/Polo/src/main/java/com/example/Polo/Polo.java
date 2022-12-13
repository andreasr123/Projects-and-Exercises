package com.example.Polo;

import org.springframework.stereotype.Service;

@Service
public class Polo {

public String answer(String input){
    return input.equals("Marco") ? "Polo" : "What?";
    }
}


