/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jeanp
 */
class BlackjackGame extends Game {
    private PlayerOne player;
    private Dealer dealer;
    private GroupOfCards deck;
    private CLIView view;

    public BlackjackGame(String name, CLIView view) {
        super(name);
        this.view = view;
        this.deck = new GroupOfCards();
        this.player = new PlayerOne("Player", 100);
        this.dealer = new Dealer();
    }

    @Override
    public void play() {
        deck.shuffle();
        player.addCard(deck.drawCard());
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());

        view.display("Your Hand:");
        player.showHand();

        view.display("Dealer's Hand:");
        dealer.showHand();

        while (true) {
            view.display("Choose an action: (hit/stand)");
            String action = view.getInput();

            if (action.equalsIgnoreCase("hit")) {
                player.addCard(deck.drawCard());
                view.display("Your Hand:");
                player.showHand();
                if (player.calculateHandValue() > 21) {
                    view.display("Bust! You lose.");
                    return;
                }
            } else if (action.equalsIgnoreCase("stand")) {
                break;
            }
        }

        dealer.playTurn(deck);
        view.display("Dealer's Hand:");
        dealer.showHand();

        int playerValue = player.calculateHandValue();
        int dealerValue = dealer.calculateHandValue();

        if (dealerValue > 21 || playerValue > dealerValue) {
            view.display("You win!");
        } else if (playerValue == dealerValue) {
            view.display("It's a tie!");
        } else {
            view.display("Dealer wins!");
        }
    }

    @Override
    public void declareWinner() {
        // Additional logic to declare the winner
    }
}