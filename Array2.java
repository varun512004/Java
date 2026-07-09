public class Array2 {
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
        // int arr[] = {2, -4, 6, -8, 10};
        // subArrays(arr); // Sub Arrays, Max & min subArr Sum, prefix sum (for better time complexity)

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Sub Array Sum: " + kadanesAlgo(arr));
    }
}
