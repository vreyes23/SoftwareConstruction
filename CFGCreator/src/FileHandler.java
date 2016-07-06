import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.Dimension;


@SuppressWarnings("serial")
public class FileHandler extends JFrame {
	
	JLabel addressLabel;
	JTextField addressText;
	JButton submitButton;
	String address;
	JPanel panel;
	
	
	public String getFileAddress(){
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
				if (!isValidPath(address)){
					System.out.println("isValidPath has been checked and is false inside getFileAddress");
					address = null;
					revalidate();
					repaint();
				}
			}
		});
		panel.add(addressLabel,BorderLayout.LINE_START);
		panel.add(addressText,BorderLayout.LINE_END);
		panel.add(submitButton,BorderLayout.SOUTH);
		
		add(panel);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		return address;
	}//end getFileAddress method
	
	 public boolean isValidPath(String path){
	   	 
	   	 FileInputStream fstream = null;
	   	 boolean isValidPath = false;
	   	 
	   	 try{
	   		 //Read in the input file passed through the param: path
	   		 fstream = new FileInputStream(path);
	   		 //Print “File accepted”
	   		 System.out.println("File accepted");
	   		 isValidPath = true;
	   	 }//end try
	   	 catch (IOException e){
	   		 //Throw an Input Output Exception
	   		 System.err.println("Unable opening file "+path+".\n"+e.getMessage());
	   		 //Print “please try again, file not accepted”
	   		 System.out.println("Please try again, File not accepted");
	   		 isValidPath = false;
	   		 
	   		 //do something to repaint frame
	   		 
	   		 System.exit(1);
	   		 //isValidPath = false;
	   	 }//end catch
	   	 
	   	 Scanner s = new Scanner(fstream);
	   	 s.close();
	   	 try{
	   		 //Close the input file after reading in all the contents of the File
	   		 fstream.close();
	   	 }//end try
	   	 catch (IOException e){
	   		 //Throw an Input/Output Exception if a problem occurs
	   		 System.err.println("Error closing file "+path+".\n"+e.getMessage());
	   	 }//end catch
	   	 
	   	 return isValidPath;
	   	 
	  }//end isValidPath

	
	
	/*
	public static void main (String [] args){
		FileHandler filehandler = new FileHandler();
		filehandler.getFileAddress();
	}
	*/
}
