package com.mycompany.lohera;

import java.util.*;

public class Undo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> actions = new Stack<>();

        while (true) {
            System.out.println("Enter an action (Type 'Undo' to Undo, 'Exit' to Stop):");
            String input = scan.nextLine().trim();

            if (input.equalsIgnoreCase("Exit")) {
                System.out.println("Program has been bommbaaa naa ");
                break;
            } else if (input.equalsIgnoreCase("Undo")) {
                if (!actions.isEmpty()) {
                    System.out.println("You undid \"" + actions.pop() + "\"");
                } else {
                    System.out.println("No actions to undo");
                }
            } else {
                actions.push(input);
                System.out.println("You " + input + "(Typed " + input + ")"); 
            }
        }

    }
}
