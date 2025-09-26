package ru.netology;

public class Player implements Comparable<Player> {
    private int id;
    private String name;
    private int strength;

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public int compareTo(Player player2) {
        if (this.strength > player2.getStrength()) {
            return 1;
        } else if (this.strength < player2.getStrength()) {
            return -1;
        } else {
            return 0;
        }
    }
}
