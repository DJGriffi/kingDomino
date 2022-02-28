import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame
{
    private JButton b1, b2, b3, b4, b5;
	private JLabel title;
	
    /**
	 * Create the frame.
	 */
	public MainFrame() 
	{	
		setBounds(100, 100, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridBagLayout());
		makeStartingFrame();
	}

	public void makeStartingFrame()
	{
		GridBagConstraints gbc = new GridBagConstraints();

		title = new JLabel("KingDomino");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 5;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		getContentPane().add(title, gbc);
		
		b1 = new JButton("Play a Game");
		gbc.gridx = 5;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.weighty = 0.2;
		gbc.fill = GridBagConstraints.NONE;
		b1.addActionListener(e->setUp());
		getContentPane().add(b1, gbc);
		
		
		b2 = new JButton("Load a Game");
		gbc.gridx = 5;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		getContentPane().add(b2, gbc);
		
		b3 = new JButton("Settings");

		gbc.gridx = 5;
		gbc.gridy = 6;
		gbc.gridwidth = 2;
		getContentPane().add(b3, gbc);
		
		b4 = new JButton("Quit");
		b4.setHorizontalTextPosition(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.gridwidth = 2;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;

		getContentPane().add(b4, gbc);
		
		b5 = new JButton("Help");
		b5.setHorizontalTextPosition(SwingConstants.CENTER);
		gbc.gridx = 9;
		gbc.gridy = 10;
		gbc.gridwidth = 2;
		getContentPane().add(b5, gbc);

		setVisible(true);
	}

	private void makeSetupFrame()
	{

		JLabel lblSelectGameMode = new JLabel("Select Game Mode");
		lblSelectGameMode.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblSelectGameMode = new GridBagConstraints();
		gbc_lblSelectGameMode.weightx = 1;
		gbc_lblSelectGameMode.weighty = 1;
		gbc_lblSelectGameMode.fill = GridBagConstraints.BOTH;
		gbc_lblSelectGameMode.gridx = 7;
		gbc_lblSelectGameMode.gridy = 0;
		getContentPane().add(lblSelectGameMode, gbc_lblSelectGameMode);
		
		JButton btnNewButton = new JButton("<html><b><u>G</u>ame mode</b><p>description</html>");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridheight = 2;
		gbc_btnNewButton.weighty = 1;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.ipady = 40;
		gbc_btnNewButton.gridwidth = 11;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 3;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<html><b><u>G</u>ame mode</b><p>description</html>");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridheight = 2;
		gbc_btnNewButton_1.weighty = 1;
		gbc_btnNewButton_1.ipady = 40;
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.gridwidth = 11;
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 5;
		getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<html><b><u>G</u>ame mode</b><p>description</html>");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridheight = 2;
		gbc_btnNewButton_2.gridwidth = 11;
		gbc_btnNewButton_2.weighty = 1;
		gbc_btnNewButton_2.ipady = 40;
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 8;
		getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("<html><b><u>G</u>ame mode</b><p>description</html>");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.gridheight = 2;
		gbc_btnNewButton_3.weighty = 1;
		gbc_btnNewButton_3.ipady = 40;
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.gridwidth = 11;
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 11;
		getContentPane().add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("<html><b><u>G</u>ame mode</b><p>description</html>");
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.gridheight = 2;
		gbc_btnNewButton_4.gridwidth = 11;
		gbc_btnNewButton_4.weighty = 1;
		gbc_btnNewButton_4.ipady = 40;
		
		gbc_btnNewButton_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_4.gridx = 2;
		gbc_btnNewButton_4.gridy = 14;
		getContentPane().add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Back");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.weightx = 0.0;
		gbc_btnNewButton_5.weighty = 1.0;
		gbc_btnNewButton_5.gridwidth = 2;
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 19;
		btnNewButton_5.addActionListener(e-> backToMainFrame());
		getContentPane().add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Help");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.weightx = 0.0;
		gbc_btnNewButton_6.weighty = 0.0;
		gbc_btnNewButton_6.gridwidth = 2;
		gbc_btnNewButton_6.gridx = 12;
		gbc_btnNewButton_6.gridy = 19;
		getContentPane().add(btnNewButton_6, gbc_btnNewButton_6);

		setVisible(true);
	}

	private void backToMainFrame() 
	{
		setVisible(false);
		getContentPane().removeAll();
		getContentPane().validate();
		makeStartingFrame();
	}

	private void setUp() 
	{	
		setVisible(false);
		getContentPane().removeAll();
		getContentPane().validate();
		makeSetupFrame();
	}

}
