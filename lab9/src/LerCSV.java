import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerCSV {
    public static void lerArquivoCSV(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] colunas = linha.split(",");
                System.out.println("Nome: " + colunas[0] + ", Idade: " + colunas[1] + ", Cidade: " + colunas[2]);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}