public class No {
    private Object valor;  // Pode armazenar qualquer tipo de valor (int, Palavra, etc.)
    private No proximo;

    public No(Object valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Object getValor() {
        return valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
