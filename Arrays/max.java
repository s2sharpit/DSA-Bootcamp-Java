package arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxRange(arr, 1, 3));
        System.out.println(maxValue(arr));
    }

    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (end > start || arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++)
            if (arr[i] > maxVal)
                maxVal = arr[i];

        return maxVal;
    }

    static int maxValue(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > maxVal)
                maxVal = arr[i];

        return maxVal;
    }
}
