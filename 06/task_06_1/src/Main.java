import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static Integer[] show_filter_menu() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1 - Model");
        System.out.println("2 - RAM capacity");
        System.out.println("3 - Model CPU");
        System.out.println("4 - HDD capacity");
        System.out.println("5 - Operating system");
        System.out.println("6 - Color");

        System.out.print("Specify the selection criteria (separated by " +
                           "commas or spaces): ");
        String param_str = reader.readLine();

        String[] param_str_arr = param_str.split("[,\\s]+");
        Integer[] param_num = new Integer[param_str_arr.length];

        for (int i = 0; i < param_str_arr.length; i++) {
            param_num[i] = Integer.parseInt(param_str_arr[i]);
        }

        return param_num;
    }

    public static Stream<Laptop> apply_filter(ArrayList<Laptop> laptops,
                                          Integer[] params) throws IOException {
        Stream<Laptop> res = laptops.stream();
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        for (Integer param: params) {
            switch (param) {
                case (1):
                    System.out.print("Enter the model name: ");
                    final String param_val_1 = reader.readLine();
                    res = res.filter(entry -> Objects.equals(entry.get_model(),
                                                             param_val_1));
                    break;
                case (2):
                    System.out.print("Enter the minimum RAM capacity value: ");
                    final String param_val_2 = reader.readLine();
                    res = res.filter(entry -> entry.get_ram() >=
                                              Integer.parseInt(param_val_2));
                    break;
                case (3):
                    System.out.print("Enter the model CPU: ");
                    final String param_val_3 = reader.readLine();
                    res = res.filter(entry -> Objects.equals(entry.get_cpu(),
                                                             param_val_3));
                    break;
                case (4):
                    System.out.print("Enter the minimum HDD capacity value: ");
                    final String param_val_4 = reader.readLine();
                    res = res.filter(entry -> entry.get_hdd() >=
                                              Integer.parseInt(param_val_4));
                    break;
                case (5):
                    System.out.print("Enter the operating system: ");
                    final String param_val_5 = reader.readLine();
                    res = res.filter(entry -> Objects.equals(entry.get_os(),
                                                             param_val_5));
                    break;
                case (6):
                    System.out.print("Enter the color: ");
                    final String param_val_6 = reader.readLine();
                    res = res.filter(entry -> Objects.equals(entry.get_color(),
                                                             param_val_6));
                    break;
                default:
                    break;
            }
        }

        return res;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Laptop> laptops = new ArrayList<>();

        laptops.add(new Laptop("Acer Aspire 1 A115-22-R2DZ", 4,
                          "AMD Athlon Silver 3050U", 128,
                           "Linux", "black"));
        laptops.add(new Laptop("ASUS ExpertBook B1502CGA", 4,
                          "Intel Processor N100", 128,
                           "Windows 11", "black"));
        laptops.add(new Laptop("HP Laptop 15s-eq1428ur", 8,
                          "AMD Ryzen 3 3250U", 256, "Linux",
                         "gray"));
        laptops.add(new Laptop("Dell Latitude 3510", 16,
                          "Intel Core i5-10210U", 256,
                           "Linux", "black"));

        Integer[] user_filter = show_filter_menu();
        Stream<Laptop> filtred_data = apply_filter(laptops, user_filter);
        Set<Laptop> filtred_laptops = filtred_data.collect(Collectors.toSet());

        System.out.println("Corresponding to the specified condition of " +
                           "the model:");

        for (Laptop filtred_laptop: filtred_laptops) {
            System.out.println(filtred_laptop.get_model());
        }
    }
}