package com.company.seaBattle;

/**
 * This class creates ships depending on decks input
 */
public class Ship {
    private int x, y;
    private int decks;
    private int killedDecks;
    private boolean isKilled;
    private boolean[] deckState;
    private int deckNumber(int x, int y) {
        return Math.abs(x - this.x) + Math.abs(y - this.y);
    }

    Ship(int x, int y, int decks) {
        killedDecks = 0;
        deckState = new boolean[decks];
        for (int i = 0; i < deckState.length; i++) {
            deckState[i] = true;
        }
        this.x = x;
        this.y = y;
        this.decks = decks;
        isKilled = false;
    }

   public void getShoot(int x, int y) {
        deckState[deckNumber(x, y)] = false;
        killedDecks++;
        if (killedDecks == decks) isKilled = true;
    }
    public boolean isKilled() {
        return isKilled;
    }

    public boolean getState(int x, int y) {
        return deckState[deckNumber(x, y)];
    }
}
