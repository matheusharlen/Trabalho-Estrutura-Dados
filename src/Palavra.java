import java.util.LinkedList;

public class Palavra {
    private String palavra;
    private LinkedList<Integer> ocorrencias;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.ocorrencias = new LinkedList<>();
    }

    public String getPalavra() {
        return palavra;
    }

    public LinkedList<Integer> getOcorrencias() {
        return ocorrencias;
    }

    public void adicionarOcorrencia(int linha) {
        ocorrencias.add(linha);
    }

    @Override
    public String toString() {
        return palavra + " " + ocorrencias.toString();
    }
}
