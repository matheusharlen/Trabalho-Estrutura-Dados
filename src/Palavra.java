public class Palavra {
    private String texto;
    private ListaEncadeada ocorrencias;

    public Palavra(String texto) {
        this.texto = texto;
        this.ocorrencias = new ListaEncadeada();
    }

    public String getTexto() {
        return texto;
    }

    public ListaEncadeada getOcorrencias() {
        return ocorrencias;
    }

    public void adicionarOcorrencia(int linha) {
        ocorrencias.adicionar(linha);  // Adiciona um `int` à lista de ocorrências
    }

    @Override
    public String toString() {
        return texto + " " + ocorrencias.toString();
    }
}
