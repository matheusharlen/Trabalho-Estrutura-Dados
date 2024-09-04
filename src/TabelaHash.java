public class TabelaHash {
    private ListaEncadeada[] tabela;

    public TabelaHash() {
        tabela = new ListaEncadeada[26]; // 26 letras do alfabeto
        for (int i = 0; i < 26; i++) {
            tabela[i] = new ListaEncadeada();
        }
    }

    private int calcularIndice(String palavra) {
        char primeiraLetra = palavra.toLowerCase().charAt(0);
        if (primeiraLetra >= 'a' && primeiraLetra <= 'z') {
            return primeiraLetra - 'a';
        } else {
            return 0;
        }
    }

    public void adicionarPalavra(String palavra, int linha) {
        int indice = calcularIndice(palavra);
        ListaEncadeada lista = tabela[indice];
        No atual = lista.getPrimeiro();
        while (atual != null) {
            Palavra p = (Palavra) atual.getValor();  // Aqui pegamos o objeto Palavra armazenado no nó
            if (p.getTexto().equals(palavra)) {
                p.adicionarOcorrencia(linha);
                return;
            }
            atual = atual.getProximo();
        }
        // Se a palavra não for encontrada, cria uma nova e adiciona à lista
        Palavra novaPalavra = new Palavra(palavra);
        novaPalavra.adicionarOcorrencia(linha);
        lista.adicionar(novaPalavra);  // Adiciona o objeto Palavra à lista
    }

    public Palavra buscarPalavra(String palavra) {
        int indice = calcularIndice(palavra);
        ListaEncadeada lista = tabela[indice];
        No atual = lista.getPrimeiro();
        while (atual != null) {
            Palavra p = (Palavra) atual.getValor();  // Aqui pegamos o objeto Palavra armazenado no nó
            if (p.getTexto().equals(palavra)) {
                return p;
            }
            atual = atual.getProximo();
        }
        return null;
    }
}
