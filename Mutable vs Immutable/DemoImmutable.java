public class DemoImmutable {
    // No Setters
    // Final and private

    public String getName() {
        return name;
    }

    private final String name;

    public DemoImmutable(final String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        DemoImmutable n = new DemoImmutable("Long");
        System.out.println(n.getName());
    }
}

