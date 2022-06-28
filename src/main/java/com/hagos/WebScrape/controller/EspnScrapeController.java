package com.hagos.WebScrape.controller;

import com.hagos.WebScrape.service.EspnScrapeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log
@RequestMapping(path = "/")
@Tag(name = "2021-22 Hollinger NBA Player Statistics")
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
        model.addAttribute("allplayers", espnScrapeService.playersExtractData());
        return "players";
    }

    @GetMapping(value = "teams")
    public String showAllTeams(Model model) {
        log.info("[/teams] GET endpoint invoked");
        model.addAttribute("allteams", espnScrapeService.teamsExtractData());
        return "teams";
    }


}
