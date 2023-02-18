package com.example.sims4interface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {

    @PostMapping("/command")
    public String command(String command) {
        return "Command: " + command;
    }
}
