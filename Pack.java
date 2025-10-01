import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
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

    public void readPackFromFile(String fileName) {
            Path path = Paths.get(fileName);
            pack = new ArrayList<>();
            try {
                List<String> lines = Files.readAllLines(path);
                for (String line : lines) {
                    pack.add(new Card(Integer.parseInt(line)));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public void shufflePack(String fileName) {
            readPackFromFile(fileName);
            Collections.shuffle(pack);
            printPackToFile(fileName);
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
