import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameBoard extends GameFrame 
{
    private GridSquares [][] gridSquares;	// squares to appear in grid formation
    private final int COLUMNS = 9;
    private final int ROWS = 9;
    private JPanel rightPanel, topPanel, centerPanel, bottomPanel;
    private JLabel round, whoTurn, doThis, tilesLeft;
    private JButton rotateTile2, rotateTile4, rotateTile5, rotateTile6, rotateTile8;
    private JButton playerIcon1, playerIcon2, playerIcon3, playerIcon4, playerIcon5, playerIcon6, playerIcon7, playerIcon8;
    private JButton currentTile11, currentTile12, currentTile21, currentTile22, currentTile31, currentTile32, currentTile41, currentTile42;
    private JButton nextRndTile11, nextRndTile12, nextRndTile21, nextRndTile22, nextRndTile31, nextRndTile32, nextRndTile41, nextRndTile42; 
    private FrameManager frameManager;

    public GameBoard(FrameManager frameManager)
    {
        super();
        this.frameManager = frameManager;
        centerPanel = new JPanel();
        setBounds(100, 100, 2000, 1500);
        getContentPane().setLayout(new BorderLayout());
        makeBoard();
    }

    private void makeBoard()
    {
        /***********************************************/
        /*Create panel to the right of the playing area*/
        rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(700,1500));
        rightPanel.setLayout(new BorderLayout());

        /****************************************************/
        /* Creating top panel with current round information*/
        topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(650,60));
        topPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JPanel topLeft = new JPanel();
        topLeft.setPreferredSize(new Dimension(125,20));
        topLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
        round = new JLabel("Round #: 1");
        topLeft.add(round);
        topPanel.add(topLeft);

        Dimension top1MinSize = new Dimension(50, 50);
        Dimension top1PrefSize = new Dimension(50, 50);
        Dimension top1MaxSize = new Dimension(Short.MAX_VALUE, 100);
        topPanel.add(new Box.Filler(top1MinSize, top1PrefSize, top1MaxSize));


        JPanel topCenter = new JPanel();
        topCenter.setPreferredSize(new Dimension(200,50));
        whoTurn = new JLabel("Player One's turn");
        doThis = new JLabel("Do this thing this turn");
        topCenter.add(whoTurn);
        topCenter.add(doThis);
        topPanel.add(topCenter);

        Dimension top2MinSize = new Dimension(50, 50);
        Dimension top2PrefSize = new Dimension(50, 50);
        Dimension top2MaxSize = new Dimension(Short.MAX_VALUE, 100);
        topPanel.add(new Box.Filler(top2MinSize, top2PrefSize, top2MaxSize));

        JPanel topRight = new JPanel();
        topRight.setPreferredSize(new Dimension(150,20));
        topRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        tilesLeft = new JLabel("Tiles remaining: 64");
        topRight.add(tilesLeft);
        topPanel.add(topRight);

        rightPanel.add(topPanel, BorderLayout.NORTH);

        /*****************************************************************/
        /* Creating bottom panel to hold the 'Options' and 'Quit' Buttons*/
        bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(650,60));
        bottomPanel.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));

        JButton quit = new JButton("Quit");
        quit.setAlignmentX(Component.LEFT_ALIGNMENT);
        quit.addActionListener(e-> quit());
        bottomPanel.add(quit);

        Dimension minSize = new Dimension(250, 50);
        Dimension prefSize = new Dimension(250, 50);
        Dimension maxSize = new Dimension(Short.MAX_VALUE, 100);
        bottomPanel.add(new Box.Filler(minSize, prefSize, maxSize));

        JButton options = new JButton("Options");
        options.setAlignmentX(Component.RIGHT_ALIGNMENT);
        options.addActionListener(e-> options());
        bottomPanel.add(options);
        
        rightPanel.add(bottomPanel, BorderLayout.SOUTH);

        /*******************************************************/
        /*Creating panel to hold the buttons to rotate the tile*/
        JPanel rightCenterPanel = new JPanel();
        rightCenterPanel.setLayout(new BorderLayout());

        JPanel rightCenterTopPanel = new JPanel();
        rightCenterTopPanel.setPreferredSize(new Dimension(650,40));
        rightCenterTopPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        JButton leftRotate = new JButton("Left");
        leftRotate.addActionListener(e-> rotateLeft());
        rightCenterTopPanel.add(leftRotate);

        JLabel rotate = new JLabel("Rotate Tiles");
        rightCenterTopPanel.add(rotate);

        JButton rightRotate = new JButton("Right");
        rightRotate.addActionListener(e-> rotateRight());
        rightCenterTopPanel.add(rightRotate);

        rightCenterPanel.add(rightCenterTopPanel, BorderLayout.NORTH);

        /***********************************************************************/
        /*Creating new panel with border layout to be nested in center position*/
        JPanel rightCenterCenterPanel = new JPanel();
        rightCenterCenterPanel.setLayout(new BorderLayout());
        
        /*********************************************************************/
        /**************Creating panel to show rotating tiles******************/
        JPanel rightCenterCenterTopPanel = new JPanel();
        rightCenterCenterTopPanel.setLayout(new BorderLayout());
        
        JPanel rightCenterCenterTopCenterPanel = new JPanel();
        rightCenterCenterTopCenterPanel.setPreferredSize(new Dimension(550,300));
        rightCenterCenterTopCenterPanel.setLayout(new GridLayout(3,3,5,5));
        JButton rotateTile1 = new JButton();
        rotateTile1.setPreferredSize(new Dimension(50,50));
        rotateTile1.setMaximumSize(new Dimension(50,50));
        rotateTile1.setBackground(getBackgroundColour());
        rotateTile1.setOpaque(true);
        rotateTile1.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile1);

        rotateTile2 = new JButton();
        rotateTile2.setPreferredSize(new Dimension(50,50));
        rotateTile2.setMaximumSize(new Dimension(50,50));
        rotateTile2.setBackground(Color.WHITE);
        rotateTile2.setOpaque(true);
        rotateTile2.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile2);

        JButton rotateTile3 = new JButton();
        rotateTile3.setPreferredSize(new Dimension(50,50));
        rotateTile3.setMaximumSize(new Dimension(50,50));
        rotateTile3.setBackground(getBackgroundColour());
        rotateTile3.setOpaque(true);
        rotateTile3.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile3);

        rotateTile4 = new JButton();
        rotateTile4.setPreferredSize(new Dimension(50,50));
        rotateTile4.setMaximumSize(new Dimension(50,50));
        rotateTile4.setBackground(Color.WHITE);
        rotateTile4.setOpaque(true);
        rotateTile4.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile4);

        rotateTile5 = new JButton();
        rotateTile5.setPreferredSize(new Dimension(50,50));
        rotateTile5.setMaximumSize(new Dimension(50,50));
        rotateTile5.setBackground(Color.WHITE);
        rotateTile5.setOpaque(true);
        rotateTile5.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile5);

        rotateTile6 = new JButton();
        rotateTile6.setPreferredSize(new Dimension(50,50));
        rotateTile6.setMaximumSize(new Dimension(50,50));
        rotateTile6.setBackground(Color.WHITE);
        rotateTile6.setOpaque(true);
        rotateTile6.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile6);

        JButton rotateTile7 = new JButton();
        rotateTile7.setPreferredSize(new Dimension(50,50));
        rotateTile7.setMaximumSize(new Dimension(50,50));
        rotateTile7.setBackground(getBackgroundColour());
        rotateTile7.setOpaque(true);
        rotateTile7.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile7);

        rotateTile8 = new JButton();
        rotateTile8.setPreferredSize(new Dimension(50,50));
        rotateTile8.setMaximumSize(new Dimension(50,50));
        rotateTile8.setBackground(Color.WHITE);
        rotateTile8.setOpaque(true);
        rotateTile8.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile8);

        JButton rotateTile9 = new JButton();
        rotateTile9.setPreferredSize(new Dimension(50,50));
        rotateTile9.setMaximumSize(new Dimension(50,50));
        rotateTile9.setBackground(getBackgroundColour());
        rotateTile9.setOpaque(true);
        rotateTile9.setBorderPainted(false);
        rightCenterCenterTopCenterPanel.add(rotateTile9);

        JPanel eastFiller = new JPanel();
        JPanel westFiller = new JPanel();
        Dimension topCCMinSize = new Dimension(150, 200);
        Dimension topCCPrefSize = new Dimension(150, 200);
        Dimension topCCMaxSize = new Dimension(150, 200);
        eastFiller.add(new Box.Filler(topCCMinSize, topCCPrefSize, topCCMaxSize));
        westFiller.add(new Box.Filler(topCCMinSize, topCCPrefSize, topCCMaxSize));
        rightCenterCenterTopPanel.add(eastFiller, BorderLayout.EAST);
        rightCenterCenterTopPanel.add(westFiller, BorderLayout.WEST);
        
        rightCenterCenterTopPanel.add(rightCenterCenterTopCenterPanel, BorderLayout.CENTER);

        /*********************************************************************/
        /**Create panel to hold the current round tiles and next round tiles**/
        JPanel rightCenterCenterTopBottomPanel = new JPanel();
        rightCenterCenterTopBottomPanel.setPreferredSize(new Dimension(550,60));
        rightCenterCenterTopBottomPanel.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        JLabel currentRndTiles = new JLabel("Current Round Tiles");
        rightCenterCenterTopBottomPanel.add(currentRndTiles);
        Dimension label1MinSize = new Dimension(230,50);
        Dimension label1PrefSize = new Dimension(230,50);
        Dimension label1MaxSize = new Dimension(230,50);
        rightCenterCenterTopBottomPanel.add(new Box.Filler(label1MinSize, label1PrefSize, label1MaxSize));
        JLabel nextRndTiles = new JLabel("Next Round Tiles");
        rightCenterCenterTopBottomPanel.add(nextRndTiles);

        rightCenterCenterTopPanel.add(rightCenterCenterTopBottomPanel, BorderLayout.SOUTH);
        rightCenterCenterPanel.add(rightCenterCenterTopPanel, BorderLayout.NORTH);

        JPanel rightCenterCenterLeftPanel = new JPanel();
        rightCenterCenterLeftPanel.setPreferredSize(new Dimension(30,800));

        Dimension playerIconMinSize = new Dimension(20, 30);
        Dimension playerIconPrefSize = new Dimension(20, 30);
        Dimension playerIconMaxSize = new Dimension(20, 30);
        rightCenterCenterLeftPanel.add(new Box.Filler(playerIconMinSize, playerIconPrefSize, playerIconMaxSize));

        playerIcon1 = new JButton();
        playerIcon1.setPreferredSize(new Dimension(20,20));
        playerIcon1.setBackground(Color.WHITE);
        playerIcon1.setOpaque(true);
        playerIcon1.setBorderPainted(false);
        rightCenterCenterLeftPanel.add(playerIcon1);

        Dimension playerIconMinSize1 = new Dimension(20, 80);
        Dimension playerIconPrefSize1 = new Dimension(20, 80);
        Dimension playerIconMaxSize1 = new Dimension(20, 80);
        rightCenterCenterLeftPanel.add(new Box.Filler(playerIconMinSize1, playerIconPrefSize1, playerIconMaxSize1));

        playerIcon2 = new JButton();
        playerIcon2.setPreferredSize(new Dimension(20,20));
        playerIcon2.setBackground(Color.WHITE);
        playerIcon2.setOpaque(true);
        playerIcon2.setBorderPainted(false);
        rightCenterCenterLeftPanel.add(playerIcon2);

        rightCenterCenterLeftPanel.add(new Box.Filler(playerIconMinSize1, playerIconPrefSize1, playerIconMaxSize1));

        playerIcon3 = new JButton();
        playerIcon3.setPreferredSize(new Dimension(20,20));
        playerIcon3.setBackground(Color.WHITE);
        playerIcon3.setOpaque(true);
        playerIcon3.setBorderPainted(false);
        rightCenterCenterLeftPanel.add(playerIcon3);

        rightCenterCenterLeftPanel.add(new Box.Filler(playerIconMinSize1, playerIconPrefSize1, playerIconMaxSize1));

        playerIcon4 = new JButton();
        playerIcon4.setPreferredSize(new Dimension(20,20));
        playerIcon4.setBackground(Color.WHITE);
        playerIcon4.setOpaque(true);
        playerIcon4.setBorderPainted(false);
        rightCenterCenterLeftPanel.add(playerIcon4);

        rightCenterCenterPanel.add(rightCenterCenterLeftPanel, BorderLayout.WEST);

        JPanel rightCenterCenterRightPanel = new JPanel();
        rightCenterCenterRightPanel.setPreferredSize(new Dimension(30,800));
        
        playerIcon5 = new JButton();
        playerIcon5.setPreferredSize(new Dimension(20,20));
        playerIcon5.setBackground(Color.WHITE);
        playerIcon5.setOpaque(true);
        playerIcon5.setBorderPainted(false);
        rightCenterCenterRightPanel.add(new Box.Filler(playerIconMinSize, playerIconPrefSize, playerIconMaxSize));
        rightCenterCenterRightPanel.add(playerIcon5);

        rightCenterCenterRightPanel.add(new Box.Filler(playerIconMinSize1, playerIconPrefSize1, playerIconMaxSize1));

        playerIcon6 = new JButton();
        playerIcon6.setPreferredSize(new Dimension(20,20));
        playerIcon6.setBackground(Color.WHITE);
        playerIcon6.setOpaque(true);
        playerIcon6.setBorderPainted(false);
        rightCenterCenterRightPanel.add(playerIcon6);

        rightCenterCenterRightPanel.add(new Box.Filler(playerIconMinSize1, playerIconPrefSize1, playerIconMaxSize1));

        playerIcon7 = new JButton();
        playerIcon7.setPreferredSize(new Dimension(20,20));
        playerIcon7.setBackground(Color.WHITE);
        playerIcon7.setOpaque(true);
        playerIcon7.setBorderPainted(false);
        rightCenterCenterRightPanel.add(playerIcon7);

        rightCenterCenterRightPanel.add(new Box.Filler(playerIconMinSize1, playerIconPrefSize1, playerIconMaxSize1));

        playerIcon8 = new JButton();
        playerIcon8.setPreferredSize(new Dimension(20,20));
        playerIcon8.setBackground(Color.WHITE);
        playerIcon8.setOpaque(true);
        playerIcon8.setBorderPainted(false);
        rightCenterCenterRightPanel.add(playerIcon8);

        rightCenterCenterPanel.add(rightCenterCenterRightPanel, BorderLayout.EAST);

        JPanel rightCenterCenterCenterPanel = new JPanel();
        rightCenterCenterCenterPanel.setLayout(new GridLayout(4,5,5,5));
        rightCenterCenterCenterPanel.setPreferredSize(new Dimension(500, 600));

        currentTile11 = new JButton();
        currentTile11.setPreferredSize(new Dimension(50,50));
        currentTile11.setMaximumSize(new Dimension(50,50));
        currentTile11.setBackground(Color.WHITE);
        currentTile11.setOpaque(true);
        currentTile11.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(currentTile11);

        currentTile12 = new JButton();
        currentTile12.setPreferredSize(new Dimension(50,50));
        currentTile12.setBackground(Color.WHITE);
        currentTile12.setOpaque(true);
        currentTile12.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(currentTile12);

        Dimension tile1MinSize = new Dimension(200, 50);
        Dimension tile1PrefSize = new Dimension(200, 50);
        Dimension tile1MaxSize = new Dimension(Short.MAX_VALUE, 50);
        rightCenterCenterCenterPanel.add(new Box.Filler(tile1MinSize, tile1PrefSize, tile1MaxSize));

        nextRndTile11 = new JButton();
        nextRndTile11.setPreferredSize(new Dimension(50,50));
        nextRndTile11.setBackground(Color.WHITE);
        nextRndTile11.setOpaque(true);
        nextRndTile11.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(nextRndTile11);

        nextRndTile12 = new JButton();
        nextRndTile12.setPreferredSize(new Dimension(50,50));
        nextRndTile12.setBackground(Color.WHITE);
        nextRndTile12.setOpaque(true);
        nextRndTile12.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(nextRndTile12);

        currentTile21 = new JButton();
        currentTile21.setPreferredSize(new Dimension(50,50));
        currentTile21.setBackground(Color.WHITE);
        currentTile21.setOpaque(true);
        currentTile21.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(currentTile21);

        currentTile22 = new JButton();
        currentTile22.setPreferredSize(new Dimension(50,50));
        currentTile22.setBackground(Color.WHITE);
        currentTile22.setOpaque(true);
        currentTile22.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(currentTile22);

        rightCenterCenterCenterPanel.add(new Box.Filler(tile1MinSize, tile1PrefSize, tile1MaxSize));

        nextRndTile21 = new JButton();
        nextRndTile21.setPreferredSize(new Dimension(50,50));
        nextRndTile21.setBackground(Color.WHITE);
        nextRndTile21.setOpaque(true);
        nextRndTile21.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(nextRndTile21);

        nextRndTile22 = new JButton();
        nextRndTile22.setPreferredSize(new Dimension(50,50));
        nextRndTile22.setBackground(Color.WHITE);
        nextRndTile22.setOpaque(true);
        nextRndTile22.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(nextRndTile22);

        currentTile31 = new JButton();
        currentTile31.setPreferredSize(new Dimension(50,50));
        currentTile31.setBackground(Color.WHITE);
        currentTile31.setOpaque(true);
        currentTile31.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(currentTile31);

        currentTile32 = new JButton();
        currentTile32.setPreferredSize(new Dimension(50,50));
        currentTile32.setBackground(Color.WHITE);
        currentTile32.setOpaque(true);
        currentTile32.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(currentTile32);

        rightCenterCenterCenterPanel.add(new Box.Filler(tile1MinSize, tile1PrefSize, tile1MaxSize));

        nextRndTile31 = new JButton();
        nextRndTile31.setPreferredSize(new Dimension(50,50));
        nextRndTile31.setBackground(Color.WHITE);
        nextRndTile31.setOpaque(true);
        nextRndTile31.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(nextRndTile31);

        nextRndTile32 = new JButton();
        nextRndTile32.setPreferredSize(new Dimension(50,50));
        nextRndTile32.setBackground(Color.WHITE);
        nextRndTile32.setOpaque(true);
        nextRndTile32.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(nextRndTile32);

        currentTile41 = new JButton();
        currentTile41.setPreferredSize(new Dimension(50,50));
        currentTile41.setBackground(Color.WHITE);
        currentTile41.setOpaque(true);
        currentTile41.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(currentTile41);

        currentTile42 = new JButton();
        currentTile42.setPreferredSize(new Dimension(50,50));
        currentTile42.setBackground(Color.WHITE);
        currentTile42.setOpaque(true);
        currentTile42.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(currentTile42);

        rightCenterCenterCenterPanel.add(new Box.Filler(tile1MinSize, tile1PrefSize, tile1MaxSize));

        nextRndTile41 = new JButton();
        nextRndTile41.setPreferredSize(new Dimension(50,50));
        nextRndTile41.setBackground(Color.WHITE);
        nextRndTile41.setOpaque(true);
        nextRndTile41.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(nextRndTile41);

        nextRndTile42 = new JButton();
        nextRndTile42.setPreferredSize(new Dimension(50,50));
        nextRndTile42.setBackground(Color.WHITE);
        nextRndTile42.setOpaque(true);
        nextRndTile42.setBorderPainted(false);
        rightCenterCenterCenterPanel.add(nextRndTile42);

        rightCenterCenterPanel.add(rightCenterCenterCenterPanel, BorderLayout.CENTER);
        rightCenterPanel.add(rightCenterCenterPanel, BorderLayout.CENTER);
        
        rightPanel.add(rightCenterPanel, BorderLayout.CENTER);

        getContentPane().add(rightPanel, BorderLayout.EAST);

        centerPanel.setLayout(new GridLayout(ROWS,COLUMNS,5,5));
        addGridSquares();
        getContentPane().add(centerPanel, BorderLayout.CENTER);

        setVisible(false);

    }

    private void addGridSquares()
    {
        gridSquares = new GridSquares [ROWS][COLUMNS];
        for(int i = 0; i < ROWS; ++i){
            for(int j = 0; j < COLUMNS; ++j){
                gridSquares[i][j] = new GridSquares(i,j);
                centerPanel.add(gridSquares[i][j]);
            }
        }
    }

    private void quit()
    {
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit the current game?", "Confirmation Required", JOptionPane.YES_NO_OPTION); 
            if(answer == 0){
                setVisible(false);
                frameManager.showMainFrame();
            }
    }

    private void options()
    {

    }

    private void rotateLeft()
    {

    }

    private void rotateRight()
    {

    }

    public static void main(String[] args) {
        FrameManager frameManager = new FrameManager();
        new GameBoard(frameManager);
        frameManager.showGameBoard();
    }

}