import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameBoard extends JFrame 
{
    private GridSquares [][] gridSquares;	// squares to appear in grid formation in the bottom panel
    private final int COLUMNS = 10;
    private final int ROWS = 10;
    private JPanel topPanel, centerPanel, bottomPanel;	


    public GameBoard()
    {
        super();
        setBounds(100, 100, 1500, 1500);
        getContentPane().setLayout(new BorderLayout());
        makeBoard();
    }

    private void  makeBoard()
    {
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(ROWS,COLUMNS,5,5));
        addGridSquares();
        getContentPane().add(centerPanel, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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