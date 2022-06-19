package com.hagos.WebScrape.model;

import lombok.Data;

@Data
public class Player {
    final private String playerName;
    final private int gamesPlayed;
    final private double minutesAverage;
    final private double trueShooting;
    final private double assistRatio;
    final private double turnoverRatio;
    final private double playerEfficiencyRating;
    final private double winsAdded;

    @Override
    public String toString() {
        return String.format("%-29s  %d   %.2f   %.3f   %.1f   %.1f   %.2f   %.1f\n", playerName, gamesPlayed, minutesAverage, trueShooting, assistRatio, turnoverRatio, playerEfficiencyRating, winsAdded);
    }

}
