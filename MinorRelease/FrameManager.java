

public class FrameManager
{

    private GameBoard gameBoard;
    private GameModeFrame gameModeFrame;
    private MainFrame mainFrame;
    private ColourSettingsFrame colourSettingsFrame;
    private SettingsFrame settingsFrame;
    

    public FrameManager()
    {
        gameBoard = new GameBoard(this);
        gameModeFrame = new GameModeFrame(this);
        mainFrame = new MainFrame(this);
        colourSettingsFrame = new ColourSettingsFrame(this);
        settingsFrame = new SettingsFrame(this);
        
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
}