import java.util.Scanner;

public class Matrices {
    public static boolean search (int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("The key found at (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("The key not found");
        return false;
    }
    public static void spiralPrint(int arr[][]) {
        int startRow = 0; int startCol = 0;
        int endRow = arr.length - 1; int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {      //top
                System.out.print(arr[startRow][j] + " ");
            }
    
            for (int i = startRow + 1; i <= endRow; i++) {      //right
                System.out.print(arr[i][endCol] + " ");
            }
    
            for (int j = endCol - 1; j >= startCol; j--) {      //bottom
                if (startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
    
            for (int i = endRow - 1; i >= startRow + 1; i--) {      //left
                if (startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }
    
            startRow++; startCol++;
            endRow--; endCol--;
        }
        
    }
    public static int diagonalSum(int arr[][]) {
        // Time Complexity: O(n^2)
        // int n = arr.length; int m = arr[0].length;
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {       // Primary Diagonal Sum
        //         if (i == j) {
        //             sum += arr[i][j];
        //         }
        //         else if ((i + j) == (n - 1) && i != j) {       // Secondary Diagonal Sum
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        // Time Complexity: O(n)
        int sum = 0; int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Primary Diagonal
            sum += arr[i][i];
            // Secondary Diagonal
            int j = n - 1 - i;
            sum += (i != j) ? arr[i][j] : 0;
        }
        return sum;
    }
    public static boolean stairCaseSearch(int arr[][], int key) {
        int row = 0; int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println("Key Founded at: (" + row + ", " + col + ")." );
                return true;
            } else if (key < arr[row][col]) {
                col--;
            } else if (key > arr[row][col]) {
                row++;
            }
        }
        System.out.println("KEY NOT FOUND!");
        return false;
    }
    public static void transpose (int arr[][]) {
        int rows = arr.length;
        int cols = arr[0]. length;

        int transpose[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print Transpose Array
        for (int[] row : transpose) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int matrix[][] = new int[3][3];
        // int n = matrix.length;      //row length
        // int m = matrix[0].length;       //column length

        // for (int i = 0; i < n; i++) {       //Taking Input values
        //     for (int j = 0; j < m; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // for (int i = 0; i < n; i++) {       //Output values
        //     for (int j = 0; j < m; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter the key: ");
        // int key = sc.nextInt();
        // search(matrix, key);

        // int arr[][] = { {1, 2, 3},{4, 5, 6},{7, 8, 9},{10, 11, 12} };        //4X3
        // int arr[][] = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} };     //3X5
        // int arr[][] = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };     //4X4
        // spiralPrint(arr);

        // int arr[][] = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };     //4X4
        // int arr[][] = { {1, 2, 3},{4, 5, 6},{7, 8, 9} };        //3X3 for removing common no.
        // System.out.println("The sum of diagonal elements of the matrix is: " + diagonalSum(arr));

        // int arr[][] = { {10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50} };
        // int key = 32;
        // stairCaseSearch(arr, key);

        int arr[][] = { {10, 20, 30, 40}, {15, 25, 35, 45} };
        transpose(arr);

        sc.close();
    }
}