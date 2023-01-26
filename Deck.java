package Week6CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cardDeck= new ArrayList<Card>();
	private String[] suits= {"Hearts", "Clubs", "Diamonds", "Spades"};
	private String[] names= {"2", "3", "4", "5", "6", "7", 
			"8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	public Deck(){
			for(String suit: suits) {
			int value= 2;
			for(String name: names) {
				cardDeck.add(new Card(name, suit, value));
				value++;
			}
		}
	}
	
	public void describe() {
		for(Card card: cardDeck) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cardDeck);
	}
	
	public Card draw() {
	Card drawnCard= cardDeck.remove(0);
	return drawnCard;
	}
	
	//Intentionally did NOT create Getters and Setters. 
}
