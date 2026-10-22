// Marco Antonio Pavia Flores
// LanzadorPilaDinamica.java

/**
 * Clase principal que prueba la pila dinámica (nodos enlazados).
 */
public class LanzadorPilaDinamica {
    public static void main(String[] args) {
        // 1. Creamos nuestra pila vacía usando el constructor
        PilaDinamica miPila = new PilaDinamica();

        System.out.println("=== PILA DINÁMICA ===");
        System.out.println("¿Vacía? " + miPila.isEmpty());

        System.out.println("\n--- PUSH ---");
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);
        miPila.push(40);
        miPila.push(50);
        miPila.push(60); // Sin límite fijo: no hay desbordamiento
        miPila.mostrar(); // Debe mostrar: 60 50 40 30 20 10 (la cima es el último en entrar)

        System.out.println("\n--- PEEK ---");
        System.out.println("Elemento en la cima: " + miPila.peek());
        miPila.mostrar(); // Sigue igual: peek no elimina nada

        System.out.println("\n--- POP ---");
        miPila.pop(); // Saca el 60
        miPila.pop(); // Saca el 50
        miPila.mostrar();

        System.out.println("\n--- VACIAR LA PILA ---");
        miPila.pop();
        miPila.pop();
        miPila.pop();
        miPila.pop();
        System.out.println("¿Vacía? " + miPila.isEmpty());
        miPila.pop(); // Subdesbordamiento: la pila ya está vacía
        miPila.peek();
    }
}