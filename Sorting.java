import java.util.Arrays;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        // int[] arr = {5, 2, 9, 1, 5, 6};
        // bubbleSort(arr);
        // System.out.print("[ ");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        // System.out.print("]");

        // int[] arr = {5, 2, 3, 1, 4, 6};
        // selectionSort(arr);

        // int[] arr = {5, 2, 3, 1, 4, 6};
        // insertionSort(arr);

        int[] arr = {5, -2, -3, 1, 4, -6, 8, 7, -9, 0};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        // countingSort(arr);
    }
}