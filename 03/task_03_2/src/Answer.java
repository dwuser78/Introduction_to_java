import java.util.Arrays;
import java.util.ArrayList;

public class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer num : arr)
            if (num % 2 != 0)
                result.add(num);

        System.out.println(result);
    }
}