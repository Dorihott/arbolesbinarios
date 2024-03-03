public class Nodo {
    int valor;
    Nodo derecha;
    Nodo izquierda;


    public void inorden(Nodo n) {
        if (n == null) {
            return;
        }
        this.inorden(n.izquierda);
        System.out.println(n.valor);
        this.inorden(n.derecha);
    }
}


