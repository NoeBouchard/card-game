import java.util.*;
import java.io.*;

public class Pack {
    private ArrayList<Card> pack;
    private final Random rand = new Random();

    public Pack() {
        pack = new ArrayList<>();
    }

    public void createPack(int numberOfPlayers) {
        for (int i = 1; i <= 8*numberOfPlayers; i++) {
            int randomNumber = rand.nextInt(8*numberOfPlayers) + 1;
            pack.add(new Card(randomNumber));
        }
    }

    public void shufflePack() {
        Collections.shuffle(pack);
    }

    public void printPackToFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }   
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(file);
            for (Card card : pack) {
                writer.write(card.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
