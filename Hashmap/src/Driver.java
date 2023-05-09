import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Driver {
	
  public static void main(String[] args) {
    try {
      File myObj = new File("covid417.csv");
      Scanner myReader = new Scanner(myObj);
      int count = 0;
      int i = 0;
      while (myReader.hasNextLine()) {
    	  //System.out.println(myReader.nextLine());
    	String line = myReader.nextLine();
    	i = line.indexOf("California");
        if(i > -1) {
        	//count += myReader.nextLine().substring(i+11)
        	System.out.println(line + " "+i);
        }
        i++;
      }
      myReader.close();
      //System.out.print(count);
    } 
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}