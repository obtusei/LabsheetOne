
import java.util.Scanner;

public class Qtwo {

      Scanner scn = new Scanner(System.in);

      public static void main(String[] args) {
            System.out.println("Name: Abhishek Bhatta and CRN:019-312");
            System.out.println("---------------------------------");
            Qtwo qtwo = new Qtwo();
            qtwo.choose();

      }

      public void choose() {
            System.out.println("Menu");
            System.out.println("1. To verify prime number");
            System.out.println("2. To find prime number between a given range");
            System.out.print("\nEnter your choice: ");
            int choice = scn.nextInt();
            switch (choice) {
                  case 1:
                        primeNumberVerification();
                        break;
                  case 2:
                        primeNumberBetweenRange();
                        break;
                  default:
                        System.out.println("Invalid choice");
                        break;
            }
      }

      // method to verify prime number
      public void primeNumberVerification() {
            System.out.print("Enter a number to verify prime number: ");
            int num = scn.nextInt();
            int flag = 0;
            for (int i = 2; i < num; i++) {
                  if (num % i == 0) {
                        flag = 1;
                        break;
                  }
            }
            if (flag == 0) {
                  System.out.println(num + " is a prime Number");
            } else {
                  System.out.println(num + " is not a prime Number");
            }
      }

      // method to print prime number between a given range
      public void primeNumberBetweenRange() {
            System.out.print("Enter the starting number: ");
            int start = scn.nextInt();
            System.out.print("Enter the ending number: ");
            int end = scn.nextInt();
            System.out.println("Prime Numbers between " + start + " and " + end + " are: ");
            for (int i = start; i <= end; i++) {
                  int flag = 0;
                  for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                              flag = 1;
                              break;
                        }
                  }
                  if (flag == 0) {

                        System.out.print(i + ", ");
                  }
            }
      }

}
