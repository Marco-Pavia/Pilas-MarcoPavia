// Marco Antonio Pavia Flores
// LanzadorPilaSimple.java

/**
 * Clase principal que prueba la pila estática (arreglo de capacidad 5).
 */
public class LanzadorPilaSimple {
    public static void main(String[] args) {
        PilaSimple p = new PilaSimple();

        System.out.println("=== PILA ESTÁTICA (capacidad 5) ===");
        System.out.println("¿Vacía? " + p.isEmpty());

        System.out.println("\n--- PUSH ---");
        p.push(10);
        p.push(20);
        p.push(30);
        p.push(40);
        p.push(50);
        System.out.println("¿Llena? " + p.isFull());
        p.push(60); // Desbordamiento: la pila ya está llena
        p.mostrar();

        System.out.println("\n--- PEEK ---");
        System.out.println("Elemento en el tope: " + p.peek());
        p.mostrar(); // Sigue igual: peek no elimina nada

        System.out.println("\n--- POP ---");
        p.pop(); // Saca el 50
        p.pop(); // Saca el 40
        p.mostrar();
        System.out.println("¿Llena? " + p.isFull());

        System.out.println("\n--- VACIAR LA PILA ---");
        p.pop();
        p.pop();
        p.pop();
        System.out.println("¿Vacía? " + p.isEmpty());
        p.pop(); // Subdesbordamiento: la pila ya está vacía
        p.peek();
    }
}