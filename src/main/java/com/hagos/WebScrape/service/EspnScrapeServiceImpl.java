package com.hagos.WebScrape.service;

import com.hagos.WebScrape.model.Player;
import com.hagos.WebScrape.model.Team;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EspnScrapeServiceImpl implements EspnScrapeService {

    @Override
    public ArrayList<Player> playersExtractData() {
        ArrayList<Player> playerList;
        try {
            final Document page1 = Jsoup.connect("http://www.espn.com/nba/hollinger/statistics").get();
            final Document page2 = Jsoup.connect("http://www.espn.com/nba/hollinger/statistics/_/page/2").get();
            final Document page3 = Jsoup.connect("http://www.espn.com/nba/hollinger/statistics/_/page/3").get();
            final Document page4 = Jsoup.connect("http://www.espn.com/nba/hollinger/statistics/_/page/4").get();
            final Document page5 = Jsoup.connect("http://www.espn.com/nba/hollinger/statistics/_/page/5").get();
            final Document page6 = Jsoup.connect("http://www.espn.com/nba/hollinger/statistics/_/page/6").get();
            final Document page7 = Jsoup.connect("http://www.espn.com/nba/hollinger/statistics/_/page/7").get();
            final Document page8 = Jsoup.connect("http://www.espn.com/nba/hollinger/statistics/_/page/8").get();

            Elements body1 = page1.select("table.tablehead tr");
            Elements body2 = page2.select("table.tablehead tr");
            Elements body3 = page3.select("table.tablehead tr");
            Elements body4 = page4.select("table.tablehead tr");
            Elements body5 = page5.select("table.tablehead tr");
            Elements body6 = page6.select("table.tablehead tr");
            Elements body7 = page7.select("table.tablehead tr");
            Elements body8 = page8.select("table.tablehead tr");

            playerList = new ArrayList<>((body1.size() * 8) - 48);
            for (Element row : body1) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {

                    Player newPlayer = new Player();
                    newPlayer.setPlayerName(row.select("td:nth-of-type(2)").text());
                    newPlayer.setGamesPlayed(Integer.parseInt(row.select("td:nth-of-type(3)").text()));
                    newPlayer.setMinutesAverage(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newPlayer.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    newPlayer.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(6)").text()));
                    newPlayer.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(7)").text()));
                    newPlayer.setPlayerEfficiencyRating(Double.parseDouble(row.select(".sortcell").text()));
                    newPlayer.setWinsAdded(Double.parseDouble(row.select("td:nth-of-type(14)").text()));
                    playerList.add(newPlayer);
                }
            }
            for (Element row : body2) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {

                    Player newPlayer = new Player();
                    newPlayer.setPlayerName(row.select("td:nth-of-type(2)").text());
                    newPlayer.setGamesPlayed(Integer.parseInt(row.select("td:nth-of-type(3)").text()));
                    newPlayer.setMinutesAverage(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newPlayer.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    newPlayer.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(6)").text()));
                    newPlayer.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(7)").text()));
                    newPlayer.setPlayerEfficiencyRating(Double.parseDouble(row.select(".sortcell").text()));
                    newPlayer.setWinsAdded(Double.parseDouble(row.select("td:nth-of-type(14)").text()));
                    playerList.add(newPlayer);
                }
            }
            for (Element row : body3) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {

                    Player newPlayer = new Player();
                    newPlayer.setPlayerName(row.select("td:nth-of-type(2)").text());
                    newPlayer.setGamesPlayed(Integer.parseInt(row.select("td:nth-of-type(3)").text()));
                    newPlayer.setMinutesAverage(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newPlayer.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    newPlayer.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(6)").text()));
                    newPlayer.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(7)").text()));
                    newPlayer.setPlayerEfficiencyRating(Double.parseDouble(row.select(".sortcell").text()));
                    newPlayer.setWinsAdded(Double.parseDouble(row.select("td:nth-of-type(14)").text()));
                    playerList.add(newPlayer);
                }
            }
            for (Element row : body4) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {

                    Player newPlayer = new Player();
                    newPlayer.setPlayerName(row.select("td:nth-of-type(2)").text());
                    newPlayer.setGamesPlayed(Integer.parseInt(row.select("td:nth-of-type(3)").text()));
                    newPlayer.setMinutesAverage(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newPlayer.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    newPlayer.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(6)").text()));
                    newPlayer.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(7)").text()));
                    newPlayer.setPlayerEfficiencyRating(Double.parseDouble(row.select(".sortcell").text()));
                    newPlayer.setWinsAdded(Double.parseDouble(row.select("td:nth-of-type(14)").text()));
                    playerList.add(newPlayer);
                }
            }
            for (Element row : body5) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {

                    Player newPlayer = new Player();
                    newPlayer.setPlayerName(row.select("td:nth-of-type(2)").text());
                    newPlayer.setGamesPlayed(Integer.parseInt(row.select("td:nth-of-type(3)").text()));
                    newPlayer.setMinutesAverage(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newPlayer.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    newPlayer.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(6)").text()));
                    newPlayer.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(7)").text()));
                    newPlayer.setPlayerEfficiencyRating(Double.parseDouble(row.select(".sortcell").text()));
                    newPlayer.setWinsAdded(Double.parseDouble(row.select("td:nth-of-type(14)").text()));
                    playerList.add(newPlayer);
                }
            }
            for (Element row : body6) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {

                    Player newPlayer = new Player();
                    newPlayer.setPlayerName(row.select("td:nth-of-type(2)").text());
                    newPlayer.setGamesPlayed(Integer.parseInt(row.select("td:nth-of-type(3)").text()));
                    newPlayer.setMinutesAverage(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newPlayer.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    newPlayer.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(6)").text()));
                    newPlayer.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(7)").text()));
                    newPlayer.setPlayerEfficiencyRating(Double.parseDouble(row.select(".sortcell").text()));
                    newPlayer.setWinsAdded(Double.parseDouble(row.select("td:nth-of-type(14)").text()));
                    playerList.add(newPlayer);
                }
            }
            for (Element row : body7) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {

                    Player newPlayer = new Player();
                    newPlayer.setPlayerName(row.select("td:nth-of-type(2)").text());
                    newPlayer.setGamesPlayed(Integer.parseInt(row.select("td:nth-of-type(3)").text()));
                    newPlayer.setMinutesAverage(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newPlayer.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    newPlayer.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(6)").text()));
                    newPlayer.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(7)").text()));
                    newPlayer.setPlayerEfficiencyRating(Double.parseDouble(row.select(".sortcell").text()));
                    newPlayer.setWinsAdded(Double.parseDouble(row.select("td:nth-of-type(14)").text()));
                    playerList.add(newPlayer);
                }
            }
            for (Element row : body8) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {

                    Player newPlayer = new Player();
                    newPlayer.setPlayerName(row.select("td:nth-of-type(2)").text());
                    newPlayer.setGamesPlayed(Integer.parseInt(row.select("td:nth-of-type(3)").text()));
                    newPlayer.setMinutesAverage(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newPlayer.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    newPlayer.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(6)").text()));
                    newPlayer.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(7)").text()));
                    newPlayer.setPlayerEfficiencyRating(Double.parseDouble(row.select(".sortcell").text()));
                    newPlayer.setWinsAdded(Double.parseDouble(row.select("td:nth-of-type(14)").text()));
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
    public ArrayList<Team> teamsExtractData() {
        ArrayList<Team> teamList;
        try {
            final Document document = Jsoup.connect("http://www.espn.com/nba/hollinger/teamstats").get();
            Elements body = document.select("table.tablehead tr");
            teamList = new ArrayList<>(body.size() - 6);
            for (Element row : body) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("TEAM")) {

                    Team newTeam = new Team();
                    newTeam.setTeamName(row.select("td:nth-of-type(2)").text());
                    newTeam.setOffensiveEfficiency(Double.parseDouble(row.select(".sortcell").text()));
                    newTeam.setDefensiveEfficiency(Double.parseDouble(row.select("td:nth-of-type(12)").text()));
                    newTeam.setEffectiveFieldGoalPercentage(Double.parseDouble(row.select("td:nth-of-type(9)").text()));
                    newTeam.setTrueShooting(Double.parseDouble(row.select("td:nth-of-type(10)").text()));
                    newTeam.setReboundRate(Double.parseDouble(row.select("td:nth-of-type(8)").text()));
                    newTeam.setAssistRatio(Double.parseDouble(row.select("td:nth-of-type(4)").text()));
                    newTeam.setTurnoverRatio(Double.parseDouble(row.select("td:nth-of-type(5)").text()));
                    teamList.add(newTeam);
                }
            }
            return teamList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
