package ru.netology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {
    HashMap<String,Player> playersList = new HashMap<>();

    public void register(Player player) {
        playersList.put(player.getName(),player);
    }

    public Player findByName(String name) {
            if (playersList.containsKey(name)) {
                return playersList.get(name);
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
