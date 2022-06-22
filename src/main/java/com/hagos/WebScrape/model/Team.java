package com.hagos.WebScrape.model;

import lombok.Data;

@Data
public class Team {
    private String teamName;
    private double offensiveEfficiency;
    private double defensiveEfficiency;
    private double effectiveFieldGoalPercentage;
    private double trueShooting;
    private double reboundRate;
    private double assistRatio;
    private double turnoverRatio;

}
