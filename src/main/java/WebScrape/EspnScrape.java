package WebScrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class EspnScrape {
    public static void main(String[] args) {
        final String url = "http://www.espn.com/nba/hollinger/statistics";
        String[] players = new String[0];
        Integer[] totalGamesPlayed = new Integer[0];
        Double[] totalPlayerEfficiency = new Double[0];
        try {
            final Document document = Jsoup.connect(url).get();
            Elements body = document.select("table.tablehead tr");
            players = new String[body.size() - 6];
            totalGamesPlayed = new Integer[body.size() - 6];
            totalPlayerEfficiency = new Double[body.size() - 6];
            int counter = 0;
            for (Element row : body) {
                if (row.select("td:nth-of-type(2)").text().equals("") || row.select("td:nth-of-type(2)").text().equals("PLAYER")) {
                    continue;
                } else {
                    final String player = row.select("td:nth-of-type(2)").text();
                    final String gp = row.select("td:nth-of-type(3)").text();
                    final String per = row.select(".sortcell").text();
                    final Integer gamesPlayed = Integer.parseInt(gp);
                    final Double playerEfficiency = Double.parseDouble(per);
                    players[counter] = player;
                    totalGamesPlayed[counter] = gamesPlayed;
                    totalPlayerEfficiency[counter] = playerEfficiency;
                    counter++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i=0;i< players.length;i++) {
            System.out.println(players[i] + " | " +  totalGamesPlayed[i] + " | " + totalPlayerEfficiency[i] );
        }
    }
}
