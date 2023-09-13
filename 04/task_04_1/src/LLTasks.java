import java.util.LinkedList;

public class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> r_ll = new LinkedList<>();

        for (Object val : ll) {
            r_ll.addFirst(val);
        }

        return r_ll;
    }
}
