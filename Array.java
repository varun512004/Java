import java.util.*;

public class Array {
    public static void update (int marks[], int x) {
        x += 5;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println(x);
    }

    public static int linearSearchInt (int arr[], int key) { //For integer array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static String linearSearchStr (String fruits[], String key) { //For string array
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == key) {
                return String.valueOf(i);
            }
        }
        return "-1";
    }

    public static void findLargestAndSmallest (int arr[]) { //Linear search
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The smallest element in the array is: " + smallest);
    }

    public static int binSearch (int arr[], int key) { //Binary Search
        int start = 0; int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse (int arr[]) {
        //1. Using for loop
        // for (int i = 0; i < (arr.length - 1) / 2; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[arr.length - 1 - i];
        //     arr[arr.length - 1 - i] = temp;
        // }
        // System.out.println("The reverse array: " + Arrays.toString(arr));

        //2. Using while loop
        int start = 0; int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("The reverse array: " + Arrays.toString(arr));
    }

    public static void printPairs (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
            }
            System.out.println();
        }
        int totalPair = (arr.length * (arr.length-1))/2; //Important
        System.out.println("Total no. of pairs: " + totalPair);
    }

    public static void subArrays (int arr[]) {
        int totalSubArr = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length]; //prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i]; // 2, -2, 4, -4, 6
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;
                // for (int k = i; k <= j; k++) {
                //     System.out.print(arr[k] + " ");
                //     currentSum += arr[k];
                // }
                if (i == 0) {               //2, -2, 4, -4, 6
                    currentSum = prefix[j];
                } else {
                    currentSum = prefix[j] - prefix[i - 1];
                }
                totalSubArr++;
                // System.out.print("=> Sum is: " + currentSum);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (currentSum < minSum) {
                    minSum = currentSum;
                }
                // System.out.println();
            }
        }
        System.out.println("Total no. of Sub Arrays: " + totalSubArr);
        System.out.println("Max Sum of Sub Arrays: " + maxSum);
        System.out.println("Min Sum of Sub Arrays: " + minSum);
    }

    public static int kadanesAlgo(int arr[]) { //{-2, -3, 4, -1, -2, 1, 5, -3};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            // if (maxSum < currSum) {
            //     maxSum = currSum;
            // }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String friuts [] = {"apple", "mango"};
        // int marks[] = new int[3];
        // System.out.print("Enter marks 1: ");
        // marks[0] = sc.nextInt();
        // System.out.print("Enter marks 2: ");
        // marks[1] = sc.nextInt();        
        // System.out.print("Enter marks 3: ");
        // marks[2] = sc.nextInt();
        // marks[2] += 1;
        // System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);

        // int x = 5;
        // int marks[] = {98, 97, 99};
        // update(marks, x);
        // System.out.println(Arrays.toString(marks));
        // System.out.println(x);

        // int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        // System.out.print("Enter the key value: ");
        // int key = sc.nextInt();
        // int index = linearSearchInt(arr, key);
        // if (index != -1) {
        //     System.out.println("The index of "+ key + " is: " + index + ".");
        // } else {
        //     System.out.println(key + " is not in the array.");
        // }

        // String fruits[] = {"apple", "mango", "banana"};
        // System.out.print("Enter the key value: ");
        // String key = sc.nextLine();
        // String index = linearSearchStr(fruits, key);
        // if (index != "-1") {
        //     System.out.println(key + " is in the array");
        // } else {
        //     System.out.println(key + " is not in the array.");
        // }

        // int arr[] = {2, 4, 6, 3, 1, 7, 9, 0, 5, 8};
        // findLargestAndSmallest(arr);

        // int arr[] = {2, 5, 9, 14, 17, 21, 26, 30, 34, 39, 45, 51, 58, 64, 71, 77, 83, 90, 96, 100};
        // System.out.print("Enter the key value: ");
        // int key = sc.nextInt();
        // int index = binSearch(arr, key);
        // if (index != -1) {
        //     System.out.println(key + " is in the array at index " + index + ".");
        // } else {
        //     System.out.println(key + " is not in the array.");
        // }

        // int arr[] = {2, 5, 9, 14, 17, 21, 26, 30, 34, 39};
        // reverse(arr);

        // int arr[] = {2, 4, 6, 8, 10};
        // printPairs(arr);

        // int arr[] = {2, -4, 6, -8, 10};
        // subArrays(arr); // Sub Arrays, Max & min subArr Sum, prefix sum (for better time complexity)

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Sub Array Sum: " + kadanesAlgo(arr));

        sc.close();
    }
}