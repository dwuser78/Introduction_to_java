import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 6, 2, 3, 4};
        int[] b;

        MergeSort ms = new MergeSort();
        b = ms.mergeSort(a);

        System.out.println(Arrays.toString(b));
        }
}