package WebScrape;


import java.util.Arrays;

import static WebScrape.EspnScrape.playerList;

public class TableGenerator {

    /**
     * Generates a table ordered by PER rating from players who have played X amount of games.
     *
     * @param gamesPlayed minimum number of Games Played.
     */
    public static void perByGamesPlayed(int gamesPlayed) {
        System.out.println("BEST PLAYER EFFICIENCY RATING: (" + gamesPlayed + ") GAMES OR MORE");
        System.out.format("%-29s| %s  | %s | %s\n", "PLAYER", "MINS", "GP", "PER");
        for (int i = 0; i < playerList.length; i++) {
            if (playerList[i].getGames() > gamesPlayed) {
                System.out.print(playerList[i].display());
            }
        }
    }

    /**
     * Generates a table ordered by minutes from players who have X PER rating or higher.
     *
     * @param eff minimum player efficiency rating.
     */
    public static void mostMinutesForPer(double eff) {
        System.out.println("MOST MINUTES AVERAGED PER GAME: (" + eff + ") PER OR HIGHER");
        System.out.format("%-29s| %s  | %s | %s\n", "PLAYER", "MINS", "GP", "PER");
        Arrays.sort(playerList);
        for (int i = playerList.length - 1; i >= 0; i--) {
            if (playerList[i].getPer() > eff) {
                System.out.print(playerList[i].display());
            }
        }
    }
}
