/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jeanp
 */
public class BlackJackGameMain {
    public static void main(String[] args) {
        CLIView view = new CLIView();
        BlackjackGame game = new BlackjackGame("Blackjack", view);
        game.play();
    }
}
