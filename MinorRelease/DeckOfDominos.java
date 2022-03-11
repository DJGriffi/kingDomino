import java.awt.Color;
import java.util.ArrayList;

public class DeckOfDominos
{

    private ArrayList<Domino> deck;
    private final int NUM_OF_DOMINOS = 48;

    public DeckOfDominos()
    {
        deck = new ArrayList<>();
        createDeck();
    }

    private void createDeck()
    {
        Domino domino1 = new Domino(Color.YELLOW, Color.YELLOW, 0, 1);
        deck.add(domino1);

        Domino domino2 = new Domino(Color.YELLOW, Color.YELLOW, 0, 2);
        deck.add(domino2);

        Domino domino3 = new Domino(Color.GREEN, Color.GREEN, 0, 3);
        deck.add(domino3);

        Domino domino4 = new Domino(Color.GREEN, Color.GREEN, 0, 4);
        deck.add(domino4);

        Domino domino5 = new Domino(Color.GREEN, Color.GREEN, 0, 5);
        deck.add(domino5);

        Domino domino6 = new Domino(Color.GREEN, Color.GREEN, 0, 6);
        deck.add(domino6);

        Domino domino7 = new Domino(Color.BLUE, Color.BLUE, 0, 7);
        deck.add(domino7);

        Domino domino8 = new Domino(Color.BLUE, Color.BLUE, 0, 8);
        deck.add(domino8);


    }
}