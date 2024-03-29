package ua.hillel.poker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Deck {
  private final static int noOfCards = 52;

  private final Card[] deck = new Card[noOfCards];

  private int inIndex = 0;

  public void addCard(Card card) {
    if (!(inIndex >= noOfCards)) {
      deck[inIndex++] = card;
    }
  }

  public Card getCard(int i) {
    return deck[i];
  }

  public void setCard(int index, Card card) {
    deck[index] = card;
  }
}
