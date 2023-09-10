import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Answer ans = new Answer();

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        ans.removeEvenNumbers(arr);

        arr = new Integer[]{2, 4, 6, 8};
        ans.removeEvenNumbers(arr);
    }
}