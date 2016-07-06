import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;


public class FileHandler extends JFrame {
	
	JLabel addressLabel;
	JTextField addressText;
	JButton submitButton;
	String address;
	JPanel panel;
	
	
	public void getFileAddress(){
		panel = new JPanel();
		addressLabel = new JLabel();
		addressLabel.setText("File Address: ");
		addressText = new JTextField();
		addressText.setPreferredSize(new Dimension(320, 20));

		submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				address = addressText.getText();
				System.out.println("" + address);
			}
		});
		panel.add(addressLabel,BorderLayout.LINE_START);
		panel.add(addressText,BorderLayout.LINE_END);
		panel.add(submitButton,BorderLayout.SOUTH);
		
		add(panel);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//end getFileAddress method
	
	public static void main (String [] args){
		FileHandler filehandler = new FileHandler();
		filehandler.getFileAddress();
	}
}
