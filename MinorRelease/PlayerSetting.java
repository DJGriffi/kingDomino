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

public class PlayerSetting extends JFrame
{
    
    private int x;
    private JPanel topPanel, bottomPanel,middlePanel,playerPanel;  
    private JLabel topLabel,bottomLabel,info;
    private JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10;
    private JTextField text1,text2,text3,text4;
    private JComboBox box1,box2,box3,box4;
    

    /**
     * Constructor for objects of class PlayerSelection
     */
    public PlayerSetting()
    {topPanel= new JPanel();
     topPanel.setLayout( new FlowLayout());
     topLabel= new JLabel("Select number of players");
     bottomPanel=new JPanel();
     bottomLabel= new JLabel("Select number of human players");
     middlePanel=new JPanel();
     playerPanel=new JPanel();
     //B1= new JButton("1");
     B2= new JButton("2");
     B3= new JButton("3");
     B4= new JButton("4");
     B5= new JButton("1");
     B6= new JButton("2");
     B7= new JButton("3");
     B8= new JButton("4");
     B9= new JButton("back");
     B10= new JButton("next");
     JTextField text1= new JTextField();
     text1.setPreferredSize(new Dimension(50,40));
     JTextField text2= new JTextField();
     text2.setPreferredSize(new Dimension(50,40));
     JTextField text3= new JTextField();
     text3.setPreferredSize(new Dimension(50,40));
     JTextField text4= new JTextField();
     text4.setPreferredSize(new Dimension(50,40));
     info= new JLabel("enter player name");
     
     
     
     
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
     String[] colors={"red","green","yellow","blue"};
     box1=new JComboBox(colors);
     box2=new JComboBox(colors);
     box3=new JComboBox(colors);
     box4=new JComboBox(colors);

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
     setSize(700,300);
     setResizable(false);
     setVisible( true);
    }



}
    

    