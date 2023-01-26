package Week6CodingProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("This is a two player card game of WAR!\n\n");
		
		//Instantiating the players, I wanted the user to enter names. 
		//I set the result of the System.in to equal the player's names, 
			//and built it into the Player constructor. 
		//A null value is assigned to List<Card> and a default value of 0 to score.
		
		Scanner player1Name= new Scanner(System.in);
		System.out.print("Enter 1st Player Name:");
		Player player1= new Player();
		player1.setPlayerName(player1Name.nextLine().toString());
		
		Scanner player2Name= new Scanner(System.in);
		System.out.print("Enter 2nd Player Name:");
		Player player2= new Player();
		player2.setPlayerName(player2Name.nextLine().toString());

		//Uses the getPlayerName method from the Player class to welcome them. 
		
		System.out.println("\n\nWelcome " +player1.getPlayerName() + " and " 
				+player2.getPlayerName() + "! Now let's play War!\n\n");
		
		
		//Instantiate a new deck and shuffle it. 
		
		Deck playerDeck= new Deck();
		playerDeck.shuffle();
		
		
		//Create the player hands. 
		for(int i=0; i<52; i++) {
			if(i%2==0) {
				player1.draw(playerDeck);
				}
			else if(i%2==1) {
				player2.draw(playerDeck);			
			}			
		}
		
//		I used the .describe method to make sure I made their hands correctly 
//		but did not want to display them to the players. 
//			player1.describe();
//			player2.describe();
		
		//Have players flip their cards, call describe method, then compare values.
		//Assign points to players and show player score. 
		for(int i=0; i<26; i++) {
			System.out.println("Round "+ (i+1)+" of 26:\n");
			
			Card player1FlippedCard= player1.flip();
			System.out.print(player1.getPlayerName() + " Played: "); 
			player1FlippedCard.describe();
						
			Card player2FlippedCard= player2.flip();
			System.out.print(player2.getPlayerName() + " Played: "); 
			player2FlippedCard.describe();
					
			//compare values, award points, print score update
			if(player1FlippedCard.getValue() > player2FlippedCard.getValue()) {
				player1.incrementScore();
				System.out.println("\n\t"+ player1.getPlayerName() + " gets the point!");
				System.out.println("\n\t ***Score Update*** \n\t" + 
						player1.getPlayerName()+ " has " + player1.getScore()+ " points.\n\t" +
						player2.getPlayerName()+ " has " + player2.getScore()+ " points.");
			}
			else if(player1FlippedCard.getValue() < player2FlippedCard.getValue()) {
				player2.incrementScore();
				System.out.println("\n\t"+ player2.getPlayerName() + " gets the point!");
				System.out.println("\n\t ***Score Update*** \n\t" + 
						player1.getPlayerName()+ " has " + player1.getScore()+ " points.\n\t" +
						player2.getPlayerName()+ " has " + player2.getScore()+ " points.");
			}
			else {System.out.println("\n\tYou tied! No points given.");
				System.out.println("\n\t ***Score Update*** \n\t" + 
					player1.getPlayerName()+ " has " + player1.getScore()+ " points.\n\t" +
					player2.getPlayerName()+ " has " + player2.getScore()+ " points.");
			}
			
			System.out.println("\n");
		}
		
		
		//Shows the final winner and closes the game. 
		System.out.println("***RESULTS***\n");
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getPlayerName()+ " WINS War! At least this time...");
		}
		if(player1.getScore() < player2.getScore()) {
			System.out.println(player2.getPlayerName()+ " WINS War! At least this time...");
		}
		if(player1.getScore() == player2.getScore()) {
			System.out.println(player1.getPlayerName()+ " TIES " + player2.getPlayerName()
			+"\nPlay Again to find a real winner!");
		}
		
		System.out.println("\nThanks for playing War " +player1.getPlayerName()+ " and " 
				+ player2.getPlayerName()+"!");
		
	}

}
