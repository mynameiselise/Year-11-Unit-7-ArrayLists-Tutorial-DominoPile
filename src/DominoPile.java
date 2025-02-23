import java.util.ArrayList;
import java.util.Collections;

class DominoPile {
    private ArrayList<Domino> pile;

    // Default constructor
    public DominoPile() {
        pile = new ArrayList<>();
    }

    // newStack method to create a complete set of dominoes from 0,0 to 6,6
    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    // shuffle method to shuffle the dominoes
    public void shuffle() {
        Collections.shuffle(pile);
    }
}