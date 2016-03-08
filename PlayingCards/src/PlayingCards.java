//************************************************************
// PlayingCards.java	
//
// Understanding enum 
//************************************************************

public class PlayingCards {

	enum Rank {
		ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king
	}

	public static void main(String[] args) {
		Rank highCard, faceCard, card1, card2;
		highCard = Rank.ace;
		faceCard = Rank.queen;
		card1 = Rank.seven;
		card2 = Rank.nine;
		int card1Val, card2Val;

		System.out.println("A blackjack hand: " + highCard + " " + faceCard);
		card1Val = card1.ordinal() + 1;
		card2Val = card2.ordinal() + 1;
		System.out.println("A two card hand: " + card1 + " " + card2);
		System.out.println("Hand value: " + (card1Val + card2Val));

	}
}