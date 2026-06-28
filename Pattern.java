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

    public static void inverted_Half_Pyramid (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverted_Half_Pyramid_Num(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyds_Triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j ++) {
                System.out.print(counter + " ");
                counter ++;
            }
            System.out.println();
        }
    }

    public static void zero_One_Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j ++) {
                if( (i + j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void rhombus (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_Rhombus (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                if (k == 1 || k == n || i == 1 || i == n) {
                    System.out.print( "* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print( "  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print( "  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
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

        // System.out.print("Enter the number of Rows: ");
        // int rows = sc.nextInt();
        // inverted_Half_Pyramid(rows);

        // System.out.print("Enter the number of Rows: ");
        // int rows = sc.nextInt();
        // inverted_Half_Pyramid_Num(rows);

        // System.out.print("Enter the number of Rows: ");
        // int rows = sc.nextInt();
        // floyds_Triangle(rows);

        // System.out.print("Enter the number of Rows: ");
        // int rows = sc.nextInt();
        // zero_One_Triangle(rows);

        // System.out.print("Enter the number of Rows: ");
        // int rows = sc.nextInt();
        // butterfly(rows);

        // System.out.print("Enter the number of Rows: ");
        // int rows = sc.nextInt();
        // rhombus(rows);

        // System.out.print("Enter the number of Rows: ");
        // int rows = sc.nextInt();
        // hollow_Rhombus(rows);

        System.out.print("Enter the number of Rows: ");
        int rows = sc.nextInt();
        diamond(rows);

        sc.close();
    }
}