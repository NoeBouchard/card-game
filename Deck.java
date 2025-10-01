import java.util.Queue;

public class Deck {
    // deck has a queue of cards
    private Queue<Card> deck;
    // method to add a card to the bottom of the queue
    public createDeck() {
        deck = new LinkedList<>();
    }
    
    public void addCardToBottom(Card card) {
        deck.add(card);
    }
    // method to remove a card from the top of the queue
    public Card removeCardFromTop() {
        return deck.remove();
    }
    // both methods has to happen in concurrency (use thread)
}
