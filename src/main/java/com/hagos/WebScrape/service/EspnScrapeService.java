package com.hagos.WebScrape.service;

import com.hagos.WebScrape.model.Player;
import com.hagos.WebScrape.model.Team;

import java.util.ArrayList;

public interface EspnScrapeService {
    ArrayList<Player> playersExtractData();

    ArrayList<Team> teamsExtractData();
}
