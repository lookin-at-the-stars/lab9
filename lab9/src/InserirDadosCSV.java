import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InserirDadosCSV {
    public static void inserirNovoRegistro(String nomeArquivo) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        String idade = scanner.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();

        try (FileWriter writer = new FileWriter(nomeArquivo, true)) {
            writer.write(nome + "," + idade + "," + cidade + "\n");
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar os dados: " + e.getMessage());
        }
    }
}