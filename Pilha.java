public class Pilha {
    private No topo;

    public void insere(String valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
    }

    public String remove() {
        if (topo == null) {
            System.out.println("Pilha vazia");
            return null;
        } else {
            String valorRemovido = topo.valor;
            System.out.println("Removido: " + valorRemovido);
            topo = topo.proximo;
            return valorRemovido;
        }
    }

    public void imprime() {
        if (topo == null) {
            System.out.println("Pilha vazia");
            return;
        }
        System.out.print("Pilha: ");
        No atual = topo;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
