/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jeanp
 */
class PlayerOne extends Player {
    private int startingMoney;

    public PlayerOne(String name, int startingMoney) {
        super(name);
        this.startingMoney = startingMoney;
    }

    public boolean placeBet(int amount) {
        if (amount <= startingMoney) {
            startingMoney -= amount;
            return true;
        }
        return false;
    }

    public void receiveWinnings(int amount) {
        startingMoney += amount;
    }

    @Override
    public void play() {
        // Logic for PlayerOne's play can be added here if needed
    }
}
