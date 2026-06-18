import java.util.Scanner;

public class Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int choice;
        // do {
        //     System.out.println("1. Add");
        //     System.out.println("2. Delete");
        //     System.out.println("3. Exit");

        //     System.out.print("Enter your choice:");
        //     choice = sc.nextInt();
        // } while (choice != 3);

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
        sc.close();
    }
}
