// Marco Antonio Pavia Flores
// Nodo.java

/**
 * Nodo de la pila dinámica: guarda un dato y una referencia
 * (la "flechita") al nodo que está debajo de él.
 */
public class Nodo {
    int dato;
    Nodo siguiente; // La flechita que apunta al de abajo; tiene que ser de la misma clase

    // Constructor del nodo
    public Nodo(int x) {
        this.dato = x;           // Para que nazca con un valor y no con basura
        this.siguiente = null;   // Al nacer, no apunta a nadie todavía
    }
}