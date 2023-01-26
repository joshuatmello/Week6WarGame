package Week6CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand= new ArrayList<Card>();
	int score;
	String playerName;
	
	public Player(String playerName, List<Card> hand, int score){
		this.playerName= playerName;
		this.hand= hand;
		this.score= 0;
	}
	
	//Gives polymorphism to the Player class constructor
	public Player(String playerName, int score) {}
	public Player(String playerName) {}
	public Player() {}
	
	
	//I did not end up using this method in the actual game. 
	public void describe(){
			for(Card card:hand) {
			System.out.print(playerName+ ": ");
			card.describe();
		}
	}
	
	//Flips the player's top card over to compare values. 
	public Card flip(){
		Card flippedCard= hand.remove(0);
		return flippedCard;
	}	
	
	//takes a Deck and returns the top card from it and adds it to the hand. 
	public void draw(Deck deck){
		Card drawnCard= deck.draw();
		hand.add(drawnCard);
	}
	
	//This makes it possible to add a point to the winning player each round.
	public int incrementScore() {
		int playerScore= score +=1; 
		return playerScore;
	}

	
	//Getters and Setters
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
			
}
