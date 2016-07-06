package cfg;

import java.util.*;

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
	
	
	
	

}
