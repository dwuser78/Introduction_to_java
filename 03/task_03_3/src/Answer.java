import java.util.Arrays;

public class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        quickSort(arr, 0, arr.length - 1);

        int avg = 0;

        for (Integer value : arr) {
            avg += value;
        }

        avg /= arr.length;

        System.out.println(Arrays.toString(arr));
        System.out.printf("Minimum is %d\n", arr[0]);
        System.out.printf("Maximum is %d\n", arr[arr.length - 1]);
        System.out.printf("Average is %d\n", avg);
    }

    private static void quickSort(Integer[] array, int begin, int end) {
        if (array.length == 0)
            return;

        if (begin >= end)
            return;

        int mid = begin + (end - begin) / 2;
        int pivot = array[mid];

        int i = begin, j = end;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (begin < j)
            quickSort(array, begin, j);

        if (end > i)
            quickSort(array, i, end);
    }
}