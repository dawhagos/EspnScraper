package com.hagos.WebScrape.utils;

import com.hagos.WebScrape.model.Player;

import java.util.Comparator;

public class TypeComparator {
    public static Comparator<Player> playerNameComparator = Comparator.comparing(Player::getPlayerName);

    public static Comparator<Player> gamesPlayedComparator = Comparator.comparingInt(Player::getGamesPlayed);

    public static Comparator<Player> minutesComparator = Comparator.comparingDouble(Player::getMinutesAverage);

    public static Comparator<Player> trueShootingComparator = Comparator.comparingDouble(Player::getTrueShooting);

    public static Comparator<Player> assistRatioComparator = Comparator.comparingDouble(Player::getAssistRatio);

    public static Comparator<Player> turnoverRatioComparator = Comparator.comparingDouble(Player::getTurnoverRatio);

    public static Comparator<Player> playerEfficiencyRatingComparator = Comparator.comparingDouble(Player::getPlayerEfficiencyRating);

    public static Comparator<Player> winsAddedComparator = Comparator.comparingDouble(Player::getWinsAdded);
}
