
import java.util.Scanner;

public class userInput {

    public static void main (String[] args) {

        Scanner Scan = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name1 = Scan.nextLine();
         System.out.println("Enter your age: ");
         String age1 = Scan.nextLine();

         System.out.println("Your name is "+ name1 + " and your age is "+ age1);


Scan.close();
    }
    
}