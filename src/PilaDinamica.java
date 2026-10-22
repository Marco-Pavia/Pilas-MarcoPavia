// Marco Antonio Pavia Flores
// Nodo.java

/**
 * Pila dinámica: implementada con nodos enlazados (memoria dispersa).
 * Sigue el principio LIFO. No tiene límite fijo: crece mientras haya memoria RAM,
 * por eso NO necesita isFull().
 */
public class PilaDinamica {
    Nodo cima; // El "control remoto" que apunta al elemento de hasta arriba

    // Constructor de la pila
    public PilaDinamica() {
        this.cima = null; // Arranca vacía
    }

    // Método PUSH (meter elemento arriba)
    void push(int x) {
        Nodo nuevo = new Nodo(x); // 1. Creamos el nuevo nodo
        nuevo.siguiente = cima;   // 2. El nuevo atrapa al viejo de la cima
        cima = nuevo;             // 3. Actualizamos la cima: el nuevo se vuelve la cima
        System.out.println("Metiste: " + x);
    }

    // Método POP (sacar el elemento de arriba) controlando subdesbordamiento
    void pop() {
        if (!isEmpty()) {
            System.out.println("Sacaste de la pila: " + cima.dato);
            cima = cima.siguiente; // La cima se baja al siguiente nodo
        } else {
            System.out.println("¡Pila dinámica vacía!");
        }
    }

    // Verifica si la cima no contiene nodos
    boolean isEmpty() {
        return cima == null;
    }

    // Consulta el valor de la cima SIN desvincular el nodo.
    // Si la pila está vacía devuelve -1; conviene llamar antes a isEmpty().
    int peek() {
        if (!isEmpty()) {
            return cima.dato;
        }
        System.out.println("¡Pila dinámica vacía! No hay elemento en la cima.");
        return -1;
    }

    // Método MOSTRAR (recorriendo con el explorador)
    void mostrar() {
        Nodo actual = cima; // Nuestro explorador arranca en la cima
        System.out.print("Pila Dinámica (Cima -> Fondo): ");

        while (actual != null) { // Mientras no lleguemos al fondo (null)
            System.out.print(actual.dato + " ");
            actual = actual.siguiente; // Saltamos al siguiente nodo
        }
        System.out.println(); // Salto de línea
    }
}