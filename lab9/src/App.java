public class App {
    public static void main(String[] args) throws Exception {
        GravarCSV.gravarArquivoCSV("dados.csv");
        System.out.println("Arquivo CSV criado com sucesso!");
        LerCSV.lerArquivoCSV("dados.csv");
        System.out.println("Arquivo CSV lido com sucesso!");
        BuscarCSV.buscarPorNome("Maria", "dados.csv");
        InserirDadosCSV.inserirNovoRegistro("dados.csv");
    }

}
