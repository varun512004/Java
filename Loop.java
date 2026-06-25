import java.util.*;

public class Loop {
    public static void table(int number){
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // table(19);

        
        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= 4; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            reverse = (reverse * 10) + lastDigit;
        }
        System.out.print("The reversed number is: " + reverse);

        // int choice;
        // do {
        //     System.out.println("1. Add");
        //     System.out.println("2. Delete");
        //     System.out.println("3. Exit");
        //     System.out.print("Enter your choice:");
        //     choice = sc.nextInt();
        // } while (choice != 3);

        // int n;
        // String choice;
        // int evenSum = 0;
        // int oddSum = 0;
        // do{
        //     System.out.print("Enter the number: ");
        //     n = sc.nextInt();
        //     if(n % 2 == 0){
        //         evenSum += n;
        //     } else {
        //         oddSum += n;
        //     }
        //     System.out.print("Do you want to add more numbers: ");
        //     choice = sc.next();
        // } while(choice.equalsIgnoreCase("Yes"));
        // System.out.println("The sum of even numbers is: " + evenSum);
        // System.out.println("The sum of odd numbers is: " + oddSum);

        // int n;
        // int factorial = 1;
        // do{
        //     System.out.print("Enter the number: ");
        //     n = sc.nextInt();
        //     if(n < 0){
        //         System.out.println("Factorial is not defined for negative numbers.");
        //     }
        //     else if(n == 0 || n == 1){
        //         factorial = 1;
        //     }
        //     else {
        //         for(int i = 1; i <= n; i++){
        //             factorial *= i;
        //         }
        //     }
        // } while(n < 0);
        // System.out.println("The " + n + "! is: " + factorial);

        sc.close();
    }
}
