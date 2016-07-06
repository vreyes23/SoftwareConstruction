package cfg;

import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class StatementGenerator {

	private List<String> lines;

	public void AddStatements(String line){
		lines.add(line);
	}//end AddStatements() procedure
	
	public int getNextLine(int start){
	    int nextlinesegment = start + 1;
	    
	    while (nextlinesegment < lines.size()){
	    	
	    	nextlinesegment++;
	    }//end while loop
	    return (nextlinesegment);
		
	}//end getNextLine() function
	
	public List<String> getStatementLines() {
		return lines;
	}//end getLines() function

	public void setStatementLines(List<String> lines) {
		this.lines = lines;
	}//end setLines() procedure
	
	public void trimLineStatement(){
		//trim all lines (remove indents)
		for (int i = 0; i < lines.size(); i++){
			lines.set(i, lines.get(i).trim());
		}//end for loop
	}// end trimLineStatement() procedure
	
	public void removeBlankLines(){
		//remove blank lines from (linklist) lines
		lines.removeAll(Collections.singleton(""));
	}//end removeBlankLines() procedure
	
	public void eliminateComments(){
		//eliminate comments
		for (int i = 0; i < lines.size(); i++){
			//search through each index of the (linkedlist) lines & find all "//"
			int indexofline = lines.get(i).indexOf("//");
			if (indexofline >= 0){
				lines.set(i, lines.get(i).substring(0, indexofline));
			}//end if
		}//end for 
	}//end of eliminateComments() procedure
	
	public void moveOpenBrace(){
		//move opening braces on their own line to
		// the previous line
		for (int i = lines.size()-1; i>=0; i--){
			if (lines.get(i).equals("{")){
				lines.set(i-1, lines.get(i-1)+"{");
				lines.remove(i);
			}
		}//end for
	}//end moveOpenBrace() procedure
	
	public void readFileInput(String path)
	   {
			
			FileInputStream fstream = null;
			
			try{
				//Read in the input file passed through the param: path
				fstream = new FileInputStream(path);
				//Print “File accepted”
				System.out.println("File accepted");
			}//end try
			catch (IOException e){
				//Throw an Input Output Exception
				System.err.println("Unable opening file "+path+".\n"+e.getMessage());
				//Print “please try again, file not accepted”
				System.out.println("Please try again, File not accepted");
				System.exit(1);
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
	  }//end readFileInput(param) procedure
	
	

}
