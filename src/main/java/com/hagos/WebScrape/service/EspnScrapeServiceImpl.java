package com.hagos.WebScrape.service;

import com.hagos.WebScrape.model.Player;
import com.hagos.WebScrape.utils.TypeComparator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class EspnScrapeServiceImpl implements EspnScrapeService {

    @Override
    public ArrayList<Player> playersExtractDefaultData() {
        final String url = "http://www.espn.com/nba/hollinger/statistics";
        ArrayList<Player> playerList;
        try {
            final Document document = Jsoup.connect(url).get();
            Elements body = document.select("table.tablehead tr");
            playerList = new ArrayList<>(body.size() - 6);
            for (Element row : body) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {
                    final String playerName = row.select("td:nth-of-type(2)").text();
                    final String mins = row.select("td:nth-of-type(4)").text();
                    final String games = row.select("td:nth-of-type(3)").text();
                    final String per = row.select(".sortcell").text();
                    final String shooting = row.select("td:nth-of-type(5)").text();
                    final String assists = row.select("td:nth-of-type(6)").text();
                    final String turnovers = row.select("td:nth-of-type(7)").text();
                    final String wins = row.select("td:nth-of-type(14)").text();
                    final double minutesAverage = Double.parseDouble(mins);
                    final double trueShooting = Double.parseDouble(shooting);
                    final double assistRatio = Double.parseDouble(assists);
                    final double turnoverRatio = Double.parseDouble(turnovers);
                    final double winsAdded = Double.parseDouble(wins);
                    final int gamesPlayed = Integer.parseInt(games);
                    final double playerEfficiencyRating = Double.parseDouble(per);
                    Player newPlayer = new Player(playerName, gamesPlayed, minutesAverage, trueShooting, assistRatio, turnoverRatio, playerEfficiencyRating, winsAdded);
                    playerList.add(newPlayer);
                }
            }
            return playerList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Player> playersFirstNameAlphabetical() {
        final String url = "http://www.espn.com/nba/hollinger/statistics";
        ArrayList<Player> playerList;
        try {
            final Document document = Jsoup.connect(url).get();
            Elements body = document.select("table.tablehead tr");
            playerList = new ArrayList<>(body.size() - 6);
            for (Element row : body) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {
                    final String playerName = row.select("td:nth-of-type(2)").text();
                    final String mins = row.select("td:nth-of-type(4)").text();
                    final String games = row.select("td:nth-of-type(3)").text();
                    final String per = row.select(".sortcell").text();
                    final String shooting = row.select("td:nth-of-type(5)").text();
                    final String assists = row.select("td:nth-of-type(6)").text();
                    final String turnovers = row.select("td:nth-of-type(7)").text();
                    final String wins = row.select("td:nth-of-type(14)").text();
                    final double minutesAverage = Double.parseDouble(mins);
                    final double trueShooting = Double.parseDouble(shooting);
                    final double assistRatio = Double.parseDouble(assists);
                    final double turnoverRatio = Double.parseDouble(turnovers);
                    final double winsAdded = Double.parseDouble(wins);
                    final int gamesPlayed = Integer.parseInt(games);
                    final double playerEfficiencyRating = Double.parseDouble(per);
                    Player newPlayer = new Player(playerName, gamesPlayed, minutesAverage, trueShooting, assistRatio, turnoverRatio, playerEfficiencyRating, winsAdded);
                    playerList.add(newPlayer);
                }
            }
            playerList.sort(TypeComparator.playerNameComparator);
            return playerList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Player> playersHighestMinutes() {
        final String url = "http://www.espn.com/nba/hollinger/statistics";
        ArrayList<Player> playerList;
        try {
            final Document document = Jsoup.connect(url).get();
            Elements body = document.select("table.tablehead tr");
            playerList = new ArrayList<>(body.size() - 6);
            for (Element row : body) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {
                    final String playerName = row.select("td:nth-of-type(2)").text();
                    final String mins = row.select("td:nth-of-type(4)").text();
                    final String games = row.select("td:nth-of-type(3)").text();
                    final String per = row.select(".sortcell").text();
                    final String shooting = row.select("td:nth-of-type(5)").text();
                    final String assists = row.select("td:nth-of-type(6)").text();
                    final String turnovers = row.select("td:nth-of-type(7)").text();
                    final String wins = row.select("td:nth-of-type(14)").text();
                    final double minutesAverage = Double.parseDouble(mins);
                    final double trueShooting = Double.parseDouble(shooting);
                    final double assistRatio = Double.parseDouble(assists);
                    final double turnoverRatio = Double.parseDouble(turnovers);
                    final double winsAdded = Double.parseDouble(wins);
                    final int gamesPlayed = Integer.parseInt(games);
                    final double playerEfficiencyRating = Double.parseDouble(per);
                    Player newPlayer = new Player(playerName, gamesPlayed, minutesAverage, trueShooting, assistRatio, turnoverRatio, playerEfficiencyRating, winsAdded);
                    playerList.add(newPlayer);
                }
            }
            playerList.sort(TypeComparator.minutesComparator);
            Collections.reverse(playerList);
            return playerList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Player> playersByMinutes(double minutes) {
        final String url = "http://www.espn.com/nba/hollinger/statistics";
        ArrayList<Player> playerList;
        try {
            final Document document = Jsoup.connect(url).get();
            Elements body = document.select("table.tablehead tr");
            playerList = new ArrayList<>(body.size() - 6);
            for (Element row : body) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {
                    final String playerName = row.select("td:nth-of-type(2)").text();
                    final String mins = row.select("td:nth-of-type(4)").text();
                    final String games = row.select("td:nth-of-type(3)").text();
                    final String per = row.select(".sortcell").text();
                    final String shooting = row.select("td:nth-of-type(5)").text();
                    final String assists = row.select("td:nth-of-type(6)").text();
                    final String turnovers = row.select("td:nth-of-type(7)").text();
                    final String wins = row.select("td:nth-of-type(14)").text();
                    final double minutesAverage = Double.parseDouble(mins);
                    final double trueShooting = Double.parseDouble(shooting);
                    final double assistRatio = Double.parseDouble(assists);
                    final double turnoverRatio = Double.parseDouble(turnovers);
                    final double winsAdded = Double.parseDouble(wins);
                    final int gamesPlayed = Integer.parseInt(games);
                    final double playerEfficiencyRating = Double.parseDouble(per);
                    if (minutesAverage > minutes) {
                        Player newPlayer = new Player(playerName, gamesPlayed, minutesAverage, trueShooting, assistRatio, turnoverRatio, playerEfficiencyRating, winsAdded);
                        playerList.add(newPlayer);
                    }
                }
            }
            return playerList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
