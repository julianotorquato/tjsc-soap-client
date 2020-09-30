package com.example.tjscsoapclient.web.rest;

import com.example.tjscsoapclient.service.SeloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SeloResource {

    private final Logger log = LoggerFactory.getLogger(SeloResource.class);

    private final SeloService seloService;

    public SeloResource(SeloService seloService) {
        this.seloService = seloService;
    }

    @GetMapping("/selos")
    public ResponseEntity<Object> requestSelo() throws Exception{
        log.debug("REST request to requestSelo : {}");
        Object resposta = seloService.requestSelo();

        log.debug("Resposta: {}", resposta);
        return ResponseEntity.ok(resposta);
    }
}