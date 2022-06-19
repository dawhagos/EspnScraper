//package com.hagos.WebScrape;
//
//import com.hagos.WebScrape.model.Player;
//
//import java.util.Comparator;
//
//public class TypeComparator {
//    public static Comparator<Player> playerNameComparator = (o1, o2) -> o1.getPlayerName().compareTo(o2.getPlayerName());
//
//    public static Comparator<Player> gamesPlayedComparator = (o1, o2) -> o1.getGamesPlayed() - o2.getGamesPlayed();
//
//    public static Comparator<Player> minutesComparator = (o1, o2) -> Double.compare(o1.getMinutesAverage(), o2.getMinutesAverage());
//
//    public static Comparator<Player> trueShootingComparator = (o1, o2) -> Double.compare(o1.getTrueShooting(), o2.getTrueShooting());
//
//    public static Comparator<Player> assistRatioComparator = (o1, o2) -> Double.compare(o1.getAssistRatio(), o2.getAssistRatio());
//
//    public static Comparator<Player> turnoverRatioComparator = (o1, o2) -> Double.compare(o1.getTurnoverRatio(), o2.getTurnoverRatio());
//
//    public static Comparator<Player> playerEfficiencyRatingComparator = (o1, o2) -> Double.compare(o1.getPlayerEfficiencyRating(), o2.getPlayerEfficiencyRating());
//
//    public static Comparator<Player> winsAddedComparator = (o1, o2) -> Double.compare(o1.getWinsAdded(), o2.getWinsAdded());
//}
