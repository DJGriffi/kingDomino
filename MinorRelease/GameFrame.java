import javax.swing.JFrame;
import java.awt.GridBagLayout;

public class GameFrame extends JFrame
{


    public GameFrame()
    {
        super();
        setBounds(100, 100, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridBagLayout());
    }

    public void makeVisible()
    {
        setVisible(true);
    }

    public void makeInvisible()
    {
        setVisible(false);
    }
}