public class Fila {
    private No inicio;
    private No fim;

    public void insere(String valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public String remove() {
        if (inicio == null) {
            System.out.println("Fila vazia");
            return null;
        } else {
            String valorRemovido = inicio.valor;
            System.out.println("Removido: " + valorRemovido);
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            return valorRemovido;
        }
    }

    public String primeiro() {
        return (inicio != null) ? inicio.valor : null;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public void imprime() {
        if (inicio == null) {
            System.out.println("Fila vazia");
            return;
        }
        No atual = inicio;
        System.out.print("Fila -> ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
