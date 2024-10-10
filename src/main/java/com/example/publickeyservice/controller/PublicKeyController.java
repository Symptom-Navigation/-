package com.example.publickeyservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicKeyController {

    @Value("${public.key}")
    private String publicKey;

    @GetMapping("/public-key")
    public String getPublicKey() {
        return publicKey;
    }
}
