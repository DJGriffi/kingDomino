import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.BorderFactory;
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

        bottomPanel = new JPanel();
        centerPanel = new JPanel();
        setBounds(100, 100, 2000, 1500);
        getContentPane().setLayout(new BorderLayout());
        makeBoard();
    }

    private void makeBoard()
    {
        rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(800,1500));
        rightPanel.setLayout(new BorderLayout());

        topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(800,60));
        topPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JPanel topLeft = new JPanel();
        topLeft.setPreferredSize(new Dimension(200,20));
        topLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
        round = new JLabel("Round #: 1", SwingConstants.CENTER);
        topLeft.add(round);
        topPanel.add(topLeft);

        JPanel topCenter = new JPanel();
        topCenter.setPreferredSize(new Dimension(200,40));
        whoTurn = new JLabel("Player One's turn", SwingConstants.CENTER);
        doThis = new JLabel("Do this thing this turn", SwingConstants.CENTER);
        topCenter.add(whoTurn);
        topCenter.add(doThis);
        topPanel.add(topCenter);

        JPanel topRight = new JPanel();
        topRight.setPreferredSize(new Dimension(200,20));
        topRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        tilesLeft = new JLabel("Tiles remaining: 64", SwingConstants.CENTER);
        topRight.add(tilesLeft);
        topPanel.add(topRight);

        rightPanel.add(topPanel, BorderLayout.NORTH);

        //JButton leftRotate = new JButton("Left");
        //topPanel.add(leftRotate);

        //JLabel rotate = new JLabel("Rotate Tiles");
        //topPanel.add(rotate);

        //JButton rightRotate = new JButton("Right");
        //topPanel.add(rightRotate);

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