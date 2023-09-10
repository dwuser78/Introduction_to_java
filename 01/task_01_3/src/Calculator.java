public class Calculator {
    public int calculate(char op, int a, int b) {
        switch (op) {
            case ('+'):
                return a + b;
            case ('*'):
                return a * b;
            case ('-'):
                return a - b;
            case ('/'):
                return a / b;
            default:
                System.out.printf("Некорректный оператор: '%c'\n", op);
                System.exit(1);
        }

        return 0;
    }
}
