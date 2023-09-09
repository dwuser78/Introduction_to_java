public class Main {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}