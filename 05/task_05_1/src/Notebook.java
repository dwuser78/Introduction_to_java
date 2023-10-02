import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Notebook {
    private HashMap<String, ArrayList<Integer>> people;
    public Notebook() {
        this.people = new HashMap<>();
    }

    public void add_entry(String name, Integer phone) {
        ArrayList<Integer> value;

        if (!this.people.containsKey(name)) {
            this.people.put(name, new ArrayList<>());
        }

        value = this.people.get(name);

        if (!value.contains(phone)) {
            value.add(phone);
        }
    }

    public ArrayList<String> get_unsorted_names() {
        return new ArrayList<>(this.people.keySet());
    }

    public ArrayList<Integer> get_phones(String name) {
        if (this.people.containsKey(name)) {
            return this.people.get(name);
        }

        return null;
    }

    public boolean del_entry(String name) {
        if (this.people.containsKey(name)) {
            this.people.remove(name);
            return true;
        }

        return false;
    }

    public ArrayList<String> get_sorted_names() {
        ArrayList<String> res = new ArrayList<>();

        this.people.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(new SortByValSize()))
                .forEach(entry -> res.add(entry.getKey()));

        return res;
    }
}
