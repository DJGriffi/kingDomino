

public class FrameManager
{

    private GameBoard gameBoard;
    private GameModeFrame gameModeFrame;
    private MainFrame mainFrame;

    public FrameManager()
    {
        //gameBoard = new GameBoard();
        gameModeFrame = new GameModeFrame();
        mainFrame = new MainFrame();
        
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
}