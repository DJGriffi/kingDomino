import java.util.ArrayList;
import java.util.Random;

public class KingDomino 
{

    private FrameManager frameManager;
	private ArrayList<Domino> currentRndDominos;
	private ArrayList<Domino> nextRndDominos;
	private ArrayList<Player> players;
	private DeckOfDominos dealer;
	private int roundNum, numOfPlayers, currentPlayersTurn;
	private Random rand;

	
	public KingDomino()
	{
		rand = new Random();
		currentRndDominos = new ArrayList<>();
		nextRndDominos = new ArrayList<>();
		dealer = new DeckOfDominos();
		frameManager = new FrameManager(this);
        frameManager.showMainFrame();
		roundNum = 1;
		numOfPlayers =2;

	}

	public void startingRound()
	{
		dealer.createDeck();
		currentRndDominos = dealer.randomDominos();
		nextRndDominos = dealer.randomDominos();
		frameManager.setCurrentRndDominos(currentRndDominos);
		frameManager.setNextRndDominos(nextRndDominos);
		frameManager.setRound(roundNum);
		frameManager.setRemainingDominos(dealer.getRemainingDominos());
		numOfPlayers = frameManager.getNumOfPlayers();
		currentPlayersTurn = rand.nextInt(numOfPlayers) + 1;
		showCurrentPlayerBoard();

	}

	private void showCurrentPlayerBoard()
	{
		if (currentPlayersTurn == 1){
			frameManager.showPlayer1GameBoard();
		}
		else if (currentPlayersTurn == 2){
			frameManager.showPlayer2GameBoard();
		}
		else if (currentPlayersTurn ==3){
			frameManager.showPlayer3GameBoard();
		}
		else if (currentPlayersTurn == 4)
		{
			frameManager.showPlayer4GameBoard();
		}
	}

	public int getRoundNum()
	{
		return roundNum;
	}

	public void incrementRnd()
	{
		++roundNum;
	}

	public int getRemainingDominos()
	{
		return dealer.getRemainingDominos();
	}
}