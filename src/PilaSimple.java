// Marco Antonio Pavia Flores
// PilaSimple.java

/**
 * Pila estática: implementada con un arreglo de tamaño fijo (memoria contigua).
 * Sigue el principio LIFO (Last In, First Out): el último en entrar es el primero en salir.
 */
public class PilaSimple {
    int[] datos = new int[5]; // Capacidad fija de 5
    int tope = -1;            // Índice del último elemento; -1 significa pila vacía

    // 1. Meter dato (Push) controlando desbordamiento (overflow)
    void push(int x) {
        if (!isFull()) {
            tope++;
            datos[tope] = x;
            System.out.println("Metiste: " + x);
        } else {
            System.out.println("¡Pila llena! No se pudo insertar: " + x);
        }
    }

    // 2. Sacar dato (Pop) controlando subdesbordamiento (underflow)
    void pop() {
        if (!isEmpty()) {
            System.out.println("Sacaste: " + datos[tope]);
            tope--; // Basta con bajar el tope; el valor viejo queda como "basura" ignorada
        } else {
            System.out.println("¡Pila vacia!");
        }
    }

    // 3. Verifica si la pila está vacía
    boolean isEmpty() {
        return tope == -1;
    }

    // 4. Verifica si el arreglo alcanzó su límite (exclusivo de la pila estática)
    boolean isFull() {
        return tope == datos.length - 1;
    }

    // 5. Consulta el elemento del tope SIN eliminarlo (el tope no se mueve).
    //    Si la pila está vacía devuelve -1; conviene llamar antes a isEmpty().
    int peek() {
        if (!isEmpty()) {
            return datos[tope];
        }
        System.out.println("¡Pila vacia! No hay elemento en el tope.");
        return -1;
    }

    // 6. Ver la pila (del fondo hacia el tope)
    void mostrar() {
        System.out.print("Pila Estática (Fondo -> Tope): ");
        for (int i = 0; i <= tope; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
}