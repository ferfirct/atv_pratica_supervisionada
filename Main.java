public class Main {
    public static void main(String[] args) {

        //pilha
        System.out.println("--- PILHA ---");
        Pilha pilha = new Pilha();

        pilha.insere("Elemento 1");
        pilha.insere("Elemento 2");
        pilha.insere("Elemento 3");

        pilha.imprime();

        pilha.remove();
        pilha.imprime();

        //fila
        System.out.println("\n--- FILA ---");
        Fila filaEx2 = new Fila();

        filaEx2.insere("Elemento A");
        filaEx2.insere("Elemento B");
        filaEx2.insere("Elemento C");

        filaEx2.imprime();

        filaEx2.remove();
        filaEx2.imprime();

        //merge
        System.out.println("\n--- MERGE ---");
        Fila filaA = new Fila();
        Fila filaB = new Fila();

        filaA.insere("12");
        filaA.insere("35");
        filaA.insere("52");
        filaA.insere("64");

        filaB.insere("05");
        filaB.insere("15");
        filaB.insere("23");
        filaB.insere("55");
        filaB.insere("75");

        System.out.println("Fila A:");
        filaA.imprime();
        System.out.println("Fila B:");
        filaB.imprime();

        Fila filaC = Merge.mergeFilas(filaA, filaB);
        System.out.println("Fila C (resultado do merge):");
        filaC.imprime();

        //merge com vetor
        System.out.println("\n--- MERGE COM VETORES ---");
        FilaVetor vetorA = new FilaVetor(10);
        FilaVetor vetorB = new FilaVetor(10);

        vetorA.insere("12");
        vetorA.insere("35");
        vetorA.insere("52");
        vetorA.insere("64");

        vetorB.insere("05");
        vetorB.insere("15");
        vetorB.insere("23");
        vetorB.insere("55");
        vetorB.insere("75");

        System.out.println("Fila Vetor A:");
        vetorA.imprime();
        System.out.println("Fila Vetor B:");
        vetorB.imprime();

        FilaVetor vetorC = MergeVetor.mergeFilas(vetorA, vetorB, 20);
        System.out.println("Fila Vetor C (resultado do merge):");
        vetorC.imprime();
    }
}
