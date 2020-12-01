import java.util.*;

public class Game {

    private int nbTiles;
    private static final Random random = new Random();
    private int[] tiles; // Size of tile on UI
    private int blankPos; // Margin for the grid on the frame

    private void reset() {
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = (i + 1) % tiles.length;
        }
        
        blankPos = tiles.length - 1;
    }

    private void shuffle() {
        int n = nbTiles;

        while (n > 1) {
            int r = random.nextInt(n--);
            int tmp = tiles[r];
            tiles[r] = tiles[n];
            tiles[n] = tmp;
        }
    }

    
}
