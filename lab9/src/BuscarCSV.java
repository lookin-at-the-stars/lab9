import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BuscarCSV {
    public static void buscarPorNome(String nomeBusca, String nomeArquivo) {
        ArrayList<String[]> registros = new ArrayList<>();
        boolean encontrado = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            // Lê o cabeçalho e ignora
            reader.readLine();
            while ((linha = reader.readLine()) != null) {
                String[] colunas = linha.split(",");
                registros.add(colunas);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        for (String[] registro : registros) {
            if (registro[0].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Nome: " + registro[0] + ", Idade: " + registro[1] + ", Cidade: " + registro[2]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Pessoa não encontrada: " + nomeBusca);
        }
    }
}