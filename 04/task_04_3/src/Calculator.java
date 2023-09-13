import java.util.LinkedList;

public class Calculator {
    LinkedList<Integer> queue;

    public Calculator() {
        this.queue = new LinkedList<>();
    }
    public int calculate(char op, int a, int b) {
        int result;

        switch (op) {
            case ('+'):
                result = a + b;
                this.queue.addLast(result);
                return result;
            case ('-'):
                result = a - b;
                this.queue.addLast(result);
                return result;
            case ('*'):
                result = a * b;
                this.queue.addLast(result);
                return result;
            case ('/'):
                result = a / b;
                this.queue.addLast(result);
                return result;
            case ('<'):
                this.queue.removeLast();
                return this.queue.getLast();
            default:
                System.out.printf("Некорректный оператор: '%c'\n", op);
                System.exit(1);
        }

        return 0;
    }
}
