import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PlayerSetting extends GameFrame
{
	private FrameManager frameManager;
	

	
	public PlayerSetting(FrameManager frameManager) 
	{
		super();
		this.frameManager = frameManager;
		makeFrame();
	}
	
	private void makeFrame()
    {
		JPanel topPanel= new JPanel();
		topPanel.setLayout( new FlowLayout());
		JLabel topLabel= new JLabel("Select number of players");
		JPanel bottomPanel=new JPanel();
		JLabel bottomLabel= new JLabel("Select number of human players");
		JPanel middlePanel=new JPanel();
		//JPanel anotherPanel=new JPanel();
		JPanel playerPanel=new JPanel();
		JButton B2= new JButton("2");
		JButton B3= new JButton("3");
		JButton B4= new JButton("4");
		JButton B5= new JButton("1");
		JButton B6= new JButton("2");
		JButton B7= new JButton("3");
		JButton B8= new JButton("4");
		JButton B9= new JButton("back");
		JButton B10= new JButton("next");
		JTextField text1= new JTextField();
		text1.setPreferredSize(new Dimension(80,30));
		JTextField text2= new JTextField();
		text2.setPreferredSize(new Dimension(80,30));
     	JTextField text3= new JTextField();
     	text3.setPreferredSize(new Dimension(80,30));
     	JTextField text4= new JTextField();
     	text4.setPreferredSize(new Dimension(80,30));
     	JLabel info= new JLabel("Enter player name and select colours");
     
     
     
     
     	topPanel.add(topLabel);
     	//topPanel.add(B1);
     	topPanel.add(B2);
     	topPanel.add(B3);
     	topPanel.add(B4);
     	bottomPanel.add(bottomLabel);
     	bottomPanel.add(B5);
     	bottomPanel.add(B6);
     	bottomPanel.add(B7);
     	bottomPanel.add(B8);
     	middlePanel.add(B9);
     	middlePanel.add(B10);
     	String[] colors={"","red","green","yellow","blue"};
     	JComboBox box1=new JComboBox(colors);
     	JComboBox box2=new JComboBox(colors);
     	JComboBox box3=new JComboBox(colors);
     	JComboBox box4=new JComboBox(colors);

     	playerPanel.add(info);
     	playerPanel.add(text1);
     	playerPanel.add(box1);
     	playerPanel.add(text2);
     	playerPanel.add(box2);
     	playerPanel.add(text3);
     	playerPanel.add(box3);
     	playerPanel.add(text4);
     	playerPanel.add(box4);
    
     
     
     	getContentPane().setLayout(new FlowLayout());
     	getContentPane().add( topPanel);
     	getContentPane().add(bottomPanel);
     	getContentPane().add(playerPanel);
     	getContentPane().add(middlePanel);
     	pack();
     	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
     	setSize(700,700);
     	setResizable(false);
     	setVisible( false);
    }
	
	public void goBack()
	{
		setVisible(false);
		frameManager.showGameModeFrame();
	}
}

    

    