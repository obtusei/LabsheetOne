import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 6.	Illustrate use of Stream classes to take user’s input 
public class Qsix {
      public static void main(String[] args) {
            System.out.println("Name: Abhishek Bhatta and CRN:019-312");
            System.out.println("---------------------------------");
            String text;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the text: ");
            try {
                  text = br.readLine();
                  System.out.println("You entered: " + text);
            } catch (IOException e) {
                  System.out.println(e.getLocalizedMessage());
            }
      }
}
