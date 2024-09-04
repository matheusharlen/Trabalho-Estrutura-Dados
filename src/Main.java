import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash();

        // Leitura do texto e tratamento das palavras
        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {
            String linha;
            int numeroLinha = 1;
            while ((linha = br.readLine()) != null) {
                // Inclui palavras com hífen como uma única palavra
                String[] palavras = linha.split("[\\W&&[^-]]+"); // Mantém hífens nas palavras
                for (String palavra : palavras) {
                    if (!palavra.isEmpty()) {
                        tabelaHash.adicionarPalavra(palavra, numeroLinha);
                    }
                }
                numeroLinha++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> saidas = new ArrayList<>();

        // Geração do índice remissivo e coleta dos resultados
        try (BufferedReader br = new BufferedReader(new FileReader("palavras-chave.txt"))) {
            String palavraChave;
            while ((palavraChave = br.readLine()) != null) {
                Palavra resultado = tabelaHash.buscarPalavra(palavraChave);
                if (resultado != null) {
                    String saida = resultado.toString();
                    saidas.add(saida);
                } else {
                    String saida = palavraChave + " não encontrada.";
                    saidas.add(saida);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ordenação alfabética dos resultados
        Collections.sort(saidas);

        // Imprimindo no console em ordem alfabética
        for (String saida : saidas) {
            System.out.println(saida);
        }

        // Escrita do índice remissivo no arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("indice_remissivo.txt"))) {
            for (String saida : saidas) {
                bw.write(saida);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
