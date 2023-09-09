import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{9, 4, 8, 3, 1};

        BubbleSort ans = new BubbleSort();
        try {
            ans.sort(arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}