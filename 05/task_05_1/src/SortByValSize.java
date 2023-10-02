import java.util.ArrayList;
import java.util.Comparator;

public class SortByValSize implements Comparator<ArrayList<Integer>> {
    @Override
    public int compare(ArrayList<Integer> val1, ArrayList<Integer> val2) {
        if (val1.size() == val2.size()) {
            return 0;
        } else if (val1.size() < val2.size()) {
            return 1;
        }
        return -1;
    }
}
