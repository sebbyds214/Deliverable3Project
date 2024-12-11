/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jeanp
 */
class Dealer extends Player {
    public Dealer() {
        super("Dealer");
    }

    public void playTurn(GroupOfCards deck) {
        while (calculateHandValue() < 17) {
            addCard(deck.drawCard());
        }
    }

    @Override
    public void play() {
        // Logic for Dealer's play
    }
}
