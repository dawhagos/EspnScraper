package com.hagos.WebScrape.controller;

import com.hagos.WebScrape.service.EspnScrapeService;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log
@RequestMapping(path = "/")
public class EspnScrapeController {
    final private EspnScrapeService espnScrapeService;

    public EspnScrapeController(EspnScrapeService espnScrapeService) {
        this.espnScrapeService = espnScrapeService;
    }

    @GetMapping(value = "")
    public String home() {
        return "home";
    }

    @GetMapping(value = "players")
    public String showAllPlayers(Model model) {
        log.info("[/players] GET endpoint invoked");
        model.addAttribute("allPlayers", espnScrapeService.playersExtractData());
        return "players";
    }

    @GetMapping(value = "teams")
    public String showAllTeams(Model model) {
        log.info("[/teams] GET endpoint invoked");
        model.addAttribute("allTeams", espnScrapeService.teamsExtractData());
        return "teams";
    }


}
