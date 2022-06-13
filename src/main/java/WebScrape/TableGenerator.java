package WebScrape;

import java.util.Collections;

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
        for (Player player : playerList) {
            if (player.getGames() > gamesPlayed) {
                System.out.print(player.display());
            }
        }
    }

    /**
     * Generates a table ordered by minutes from players who have X PER rating or higher.
     *
     * @param per minimum player efficiency rating.
     */
    public static void mostMinutesForPer(double per) {
        System.out.println("MOST MINUTES AVERAGED PER GAME: (" + per + ") PER OR HIGHER");
        System.out.format("%-29s| %s  | %s | %s\n", "PLAYER", "MINS", "GP", "PER");
        Collections.sort(playerList, Player.playerMinutesComparator);
        Collections.reverse(playerList);
        for (Player player : playerList) {
            if (player.getPer() > per) {
                System.out.print(player.display());
            }
        }
    }

    /**
     * Generates a table ordered by the number of games played from players who have X PER rating or higher.
     *
     * @param per minimum player efficiency rating.
     */
    public static void mostGamesForPer(double per) {
        System.out.println("MOST GAMES PLAYED THIS SEASON: (" + per + ") PER OR HIGHER");
        System.out.format("%-29s| %s  | %s | %s\n", "PLAYER", "MINS", "GP", "PER");
        Collections.sort(playerList, Player.playerGamesPlayedComparator);
        Collections.reverse(playerList);
        for (Player player : playerList) {
            if (player.getPer() > per) {
                System.out.print(player.display());
            }
        }
    }

    /**
     * Generates a table sorted in Alphabetical order.
     */
    public static void alpha() {
        System.out.println("ALPHABETICAL ORDER");
        System.out.format("%-29s| %s  | %s | %s\n", "PLAYER", "MINS", "GP", "PER");
        Collections.sort(playerList, Player.playerNameComparator);
        for (Player player : playerList) {
            System.out.print(player.display());
        }
    }


}
