package cfg;

import java.util.LinkedList;
import java.util.*;

public class BlockGenerator {

	private LinkedList <String> statements = new LinkedList<String>(); //linkedlist (String) statements
	
	 
    public void separateStatements()
   {
         for (int i = 0; i < statements.size(); i++)
         {
               //split statements with semicolons within the linkedlist statements
        	 List<String> spl = new ArrayList<String>(Arrays.asList(statements.get(i).split(";")));
				
 			 if (spl.size() > 1){
 								
 				boolean lastsc = false;
 				if (statements.get(i).matches("^.*;$")){
 					lastsc = true;
 				}//end if
 				
 				statements.set(i,spl.get(0)+";");
 				for (int j=1; j<spl.size(); j++){
 					if (j<spl.size()-1){
 						statements.add(i+j,spl.get(j)+";");
 					}//end if
 					
 					else {
 						statements.add(i+j,spl.get(j)+(lastsc?";":""));
 					}//end else
 				}//end for loop
              }//end if

          }//for loop
   }//end separateStatements() procedure
    
    public void combineMultiStatements()
    {
              int i = 0;

             while ( i < statements.size())
             {
            	 while (!statements.get(i).contains(";") && !statements.get(i).contains("{") && !statements.get(i).contains("}")){
            		//combine any multi-line statements
            		statements.set(i, statements.get(i) + statements.get(i+1));
                    statements.remove(i+1);   
            	 }//end nested while loop
                            

                 i = i + 1;
             }//end while loop
    }//end combineMultiStatements() procedure

    
    
    
    
    
}

 
 


