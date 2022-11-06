
/*******************************************************
 * Name:        your name
 * Class:       ACS-1903
 * 
 * Assignment:  Lab XX

 **********************************************************************/

// import statements go here
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab8HasNextInt {
    public static void main(String[] args) throws FileNotFoundException{
    // ****** Constants Variables and Objects *****
    
    int n = 0;          // random nuber to be guessed
    int guess = 0;      // number guessed by player
    int guesses = 0;    // number of guesses
            
    String st = "1 2 3 hell";
    
    Scanner scan = new Scanner(new File("hni.txt"));
    
    while(scan.hasNextInt()){
        //n = scan.nextInt(); 
        String line = scan.next();
        System.out.println(line);
    }// end while
           
    // ***** Pint summary *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
