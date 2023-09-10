import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] a) {
        int[] a1 = Arrays.copyOf(a, a.length);
        int[] a2 = new int[a.length];
        return sort(a1, a2, 0, a.length);
    }

    private static int[] sort(int[] a1, int[] a2, int begin, int end) {
        if (begin >= end - 1) {
            return a1;
        }

        int mid = begin + (end - begin) / 2;
        int[] sorted1 = sort(a1, a2, begin, mid);
        int[] sorted2 = sort(a1, a2, mid, end);

        int idx1 = begin;
        int idx2 = mid;
        int dst_idx = begin;
        int[] result = sorted1 == a1 ? a2 : a1;
        while (idx1 < mid && idx2 < end) {
            result[dst_idx++] = sorted1[idx1] < sorted2[idx2]
                                ? sorted1[idx1++] : sorted2[idx2++];
        }
        while (idx1 < mid) {
            result[dst_idx++] = sorted1[idx1++];
        }
        while (idx2 < end) {
            result[dst_idx++] = sorted2[idx2++];
        }
        return result;
    }
}
