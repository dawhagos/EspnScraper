package WebScrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class EspnScrape {
    public static void main(String[] args) {
        final String url = "http://www.espn.com/nba/hollinger/statistics";
        try {
            final Document document = Jsoup.connect(url).get();
            Elements body = document.select("table.tablehead tr");
            for (Element row : body) {
                if (row.select("td:nth-of-type(2)").text().equals("") || row.select("td:nth-of-type(2)").text().equals("PLAYER")) {
                    continue;
                } else {
                    final String player = row.select("td:nth-of-type(2)").text();
                    final String gp = row.select("td:nth-of-type(3)").text();
                    final String per = row.select(".sortcell").text();
                    final int gamesPlayed = Integer.parseInt(gp);
                    final double playerEfficiency = Double.parseDouble(per);
                    System.out.println(player + "  " + gp + "  " + playerEfficiency);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
