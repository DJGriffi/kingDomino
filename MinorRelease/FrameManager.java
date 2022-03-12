import javax.swing.UIManager;
import java.util.ArrayList;

public class FrameManager
{
    private KingDomino kingDomino;
    private GameBoard gameBoard;
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
        gameBoard = new GameBoard(this);
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

    public void showGameBoard()
    {
        gameBoard.makeVisible();
    }

    public void hideGameBoard()
    {
        gameBoard.makeInvisible();
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
        gameBoard = new GameBoard(this);
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
        gameBoard.setCurrentRndDominos(currentRndDominos);
    }
}
