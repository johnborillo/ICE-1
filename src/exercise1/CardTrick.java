package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            card.setValue((int)(Math.random() * 13) + 1);
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(card.SUITS[(int)(Math.random() * 4) + 0]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            // FOLLOWING CODE FOR DEBUGGING:
            // System.out.println("Suit: " + card.getSuit() + ", Value: " + card.getValue());
        }
        
        Scanner user = new Scanner(System.in);

        // for(Card eachCard: hand){
        //     System.out.println(eachCard.getValue());
        // }

        // for (int i = 0; i < hand.length; i++){
        //     Card card = hand[i];
        //     System.out.println(card.getValue());
        // }

        boolean win = false;
        while (win == false){
            System.out.println("Enter your guess starting with the suit, followed by a value separated by a single comma.");
            String input = user.next().toLowerCase();
            String[] list = input.split(",");
            String suitGuess = list[0];
            int valueGuess = Integer.parseInt(list[1]);
            // int valueGuess = user.nextInt();
            
            for(int i = 0; i < hand.length; i++){
                if (hand[i].getValue() == valueGuess && hand[i].getSuit().toLowerCase().equals(suitGuess)){
                    printInfo();
                    win = true;
                }
                
            }
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    // I'm done!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is John.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Make more connections");
        System.out.println("-- Pursue a career as a fullstack developer");
        System.out.println("-- Participate in more hackathons");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Hanging out with friends");
        System.out.println("-- Video games");
        System.out.println("-- Play instruments");
        System.out.println("-- Photography");

        System.out.println();
        
    
    }

}
