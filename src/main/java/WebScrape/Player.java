package WebScrape;

import java.util.Comparator;

public class Player {
    public String name;
    public double minutes;
    private int games;
    private double per;


    public Player(String name, Double minutes, Integer games, Double per) {
        this.name = name;
        this.minutes = minutes;
        this.games = games;
        this.per = per;
    }

    public String display() {
        return String.format("%-29s| %.2f | %d | %.2f\n", name, minutes, games, per);
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) { this.games = games; }

    public double getPer() {
        return per;
    }

    public void setPer(double per) { this.per = per; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getMinutes() { return minutes; }

    public void setMinutes(double minutes) { this.minutes = minutes; }

    public static Comparator<Player> playerNameComparator = new Comparator<>() {
        public int compare(Player o1, Player o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Player> playerMinutesComparator = new Comparator<>() {
        public int compare(Player o1, Player o2) {
            return Double.compare(o1.getMinutes(), o2.getMinutes());
        }
    };

    public static Comparator<Player> playerGamesPlayedComparator = new Comparator<>() {
        public int compare(Player o1, Player o2) {
            return o1.getGames() - o2.getGames();
        }
    };

}
