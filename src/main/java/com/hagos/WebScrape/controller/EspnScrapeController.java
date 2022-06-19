package com.hagos.WebScrape.controller;

import com.hagos.WebScrape.model.Player;
import com.hagos.WebScrape.service.EspnScrapeService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@Log
public class EspnScrapeController {
    @Autowired
    EspnScrapeService espnScrapeService;

    @GetMapping(value = "/default")
    public ResponseEntity<?> allPlayers() {
        log.info("[/default] GET endpoint invoked");
        return ResponseEntity.ok(espnScrapeService.extractDataFromEspn());
    }
}
