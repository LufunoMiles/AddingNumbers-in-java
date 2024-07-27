import java.util.Scanner;

public class AddingNumbers {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter Your First Number");
     int num1 = scanner.nextInt();
  
     System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
 
     int sum = num1 + num2 ;
     System.out.println("The sum is: " + sum);

    scanner.close();

}

}