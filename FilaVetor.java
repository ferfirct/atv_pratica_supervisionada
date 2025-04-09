public class FilaVetor {
    private String[] vetor;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaVetor(int capacidade) {
        vetor = new String[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void insere(String valor) {
        if (tamanho == vetor.length) {
            System.out.println("Fila cheia");
            return;
        }
        vetor[fim] = valor;
        fim = (fim + 1) % vetor.length;
        tamanho++;
    }

    public String remove() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return null;
        }
        String removido = vetor[inicio];
        System.out.println("Removido: " + removido);
        inicio = (inicio + 1) % vetor.length;
        tamanho--;
        return removido;
    }

    public String primeiro() {
        if (tamanho == 0) return null;
        return vetor[inicio];
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public void imprime() {
        if (tamanho == 0) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % vetor.length;
            System.out.print(vetor[index] + " ");
        }
        System.out.println();
    }
}
