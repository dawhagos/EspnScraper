package WebScrape;

public class Player implements Comparable<Player> {
    private String name;
    private Double minutes;
    private Integer games;
    private Double per;


    public Player(String name, Double minutes, Integer games, Double per) {
        this.name = name;
        this.minutes = minutes;
        this.games = games;
        this.per = per;
    }

    public Player() {
        name = "Player";
    }

    public String display() {
        return String.format("%-29s| %.2f | %d | %.2f\n", name, minutes, games, per);
    }

    public Integer getGames() {
        return games;
    }

    public Double getPer() {
        return per;
    }

    @Override
    public int compareTo(Player o) {
        return Double.compare(this.minutes, o.minutes);
    }
}
