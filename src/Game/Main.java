package Game;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card cards = new Card();

        String[] Deck = new String[40];
        System.arraycopy(cards.Blue, 0, Deck, 0, 10);
        System.arraycopy(cards.Red, 0, Deck, 10, 10);
        System.arraycopy(cards.Yellow, 0, Deck, 20, 10);
        System.arraycopy(cards.Green, 0, Deck, 30, 10);


        Game.Deck.shuffle(Deck);
        String[] player1hand = new String[7];

        System.arraycopy(Deck,0,player1hand,0,7);
        System.out.println(Arrays.toString(player1hand));
        String[] player2hand = new String[7];
        System.arraycopy(Deck,7,player2hand,0,7);
        System.out.println(Arrays.toString(player2hand));
        String[] cardsLeft = new String[26];
        System.arraycopy(Deck,14,cardsLeft,0,26);
        System.out.println(Arrays.toString(cardsLeft));
        System.out.println("Game started");
        System.out.println("-------------------------------------------------------------------------------");

        while (player1hand.length > 0 && player2hand.length > 0) {
            System.out.println("Player 2's turn");
            System.out.println("------------------------------------------------");
            System.out.println("Here is player 2's cards");
            System.out.println(Arrays.toString(player2hand));
            System.out.println("Do you want to go market?");
            String player2Answer = scanner.next();
            if (player2Answer.equalsIgnoreCase("yes")) {
                player2hand = Arrays.copyOf(player2hand,player2hand.length + 1);
                player2hand[player2hand.length - 1] = cardsLeft[cardsLeft.length - 1];
                cardsLeft = Arrays.copyOf(cardsLeft,cardsLeft.length - 1);
                System.out.println("This is your new card:" + player2hand[player2hand.length - 1]);
            }
            System.out.println("Do you want to pass?");
            String player2Answer1 = scanner.next();
            if (player2Answer1.equalsIgnoreCase("no")) {
                System.out.println("Select the card");
                System.out.println(Arrays.toString(player2hand));
                int player2Choice = scanner.nextInt();
                String temp1 = player2hand[player2Choice];
                player2hand[player2Choice] = player2hand[player2hand.length - 1];
                player2hand[player2hand.length - 1] = temp1;
                player2hand = Arrays.copyOf(player2hand, player2hand.length - 1);
                System.out.println(Arrays.toString(player2hand));
            }
            System.out.println("Player 1's turn");
            System.out.println("------------------------------------------------");
            System.out.println("Here is player 1's cards");
            System.out.println(Arrays.toString(player1hand));
            System.out.println("Do you want to go market?");
            String player1Answer = scanner.next();
            if (player1Answer.equalsIgnoreCase("yes")) {
                player1hand = Arrays.copyOf(player1hand,player1hand.length + 1);
                player1hand[player2hand.length - 1] = cardsLeft[cardsLeft.length - 1];
                cardsLeft = Arrays.copyOf(cardsLeft,cardsLeft.length - 1);
                System.out.println("This is your new card:" + player1hand[player1hand.length - 1]);
            }
            System.out.println("Do you want to pass?");
            String player1Answer1 = scanner.next();
            if (player1Answer1.equalsIgnoreCase("yes"))
                continue;
            System.out.println("Select the card");
            System.out.println(Arrays.toString(player1hand));
            int player1Choice = scanner.nextInt();
            String temp2 = player1hand[player1Choice];
            player1hand[player1Choice] = player1hand[player1hand.length - 1];
            player1hand[player1hand.length - 1] = temp2;
            player1hand = Arrays.copyOf(player1hand,player1hand.length - 1);
            System.out.println(Arrays.toString(player1hand));




        }
        if (player1hand.length == 0) {
            System.out.println("------------------------------------");
            System.out.println("Player 1 WON");
        }
        if (player2hand.length == 0) {
            System.out.println("------------------------------------");
            System.out.println("Player 2 WON");
        }

    }
}
