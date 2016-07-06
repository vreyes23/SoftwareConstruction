package File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

   
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
  }

}
