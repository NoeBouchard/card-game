

public class CardGame {
    // prompt user in terminal for the number of players
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        cardGame.promptNumberOfPlayers();
        cardGame.createPack();
        scanner.close();
    }

    private static int numberOfPlayers;

    public void set_number_of_players(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int get_number_of_players() {
        return numberOfPlayers;
    }
    
    public void promptNumberOfPlayers() {
        System.out.print("Enter the number of players: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // consume newline
        set_number_of_players(num);
    }

    public String getPackFileName() {
        System.out.print("Enter the name of the pack file: ");
        String fileName = scanner.nextLine();
        return fileName;
    }

    // creates the pack of cards using method in pack.java
    public void createPack() {
        Pack pack = new Pack();
        pack.createPack(numberOfPlayers);
        pack.shufflePack();
        String fileName = getPackFileName();
        pack.printPackToFile(fileName);
    }


    // then shuffle the pack, distribute to the player's hands (4 cards each) in round robin fashion

    // then distribute the rest of the cards in the same fashion into n different decks (where n is the number of players)
    
}
