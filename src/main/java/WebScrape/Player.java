package WebScrape;

import lombok.Data;

import java.util.Comparator;

@Data
public class Player {
    final private String playerName;
    final private double minutesAverage;
    final private int gamesPlayed;
    final private double playerEfficiencyRating;

    @Override
    public String toString() {
        return String.format("%-29s| %.2f | %d | %.2f\n", playerName, minutesAverage, gamesPlayed, playerEfficiencyRating);
    }

    public static Comparator<Player> playerNameComparator = new Comparator<>() {
        @Override
        public int compare(Player o1, Player o2) {
            return o1.getPlayerName().compareTo(o2.getPlayerName());
        }
    };

    public static Comparator<Player> playerMinutesComparator = new Comparator<>() {
        @Override
        public int compare(Player o1, Player o2) {
            return Double.compare(o1.getMinutesAverage(), o2.getMinutesAverage());
        }
    };

    public static Comparator<Player> playerGamesPlayedComparator = new Comparator<>() {
        @Override
        public int compare(Player o1, Player o2) {
            return o1.getGamesPlayed() - o2.getGamesPlayed();
        }
    };

}
