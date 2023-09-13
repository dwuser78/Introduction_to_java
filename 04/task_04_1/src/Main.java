import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");

        LLTasks answer = new LLTasks();
        System.out.println("Original: " + ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println("Reversed: " + reversedList);
    }
}