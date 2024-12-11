/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author jeanp
 */
class CLIView {
    private Scanner scanner;

    public CLIView() {
        scanner = new Scanner(System.in);
    }

    public void display(String message) {
        System.out.println(message);
    }

    public String getInput() {
        return scanner.nextLine();
    }
}