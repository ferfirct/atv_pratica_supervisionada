public class Merge {
    public static Fila mergeFilas(Fila a, Fila b) {
        Fila c = new Fila();

        while (!a.vazia() && !b.vazia()) {
            int valorA = Integer.parseInt(a.primeiro());
            int valorB = Integer.parseInt(b.primeiro());

            if (valorA <= valorB) {
                c.insere(a.remove());
            } else {
                c.insere(b.remove());
            }
        }

        while (!a.vazia()) {
            c.insere(a.remove());
        }

        while (!b.vazia()) {
            c.insere(b.remove());
        }

        return c;
    }
}
