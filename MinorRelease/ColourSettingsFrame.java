import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*; 

public class ColourSettingsFrame extends GameFrame
{
	private FrameManager frameManager;
	private JComboBox<String> comboBox;
	/**
	 * Create the frame.
	 */
	public ColourSettingsFrame() 
	{
		super();
		makeFrame();
    }

    private void makeFrame()
    {	
		setBackgroundColour();
		
		JLabel lblColourSettings = new JLabel("Colour Settings");
		lblColourSettings.setBackground(getTextColour());
		lblColourSettings.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblColourSettings = new GridBagConstraints();
		gbc_lblColourSettings.weightx = 1;
		gbc_lblColourSettings.weighty = 1;
		gbc_lblColourSettings.fill = GridBagConstraints.BOTH;
		gbc_lblColourSettings.gridx = 7;
		gbc_lblColourSettings.gridy = 0;
		getContentPane().add(lblColourSettings, gbc_lblColourSettings);


        String choices[] = {"Please select your preferred colour option", "Standard", "Accessible"};
        comboBox = new JComboBox<>(choices);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridheight = 2;
		gbc_comboBox.weighty = 1;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.ipady = 40;
		gbc_comboBox.gridwidth = 11;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 3;
        comboBox.addActionListener(e-> confirmColourSettings((String)comboBox.getSelectedItem()));
		getContentPane().add(comboBox, gbc_comboBox);
        

        JButton btnNewButton_1 = new JButton("Back");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.weightx = 0.0;
		gbc_btnNewButton_1.weighty = 1.0;
		gbc_btnNewButton_1.gridwidth = 2;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 19;
		btnNewButton_1.addActionListener(e-> back());
		getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Help");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.weightx = 0.0;
		gbc_btnNewButton_2.weighty = 0.0;
		gbc_btnNewButton_2.gridwidth = 2;
		gbc_btnNewButton_2.gridx = 12;
		gbc_btnNewButton_2.gridy = 19;
		getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);

		setVisible(false);

	}

    private void confirmColourSettings(String choise){
        if(choise != "Please select your preferred colour option"){
            int answer = JOptionPane.showConfirmDialog(null, "Would you like to set " + choise + " as your colour settings?", "Confirmation Required", JOptionPane.YES_NO_OPTION); 
            if(answer == 0){
                changeColour(choise);
                JOptionPane.showMessageDialog(null, "Your preferred colour settings have been applied.", null, JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

	private void changeColour(String colourChoise){
        if( colourChoise == "Accessible"){
            // to be executed
			
        }
        else{
            // to be executed
        }
    }


	private void back() 
	{
		frameManager = new FrameManager();
		setVisible(false);
		frameManager.showSettingsFrame();
		
		
	}

}	