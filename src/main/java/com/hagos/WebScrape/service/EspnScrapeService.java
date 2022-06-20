package com.hagos.WebScrape.service;

import com.hagos.WebScrape.model.Player;

import java.util.ArrayList;

public interface EspnScrapeService {
    ArrayList<Player> playersExtractDefaultData();
    ArrayList<Player> playersFirstNameAlphabetical();
    ArrayList<Player> playersHighestMinutes();
    ArrayList<Player> playersByMinutes(double minutes);
}
