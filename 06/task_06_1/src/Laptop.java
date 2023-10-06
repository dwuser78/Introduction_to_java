public class Laptop {
    private String model;
    private Integer ram_volume;
    private String cpu;
    private Integer hdd_volume;
    private String os;
    private String color;

    public Laptop(String model, Integer ram_volume, String cpu,
                  Integer hdd_volume, String os, String color) {
        this.model = model;
        this.ram_volume = ram_volume;
        this.cpu = cpu;
        this.hdd_volume = hdd_volume;
        this.os = os;
        this.color = color;
    }

    public String get_model() {
        return this.model;
    }

    public Integer get_ram() {
        return this.ram_volume;
    }

    public String get_cpu() {
        return this.cpu;
    }

    public Integer get_hdd() {
        return this.hdd_volume;
    }

    public String get_os() {
        return this.os;
    }

    public String get_color() {
        return this.color;
    }
}
