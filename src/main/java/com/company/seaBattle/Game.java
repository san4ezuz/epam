package com.company.seaBattle;

/**
 * This class provide launch game
 */
public class Game {

    public void launchBattle() {
        Field field = new Field();
        Player player = new Player();

        System.out.println("Welcome to SEABATTLE! Sink all enemy ships!");
        field.setField();
        field.showMapWithShips();
        field.showMap();

        do {
            player.getShoot();
            int shootResult = field.doShoot(player.getX(), player.getY());
            if (shootResult == 0) System.out.println("miss!");
            if (shootResult == 1) System.out.println("you've hit a ship!");
            if (shootResult == 2) System.out.println("you've sank the ship!");
            if (shootResult == 3) System.out.println("you've already shot to this cell");
            field.showMap();
        } while (!field.isGameOver());

        System.out.println("Game over.");
    }
}