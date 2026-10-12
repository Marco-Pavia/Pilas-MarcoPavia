public class PilaSimple {
    int[] datos = new int[5];
    int tope = -1;

    void push (int x) {
        if(tope < datos.length -1 ) {
            tope ++;
            datos[tope] = x;
            System.out.println("Metiste: " + x);

        }   else {
            System.out.println("La pila está llena!");
        }
    }

    void pop (){
        if (tope >= 0) {
            System.out.println("Sacaste: " + datos[tope]);
            tope --;
        }   else {
            System.out.println("La pila está vacia");
        }
    }

    void mostrar (){
        System.out.println("Pila actual: ");
        for (int i=0; i <= tope; i++){
            System.out.println(datos[i] + " ");
        }
        System.out.println  ();
    }

}
