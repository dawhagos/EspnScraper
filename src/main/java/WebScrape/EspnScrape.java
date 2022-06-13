package WebScrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class EspnScrape {

    public static ArrayList<Player> playerList;

    public static void main(String[] args) {
        final String url = "http://www.espn.com/nba/hollinger/statistics";
        try {
            final Document document = Jsoup.connect(url).get();
            Elements body = document.select("table.tablehead tr");
            playerList = new ArrayList<>(body.size() - 6);
            for (Element row : body) {
                if (!row.select("td:nth-of-type(2)").text().equals("") && !row.select("td:nth-of-type(2)").text().equals("PLAYER")) {
                    final String player = row.select("td:nth-of-type(2)").text();
                    final String min = row.select("td:nth-of-type(4)").text();
                    final String gp = row.select("td:nth-of-type(3)").text();
                    final String per = row.select(".sortcell").text();
                    final double minutes = Double.parseDouble(min);
                    final int gamesPlayed = Integer.parseInt(gp);
                    final Double playerEfficiency = Double.parseDouble(per);
                    Player newPlayer = new Player(player, minutes, gamesPlayed, playerEfficiency);
                    playerList.add(newPlayer);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        TableGenerator.perByGamesPlayed(70);
//        TableGenerator.mostMinutesForPer(25.3);
//        TableGenerator.mostGamesForPer(21.2);
//        TableGenerator.alpha();


    }
}
