package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
    Game game = new Game();

    Player player1 = new Player(1, "Artyom", 40);
    Player player2 = new Player(2, "Vasa", 15);
    Player player3 = new Player(3, "Petya", 25);
    Player player4 = new Player(4, "Slava", 25);
    Player player5 = new Player(5, "Egor", 30);
    Player player6 = new Player(6, "Denis", 10);

    @BeforeEach
    public void setup() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

    }

    @Test

    public void shouldFindByName() {
        Player expected = player3;


        Assertions.assertEquals(expected, game.findByName("Petya"));
    }

    @Test
    public void shouldNotFindByName() {
        Player expected = null;

        Assertions.assertEquals(expected, game.findByName("Matvey"));
    }

    @Test
    public void shouldWinRound() {
        int expected = 1;
        Assertions.assertEquals(expected, game.round("Artyom", "Egor"));
    }

    @Test
    public void shouldLoseRound() {
        int expected = -1;

        Assertions.assertEquals(expected, game.round("Vasa", "Slava"));
    }

    @Test
    public void shouldNotRoundWithoutRegisterTest1() {
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Artyom", "Denis"));
    }

    @Test
    public void shouldNotRoundWithoutRegisterTest2() {
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Denis", "Artyom"));
    }

    @Test
    public void shouldNoubodyWins() {
        int expected = 0;

        Assertions.assertEquals(expected, game.round("Petya", "Slava"));
    }

    @Test
    public void shouldGetId() {
        int expected = 1;
        Assertions.assertEquals(expected, player1.getId());
    }
}