/* Simple Bridge Game
Write a program to mimic a simple bridge game. 
Each of the four players plays a card. The trick is won by the highest trump, 
or if there were none played, the highest card of the led suit.

Below is a sample run:

Card from W: 5s
Card from N: 7s
Card from E: Ks
Card from S: 6d
The trump suit: d
Who leads?: W
S wins the trick.

Hints:
A card can be represented by a combination of rank and suit. For example, "9s"
means 9 of spades. There are 13 ranks in descending order, i.e., 'A','K','Q',
'J','T', and '9'-'2', and four suits, i.e., spades('s'), hearts('h'), diamonds('d'),
and clubs('c'). 
In a bridge game, there can be either a trump suit or no trump suit ('nt'). The trump
suit dominates other suits. For example, 'As' beats 'Ah' when spades is the trump suit.
If there is no trump suit, the led suit dominates the others. For example, '5h' beats
'As' if hearts is the led suit and there is no trump suit. 

*/

import java.util.Scanner;

public class SimpleBridgeGame {
    public static void main(String[] args){
        // Enter four cards
        String[] cards = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.print("Card from W: ");
        cards[0] = input.nextLine();
        System.out.print("Card from N: ");
        cards[1] = input.nextLine();
        System.out.print("Card from E: ");
        cards[2] = input.nextLine();
        System.out.print("Card from S: ");
        cards[3] = input.nextLine();
        // Enter the trump suit
        System.out.print("The trump suit: ");
        char trumpSuit = input.nextLine().charAt(0);
        // Enter who leads this turn
        System.out.print("Who leads?: ");
        char leader = input.nextLine().charAt(0);

        //Get the leading suit which is also the dominating suit if there is no trump suit
        String leadingCard = "";
        switch(leader){
            case 'W' -> leadingCard =  cards[0];
            case 'N' -> leadingCard =  cards[1];
            case 'E' -> leadingCard =  cards[2];
            case 'S' -> leadingCard =  cards[3];
        }

        char leadingSuit = leadingCard.charAt(1);
        if (trumpSuit == 'n'){
            trumpSuit = leadingSuit;
        }

        // Convert the fours cards into values
        int[] values = new int[4];
        for (int i = 0; i < 4; i++) {
            values[i] = cardToValue(cards[i], trumpSuit);
        }

        // Find the card with the highest value and who played this card
        int idx_max = 0;
        int max_value = values[0];
        for (int i = 0; i < 4; i++) {
            if (values[i] > max_value) {
                max_value = values[i];
                idx_max = i;
            }
        }

        // Find the winner
        char winner = ' ';
        switch(idx_max){
            case 0 -> winner = 'W';
            case 1 -> winner = 'N';
            case 2 -> winner = 'E';
            case 3 -> winner = 'S';
        }

        System.out.println(winner + " wins the trick.");

    }

    /** Calculate the value of a card*/
    public static int cardToValue(String card, char trumpSuit){
        char rank = card.charAt(0);
        char suit = card.charAt(1);
        int value = 0;
        switch(rank){
            case 'A' -> value = 14;
            case 'K' -> value = 13;
            case 'Q' -> value = 12;
            case 'J' -> value = 11;
            case 'T' -> value = 10;
            case '9' -> value = 9;
            case '8' -> value = 8;
            case '7' -> value = 7;
            case '6' -> value = 6;
            case '5' -> value = 5;
            case '4' -> value = 4;
            case '3' -> value = 3;
            case '2' -> value = 2;
            default -> value = 0;
        }
        if (suit == trumpSuit) {
            value *= 10;
        }
        return value;
    }


}
