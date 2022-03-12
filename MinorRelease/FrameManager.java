import javax.swing.UIManager;
import java.util.ArrayList;

public class FrameManager
{
    private KingDomino kingDomino;
    private GameBoard player1GameBoard;
    private GameBoard player2GameBoard;
    private GameBoard player3GameBoard;
    private GameBoard player4GameBoard;
    private GameModeFrame gameModeFrame;
    private MainFrame mainFrame;
    private ColourSettingsFrame colourSettingsFrame;
    private SettingsFrame settingsFrame;
    private PlayerSettingsFrame playerSettingsFrame;

    public FrameManager(KingDomino kingDomino)
    {
        try
        {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        }   
        catch (Exception e)
        {
            e.printStackTrace();
        }
        this.kingDomino = kingDomino;
        player1GameBoard = new GameBoard(this, 1);
        player2GameBoard = new GameBoard(this, 2);
        player3GameBoard = new GameBoard(this, 3);
        player4GameBoard = new GameBoard(this, 4);
        gameModeFrame = new GameModeFrame(this);
        mainFrame = new MainFrame(this);
        colourSettingsFrame = new ColourSettingsFrame(this);
        settingsFrame = new SettingsFrame(this);
        playerSettingsFrame = new PlayerSettingsFrame(this);
        
    }

    public void showMainFrame()
    {
        mainFrame.makeVisible();
    }
            
    public void hideMainFrame()
    {
        mainFrame.makeInvisible();
    }

    public void showGameModeFrame()
    {
        gameModeFrame.makeVisible();
    }

    public void hideGameModeFrame()
    {
        gameModeFrame.makeInvisible();
    }

    public void showPlayer1GameBoard()
    {
        player1GameBoard.makeVisible();
    }

    public void hidePlayer1GameBoard()
    {
        player1GameBoard.makeInvisible();
    }

    public void showPlayer2GameBoard()
    {
        player2GameBoard.makeVisible();
    }

    public void hidePlayer2GameBoard()
    {
        player2GameBoard.makeInvisible();
    }

    public void showPlayer3GameBoard()
    {
        player3GameBoard.makeVisible();
    }

    public void hidePlayer3GameBoard()
    {
        player3GameBoard.makeInvisible();
    }

    public void showPlayer4GameBoard()
    {
        player4GameBoard.makeVisible();
    }

    public void hidePlayer4GameBoard()
    {
        player4GameBoard.makeInvisible();
    }

    public void showColourSettingsFrame()
    {
        colourSettingsFrame.makeVisible();
    }
            
    public void hideColourSettingsFrame()
    {
        colourSettingsFrame.makeInvisible();
    }

    public void showSettingsFrame()
    {
        settingsFrame.makeVisible();
    }
            
    public void hideSettingsFrame()
    {
        settingsFrame.makeInvisible();
    }
    
    public void showPlayerSettingsFrame()
    {
    	playerSettingsFrame.makeVisible();
    }
    
    public void hidePlayerSettingsFrame()
    {
    	playerSettingsFrame.makeInvisible();
    }
    
    public void regenerateFrames()
    {
        player1GameBoard = new GameBoard(this, 1);
        player2GameBoard = new GameBoard(this, 2);
        player3GameBoard = new GameBoard(this, 3);
        player4GameBoard = new GameBoard(this, 4);
        gameModeFrame = new GameModeFrame(this);
        mainFrame = new MainFrame(this);
        colourSettingsFrame = new ColourSettingsFrame(this);
        settingsFrame = new SettingsFrame(this);
        playerSettingsFrame = new PlayerSettingsFrame(this);
    }

    public void startingRound()
    {
        kingDomino.startingRound();
    }

    public void setCurrentRndDominos(ArrayList<Domino> currentRndDominos)
    {
        player1GameBoard.setCurrentRndDominos(currentRndDominos);
        player2GameBoard.setCurrentRndDominos(currentRndDominos);
        player3GameBoard.setCurrentRndDominos(currentRndDominos);
        player4GameBoard.setCurrentRndDominos(currentRndDominos);
    }

    public void setNextRndDominos(ArrayList<Domino> currentRndDominos)
    {
        player1GameBoard.setNextRndDominos(currentRndDominos);
        player2GameBoard.setNextRndDominos(currentRndDominos);
        player3GameBoard.setNextRndDominos(currentRndDominos);
        player4GameBoard.setNextRndDominos(currentRndDominos);
    }

    public int getRoundNum()
    {
        return kingDomino.getRoundNum();
    }

    public int getRemainingDominos()
    {
        return kingDomino.getRemainingDominos();
    }

    public void setRound(int roundNum)
    {
        
        player1GameBoard.setRound(roundNum);
        player2GameBoard.setRound(roundNum);
        player3GameBoard.setRound(roundNum);
        player4GameBoard.setRound(roundNum);
    }

    public void setRemainingDominos(int dominosRemaining)
    {
        player1GameBoard.setRemainingDominos(dominosRemaining);
        player2GameBoard.setRemainingDominos(dominosRemaining);
        player3GameBoard.setRemainingDominos(dominosRemaining);
        player4GameBoard.setRemainingDominos(dominosRemaining);
    }

    public int getNumOfPlayers()
    {
        return playerSettingsFrame.getNumOfPlayers();
    }
}
