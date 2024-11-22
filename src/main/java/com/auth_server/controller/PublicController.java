package com.auth_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, Boolean>> checkHealth() {
        return ResponseEntity.ok().body(Map.ofEntries(Map.entry("success", true)));
    }

    @RequestMapping("/check")
    public String running() {
        return "OK";
    }
}
