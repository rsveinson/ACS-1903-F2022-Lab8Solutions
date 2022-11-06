
/*******************************************************
 * Name:        your name
 * Class:       ACS-1903
 * 
 * Assignment:  Lab XX

 **********************************************************************/

// import statements go here
import javax.swing.JOptionPane;
import java.util.Random;

public class GuessOlympiadSolution {
    public static void main(String[] args) {
    // ****** Constants Variables and Objects *****
    
    Random r = new Random();    // random number generator
    int n = 0;          // random nuber to be guessed
    int guess = 0;      // number guessed by player
    int guesses = 1;    // number of guesses
            
    // ***** Play the guessing game *****

    n = r.nextInt(128) + 1; 
    
    guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 128"));

    while(guess != n && guesses <= 10){
        JOptionPane.showMessageDialog(null, (guess > n) ? "Too high." : "Too low.");
        guesses++;
        
        guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 128"));
    }// eng game loop
    
    // ***** Pint summary *****
    
    if(guesses <= 10)
        JOptionPane.showMessageDialog(null, "Congratulations! You win in " + guesses + " guesses.");
    else
        JOptionPane.showMessageDialog(null, "Your 10 guesses are up, you lose.");
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
