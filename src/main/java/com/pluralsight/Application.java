package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        String[] quotes = {"“Knowing yourself is the beginning of all wisdom.”", "“It is the mark of an educated mind to be able to entertain a thought without accepting it.”"
                , "“You have power over your mind – not outside events. Realize this, and you will find strength.”", "“Wise men speak because they have something to say; fools because they have to say something.”",
                "“The greatest victory is that which requires no battle.”", "“There is no instance of a nation benefiting from prolonged warfare.”", "“We suffer more in imagination than in reality.”",
                "“It is not because things are difficult that we do not dare, it is because we do not dare that they are difficult.”", "“The greatest wealth is to live content with little.”",
                "“One of the penalties for refusing to participate in politics is that you end up being governed by your inferiors.”"};

        boolean continueProgram = true;
        while (continueProgram) {
            try {
                System.out.println("Option 1 - Enter 1 in order to select a quote");
                System.out.println("Option 2 -  Enter 2 in order to get a random quote");
                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Enter a number between 1 and 10");
                        int choice = scanner.nextInt();
                        System.out.println(quotes[choice - 1]);
                        break;

                    case 2:
                        int index = new Random().nextInt(quotes.length);
                        System.out.println(quotes[index]);
                        break;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Number not available");
                System.out.println(e.getMessage());
            }

            System.out.println("Would you like to see another quote?");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                continueProgram = false;
            }


        }
    }


}
