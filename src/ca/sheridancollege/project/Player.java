/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
abstract class Player {
    protected String name;
    protected List<BlackjackCard> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void addCard(BlackjackCard card) {
        hand.add(card);
    }

    public int calculateHandValue() {
        int value = 0;
        int aces = 0;
        for (BlackjackCard card : hand) {
            int cardValue = card.getValue();
            if (cardValue > 10) cardValue = 10; // Face cards are worth 10
            if (cardValue == 1) aces++; // Count Aces separately
            value += cardValue;
        }

        // Handle Aces: 1 or 11
        while (aces > 0 && value + 10 <= 21) {
            value += 10;
            aces--;
        }

        return value;
    }
public void showHand() {
        for (BlackjackCard card : hand) {
            System.out.println(card);
        }
        System.out.println("Total: " + calculateHandValue());
    }

    public abstract void play();
}
