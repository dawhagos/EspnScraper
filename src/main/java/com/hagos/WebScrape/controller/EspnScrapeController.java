package com.hagos.WebScrape.controller;

import com.hagos.WebScrape.service.EspnScrapeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log
@RequestMapping(path = "/")
@Tag(name = "2021-22 Hollinger NBA Player Statistics")
public class EspnScrapeController {
    final private EspnScrapeService espnScrapeService;

    public EspnScrapeController(EspnScrapeService espnScrapeService) {
        this.espnScrapeService = espnScrapeService;
    }

    @GetMapping(value = "default")
    public ResponseEntity<?> allPlayers() {
        log.info("[/default] GET endpoint invoked");
        return ResponseEntity.ok(espnScrapeService.playersExtractDefaultData());
    }

    @GetMapping(value = "playershighestminutes")
    public ResponseEntity<?> playersHighestMinutes() {
        log.info("[/playershighestminutes] GET endpoint invoked");
        return ResponseEntity.ok(espnScrapeService.playersHighestMinutes());
    }

    @GetMapping(path = "playersbyminutes/{minutes}")
    public ResponseEntity<?> playersByMinutes(@PathVariable double minutes) {
        log.info("[/playersbyminutes] GET endpoint invoked");
        return ResponseEntity.ok(espnScrapeService.playersByMinutes(minutes));
    }
}
