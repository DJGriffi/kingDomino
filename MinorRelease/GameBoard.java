import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameBoard extends GameFrame 
{
    private GridSquares [][] gridSquares;	// squares to appear in grid formation
    private final int COLUMNS = 10;
    private final int ROWS = 10;
    private JPanel rightPanel, topPanel, centerPanel, bottomPanel;
    private JLabel round, whoTurn, doThis, tilesLeft;
    private FrameManager frameManager;



    public GameBoard()
    {
        super();
        centerPanel = new JPanel();
        setBounds(100, 100, 2000, 1500);
        getContentPane().setLayout(new BorderLayout());
        makeBoard();
    }

    private void makeBoard()
    {
        rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(600,1500));
        rightPanel.setLayout(new BorderLayout());

        topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(600,60));
        topPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JPanel topLeft = new JPanel();
        topLeft.setPreferredSize(new Dimension(150,20));
        topLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
        round = new JLabel("Round #: 1", SwingConstants.CENTER);
        topLeft.add(round);
        topPanel.add(topLeft);

        JPanel topCenter = new JPanel();
        topCenter.setPreferredSize(new Dimension(150,50));
        whoTurn = new JLabel("Player One's turn", SwingConstants.CENTER);
        doThis = new JLabel("Do this thing this turn", SwingConstants.CENTER);
        topCenter.add(whoTurn);
        topCenter.add(doThis);
        topPanel.add(topCenter);

        JPanel topRight = new JPanel();
        topRight.setPreferredSize(new Dimension(150,20));
        topRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        tilesLeft = new JLabel("Tiles remaining: 64", SwingConstants.CENTER);
        topRight.add(tilesLeft);
        topPanel.add(topRight);

        rightPanel.add(topPanel, BorderLayout.NORTH);

        bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(600,60));
        bottomPanel.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));

        JButton quit = new JButton("Quit");
        quit.setAlignmentX(Component.LEFT_ALIGNMENT);
        bottomPanel.add(quit);

        Dimension minSize = new Dimension(300, 50);
        Dimension prefSize = new Dimension(300, 50);
        Dimension maxSize = new Dimension(Short.MAX_VALUE, 100);
        bottomPanel.add(new Box.Filler(minSize, prefSize, maxSize));

        JButton options = new JButton("Options");
        options.setAlignmentX(Component.RIGHT_ALIGNMENT);
        bottomPanel.add(options);
        
        rightPanel.add(bottomPanel, BorderLayout.SOUTH);

        JPanel rightCenterPanel = new JPanel();
        rightCenterPanel.setLayout(new BorderLayout());

        JPanel rightCenterTopPanel = new JPanel();
        rightCenterTopPanel.setPreferredSize(new Dimension(600,40));
        rightCenterTopPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        JButton leftRotate = new JButton("Left");
        rightCenterTopPanel.add(leftRotate);

        JLabel rotate = new JLabel("Rotate Tiles");
        rightCenterTopPanel.add(rotate);

        JButton rightRotate = new JButton("Right");
        rightCenterTopPanel.add(rightRotate);

        rightCenterPanel.add(rightCenterTopPanel, BorderLayout.NORTH);



        rightPanel.add(rightCenterPanel, BorderLayout.CENTER);

        getContentPane().add(rightPanel, BorderLayout.EAST);

        centerPanel.setLayout(new GridLayout(ROWS,COLUMNS,5,5));
        addGridSquares();
        getContentPane().add(centerPanel, BorderLayout.CENTER);


        setVisible(true);

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

    public static void main(String[] args) {
        new GameBoard();
    }
}