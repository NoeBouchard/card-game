public final class Card {
    private final int cardValue;

    public Card (int cardValue){
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }  

    @Override
    public String toString() {
        return Integer.toString(cardValue);
    }

    
}
