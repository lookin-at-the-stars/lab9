import java.io.FileWriter;
import java.io.IOException;

public class GravarCSV {
    public static void gravarArquivoCSV(String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("Nome,Idade,Cidade\n");
            writer.write("João,20,São Paulo\n");
            writer.write("Maria,25,Rio de Janeiro\n");
            writer.write("Pedro,30,Belo Horizonte\n");
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }
}