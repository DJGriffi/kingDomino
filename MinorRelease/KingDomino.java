import java.util.ArrayList;

public class KingDomino 
{

    private FrameManager frameManager;
	private ArrayList<Domino> deck;
	private ArrayList<Domino> currentRndDominos;
	private ArrayList<Domino> nextRndDominos;
	private DeckOfDominos dealer;
	
	public KingDomino()
	{
		
		currentRndDominos = new ArrayList<>();
		nextRndDominos = new ArrayList<>();
		dealer = new DeckOfDominos();
		frameManager = new FrameManager(this);
        frameManager.showMainFrame();
		//deck = dealer.createDeck();
	}

	public void startingRound()
	{
		dealer.createDeck();
		currentRndDominos = dealer.randomDominos();
		nextRndDominos = dealer.randomDominos();
		frameManager.setCurrentRndDominos(currentRndDominos);
	}
}