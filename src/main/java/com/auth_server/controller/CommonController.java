package com.auth_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CommonController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, Boolean>> checkHealth() {
        return ResponseEntity.ok().body(Map.ofEntries(Map.entry("success", true)));
    }
}
