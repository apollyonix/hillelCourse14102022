package ua.hillel.poker;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Poker {
  public static void main(String[] args) {
    PokerMachine machine = new PokerMachine();
    Deck deck = machine.createDeck();

    machine.shuffleDeck(deck);
    machine.serveCardsToPlayers(5, deck);
  }
}
