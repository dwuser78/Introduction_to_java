public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        char op = '$';
        int a = 5;
        int b = 5;

        System.out.println(calc.calculate(op, a, b));
    }
}