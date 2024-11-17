import builders.PizzaBuilder;
import entidades.Pizza;

public class TestePizza {
    public static void main(String[] args) {
        buildPizza();
    }

    public static void buildPizza() {
        Pizza melhorSaborDePizza = new PizzaBuilder()
                .setMassa("Tradicional")
                .setTamanho("P")
                .setIngredientes("Atum")
                .build();

        Pizza pizzaFrango = new PizzaBuilder()
                .setMassa("Tradicional")
                .setTamanho("M")
                .setIngredientes("Frango")
                .build();

        System.out.println(melhorSaborDePizza.toString());
        System.out.println(pizzaFrango.toString());
    }
}