package pl.idzikpro.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    private String name;
    private List<Player> players;

    public Game(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public Player winner() {
        Collections.sort(players);
        return players.get(players.size()-1);
    }

    public static void main(String[] args) {
        List<Player> playerList= Arrays.asList(
                new Player("Jacek","Placek",220),
                new Player("Kasia","Rzymska",230),
                new Player("Tomasz","Wojciechowski",205)
        );
        Game game=new Game("Gra",playerList);
        System.out.println(game.winner().fullName());
    }
}
