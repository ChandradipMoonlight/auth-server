package com.auth_server.controller;

import com.auth_server.mapper.AppResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/common")
public class CommonController {

    @GetMapping("/secured/test")
    public ResponseEntity<AppResponse> test(){
        return ResponseEntity.ok(AppResponse.getSuccessResponse("secured path testing"));
    }
}
