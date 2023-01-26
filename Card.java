package Week6CodingProject;

public class Card {
	
//While the instructions only called for two fields, 
//I thought three made the most sense for when I wanted to build the Deck. 
	
private int value;
private String name;
private String suit;


public Card(String name, String suit, int value){
	this.setName(name);
	this.setSuit(suit);
	this.setValue(value);
}

void describe() {
		System.out.println("The " + name + " of " + suit+ 
				" which has a value of " + value);
}

//Getters and Setters

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSuit() {
	return suit;
}

public void setSuit(String suit) {
	this.suit = suit;
}


}
