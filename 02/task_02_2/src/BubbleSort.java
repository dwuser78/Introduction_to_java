import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;
    public static void sort(int[] mas) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        log = new File("log.txt");
        try {
            fileWriter = new FileWriter(log, false);

            boolean ready = false;
            int tmp;

            while(!ready) {
                ready = true;

                for (int i = 0; i < mas.length - 1; i++) {
                    if(mas[i] > mas[i + 1]){
                        ready = false;
                        tmp = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = tmp;
                    }
                }
                fileWriter.write(dtf.format(LocalDateTime.now()) + " "
                        + Arrays.toString(mas) + "\n");
            }

            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}