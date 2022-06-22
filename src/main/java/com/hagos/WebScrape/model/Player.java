package com.hagos.WebScrape.model;

import lombok.Data;

@Data

public class Player {
    private String playerName;
    private int gamesPlayed;
    private double minutesAverage;
    private double trueShooting;
    private double assistRatio;
    private double turnoverRatio;
    private double playerEfficiencyRating;
    private double winsAdded;

}
