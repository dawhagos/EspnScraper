//package com.hagos.WebScrape;
//
//import java.util.Collections;
//
//public class TableGenerator {
//
//    public static void defaultTable() {
//        System.out.println("2021-22 Hollinger NBA Player Statistics");
//        System.out.format("%-29s  %s   %s     %s      %s     %s    %s     %s\n", "PLAYER", "GP", "MINS", "TS", "AR", "TR", "PER", "WA");
//        for (Player player : EspnScrapeApplication.playerList) {
//            System.out.print(player);
//        }
//    }
//
//    /**
//     * Generates a table ordered by PER rating from players who have played X amount of games.
//     *
//     * @param gamesPlayed minimum number of Games Played.
//     */
//    public static void perByGamesPlayed(int gamesPlayed) {
//        System.out.println("BEST PLAYER EFFICIENCY RATING: (" + gamesPlayed + ") GAMES OR MORE");
//        System.out.format("%-29s  %s   %s     %s      %s     %s    %s     %s\n", "PLAYER", "GP", "MINS", "TS", "AR", "TR", "PER", "WA");
//        for (Player player : EspnScrapeApplication.playerList) {
//            if (player.getGamesPlayed() > gamesPlayed) {
//                System.out.print(player);
//            }
//        }
//    }
//
//    /**
//     * Generates a table ordered by minutes from players who have X PER rating or higher.
//     *
//     * @param playerEfficiencyRating minimum player efficiency rating.
//     */
//    public static void mostMinutesForPer(double playerEfficiencyRating) {
//        System.out.println("MOST MINUTES AVERAGED PER GAME: (" + playerEfficiencyRating + ") PER OR HIGHER");
//        System.out.format("%-29s  %s   %s     %s      %s     %s    %s     %s\n", "PLAYER", "GP", "MINS", "TS", "AR", "TR", "PER", "WA");
//        EspnScrapeApplication.playerList.sort(TypeComparator.minutesComparator);
//        Collections.reverse(EspnScrapeApplication.playerList);
//        for (Player player : EspnScrapeApplication.playerList) {
//            if (player.getPlayerEfficiencyRating() > playerEfficiencyRating) {
//                System.out.print(player);
//            }
//        }
//    }
//
//    /**
//     * Generates a table ordered by the number of games played from players who have X PER rating or higher.
//     *
//     * @param playerEfficiencyRating minimum player efficiency rating.
//     */
//    public static void mostGamesForPer(double playerEfficiencyRating) {
//        System.out.println("MOST GAMES PLAYED THIS SEASON: (" + playerEfficiencyRating + ") PER OR HIGHER");
//        System.out.format("%-29s| %s  | %s | %s\n", "PLAYER", "MINS", "GP", "PER");
//        EspnScrapeApplication.playerList.sort(TypeComparator.gamesPlayedComparator);
//        Collections.reverse(EspnScrapeApplication.playerList);
//        for (Player player : EspnScrapeApplication.playerList) {
//            if (player.getPlayerEfficiencyRating() > playerEfficiencyRating) {
//                System.out.print(player);
//            }
//        }
//    }
//
//    /**
//     * Generates a table sorted in Alphabetical order.
//     */
//    public static void alpha() {
//        System.out.println("ALPHABETICAL ORDER");
//        System.out.format("%-29s  %s   %s     %s      %s     %s    %s     %s\n", "PLAYER", "GP", "MINS", "TS", "AR", "TR", "PER", "WA");
//        EspnScrapeApplication.playerList.sort(TypeComparator.playerNameComparator);
//        for (Player player : EspnScrapeApplication.playerList) {
//            System.out.print(player);
//        }
//    }
//
//    // alphabetical order by last name
//}
