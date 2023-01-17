package ua.hillel.poker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Card {
  private final String value;
  private final String suit;

  public Card(String value, String suit) {
    this.value = value;
    this.suit = suit;
  }

  public String getValue() {
    return value;
  }

  public String getSuit() {
    return suit;
  }

  @Override public String toString() {
    return this.value + " of " + this.suit;
  }
}
