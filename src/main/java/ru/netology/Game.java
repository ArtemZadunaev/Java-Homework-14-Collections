package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> playersList = new ArrayList<>();

    public void register(Player player) {
        playersList.add(player);
    }

    public Player findByName(String name) {
        for (Player player : playersList) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public int round(String playerName1, String playerName2) {
        if (findByName(playerName1) == null || findByName(playerName2) == null) {
            throw new NotRegisteredException("Someone of players not Registered");
        }
        return findByName(playerName1).compareTo(findByName(playerName2));
    }


}
