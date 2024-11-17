import builders.RelatorioBuilder;
import entidades.Relatorio;

public class TesteRelatorio {
    public static void main(String[] args) {
        buildRelatorio();
    }

    public static void buildRelatorio() {
        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Titulo Muito Legal")
                .setCorpo("Conteudo relevante")
                .build();

        Relatorio relatorioCompleto = new RelatorioBuilder()
                .setTitulo("Titulo Muito Legal Denovo")
                .setCorpo("Conteudo muito relevante")
                .setRodape("Adiós")
                .build();

        System.out.println(relatorio.toString());
        System.out.println(relatorioCompleto.toString());
    }
}