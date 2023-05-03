package builder;

public class Burger {
    private final String components;

    public Burger(String components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Hampurilainen {" +
                "taytteet='" + components + '\'' +
                '}';
    }
}