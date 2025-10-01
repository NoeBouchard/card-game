import java.util.*;

public class Deck {
    // deck has a queue of cards
    private final Queue<Card> deck = new LinkedList<>();
    // method to add a card to the bottom of the queue
    public void  createDeck() {
        deck.clear();
    }
    
    public void addCardToBottom(Card card) {
        deck.offer(card);
    }
    // method to remove a card from the top of the queue
    public Card removeCardFromTop() {
        return deck.poll();
    }
    // both methods has to happen in concurrency (use thread)
}
