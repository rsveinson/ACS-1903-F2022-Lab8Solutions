import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * ACS-1903 Lab8 Q7
 * @author (your name and student number here)
 */
public class TokenCountSolution{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner f = new Scanner(new File("lab8.txt"));
        int count=0, countS=0;
        String token;
        char ch;

        // add your code here
        while(f.hasNext()){
            token = f.next();
            
            // count total words (tokens)
            count++;
            
            // count tokens startin with s or S
            ch = token.charAt(0);
            ch = Character.toLowerCase(ch);
            
            countS += ch == 's' ? 1 : 0;

        }//end while

        System.out.println("Number of tokens: " + count);
        System.out.println("Number of tokens starting with s or S: " + countS);

    }
}
