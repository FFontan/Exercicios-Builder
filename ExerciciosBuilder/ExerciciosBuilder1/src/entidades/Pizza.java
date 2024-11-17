package entidades;

public class Pizza {
    private String massa = "";
    private String tamanho = "";
    private String ingredientes = "";

    public Pizza() {

    }

    public Pizza(String massa, String tamanho, String ingredientes) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.ingredientes = ingredientes;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Massa: " + this.massa + " " +
                " Tamanho: " + this.tamanho + " " +
                " Ingredientes: " + this.ingredientes;
    }
}