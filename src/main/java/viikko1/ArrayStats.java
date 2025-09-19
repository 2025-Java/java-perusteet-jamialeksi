package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }

        long sum = 0; 
        for (int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxValue = arr[0];
        for (int n : arr) {
            if (n > maxValue) {
                maxValue = n;
            }
        }
        return maxValue;
    }
}
