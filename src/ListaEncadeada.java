public class ListaEncadeada {
    private No primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public void adicionar(Object valor) {  // Adiciona um objeto, que pode ser `int` ou `Palavra`
        No novoNo = new No(valor);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    public No getPrimeiro() {
        return primeiro;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        No atual = primeiro;
        while (atual != null) {
            resultado.append(atual.getValor().toString());
            if (atual.getProximo() != null) {
                resultado.append(", ");
            }
            atual = atual.getProximo();
        }
        return "[" + resultado.toString() + "]";
    }
}
