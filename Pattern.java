import java.util.*;
public class Pattern {

    public static void hollow_Rectangle (int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if( i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = i; j <= n; j++){  //  j = 1; j <= (n-i+1)
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter the number of rows: ");
        // int n = sc.nextInt();
        // char ch = 'A';
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter the number of Rows: ");
        // int row = sc.nextInt();
        // System.out.print("Enter the number of Cols: ");
        // int cols = sc.nextInt();
        // hollow_Rectangle(row, cols);

        sc.close();
    }
}