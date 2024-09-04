import java.util.LinkedList;

public class TabelaHash {
    private LinkedList<Palavra>[] tabela;

    public TabelaHash() {
        tabela = new LinkedList[26]; // 26 letras do alfabeto
        for (int i = 0; i < 26; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int hash(String palavra) {
        char primeiraLetra = palavra.toLowerCase().charAt(0);
        if (primeiraLetra >= 'a' && primeiraLetra <= 'z') {
            return primeiraLetra - 'a';
        } else {
            // Retorna um índice padrão (por exemplo, 0) se a letra inicial não for uma letra válida
            return 0;
        }
    }

    public void adicionarPalavra(String palavra, int linha) {
        int index = hash(palavra);
        LinkedList<Palavra> lista = tabela[index];
        for (Palavra p : lista) {
            if (p.getPalavra().equals(palavra)) {
                p.adicionarOcorrencia(linha);
                return;
            }
        }
        Palavra novaPalavra = new Palavra(palavra);
        novaPalavra.adicionarOcorrencia(linha);
        lista.add(novaPalavra);
    }

    public Palavra buscarPalavra(String palavra) {
        int index = hash(palavra);
        LinkedList<Palavra> lista = tabela[index];
        for (Palavra p : lista) {
            if (p.getPalavra().equals(palavra)) {
                return p;
            }
        }
        return null;
    }
}
