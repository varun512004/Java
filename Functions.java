import java.util.*;
public class Functions {

    public static void Calculate(int a, int b, int op) {
        switch (op) {
            case 1: System.out.println("The Sum of a & b is: " + (a + b));
            break;
            case 2: System.out.println("The Subtraction of a & b is: " + (a - b));
            break;
            case 3: System.out.println("The Multiplication of a & b is: " + (a * b));
            break;
            case 4: System.out.println("The Division of a & b is: " + (a / b));
            break;
            default:
                System.out.println("Entered Wrong Choice!");
        }
    }

    public static long factorial(long n) {
        long fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 2; i <=n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long binCoeff(long n, long r) {
        long factN = factorial(n);
        long factR = factorial(r);
        long factNmr = factorial(n-r);
        return factN / (factR * factNmr);
    }

    public static void binToDec(int biNum) {
        int myNum = biNum;
        int decNum = 0;
        int pow = 0;
        while (biNum > 0) {
            int lastDigit =  biNum % 10;
            decNum += lastDigit * (int)Math.pow(2, pow);
            biNum /= 10;
            pow++;
        }
        System.out.println("The Decimal of " + myNum + " is: " + decNum);
    }

    public static void decToBi(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int biNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            biNum += rem * (int)Math.pow(10, pow);
            decNum /= 2;
            pow++;
        }
        System.out.println("The Binary of " + myNum + " is: " + biNum);
    }

    public static int avg(int a, int b, int c) {
        return (a + b + c)/3;
    }

    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the value of b: ");
        // int b = sc.nextInt();
        // System.out.print("""
        // 1. Add
        // 2. Subtraction
        // 3. Multiplication
        // 4. Division
        // Which operation do you want to perform: """);
        // int op = sc.nextInt();
        // Calculate(a, b, op);

        // System.out.print("Enter the value of a: ");
        // int a = sc.nextInt();
        // if (a < 0) {
        //     System.out.println("Factorial for negative value is not defined!");
        // } else {
        //     System.out.println("The " + a + "! is: " + factorial(a));
        // }

        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the value of r: ");
        // int r = sc.nextInt();
        // System.out.println("The Binomial Coefficient of n,r is: " + binCoeff(n, r));

        // System.out.print("Enter the binary no: ");
        // int n = sc.nextInt();
        // binToDec(n);

        // System.out.print("Enter the decimal no: ");
        // int n = sc.nextInt();
        // decToBi(n);

        // System.out.print("Enter the value of a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the value of b: ");
        // int b = sc.nextInt();
        // System.out.print("Enter the value of c: ");
        // int c = sc.nextInt();
        // System.out.println("The average of " + a + ", " + b + " & " + c + " is: " + avg(a, b, c));

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(isEven(n)) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }

        sc.close();
    }
}