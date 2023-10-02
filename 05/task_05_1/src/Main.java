public class Main {
    public static void main(String[] args) {
        Notebook mynotebook = new Notebook();
        mynotebook.add_entry("Ivan Ivanov", 123);
        mynotebook.add_entry("Sergey Sergeev", 456);
        mynotebook.add_entry("Sergey Sergeev", 321);
        mynotebook.add_entry("Aleksey Alekseev", 789);

        System.out.println("Unsorted output: ");
        for (String names: mynotebook.get_unsorted_names()) {
            System.out.println("Name: " + names);
            System.out.print("Phones: ");
            for (Integer phones: mynotebook.get_phones(names)) {
                System.out.print(phones);
                if (mynotebook.get_phones(names).indexOf(phones) <
                        (mynotebook.get_phones(names).size() - 1)) {
                    System.out.print(", ");
                } else {
                    System.out.println("\n---------");
                }
            }
        }
        System.out.println();

        System.out.println("Sorted output: ");
        for (String names: mynotebook.get_sorted_names()) {
            System.out.println("Name: " + names);
            System.out.print("Phones: ");
            for (Integer phones: mynotebook.get_phones(names)) {
                System.out.print(phones);
                if (mynotebook.get_phones(names).indexOf(phones) <
                        (mynotebook.get_phones(names).size() - 1)) {
                    System.out.print(", ");
                } else {
                    System.out.println("\n---------");
                }
            }
        }
    }
}