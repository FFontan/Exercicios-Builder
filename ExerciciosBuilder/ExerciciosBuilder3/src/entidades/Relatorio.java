package entidades;

public class Relatorio {
    private String titulo = "";
    private String corpo = "";
    private String rodape = "Assinado by chatGpt";

    public Relatorio() {

    }

    public Relatorio(String titulo, String corpo) {
        this.titulo = titulo;
        this.corpo = corpo;
    }

    public Relatorio(String titulo, String corpo, String rodape) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.rodape = rodape;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public String toString() {
        return this.titulo + "\n\n" +
                this.corpo + "\n\n" +
                this.rodape +
                "\n--------------------------";
    }
}