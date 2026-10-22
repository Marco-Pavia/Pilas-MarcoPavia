# Pilas Estáticas y Dinámicas en Java

Implementación de la estructura de datos **pila** (principio **LIFO**: *Last In, First Out*) de dos formas:

- **Pila estática** (`PilaSimple`): basada en un arreglo de tamaño fijo.
- **Pila dinámica** (`PilaDinamica`): basada en nodos enlazados.

**Autor:** Marco Antonio Pavia Flores.
**Materia:** AED-1026 Estructura de Datos — Unidad 3
**Institución:** Instituto Tecnológico Superior de Xalapa

## Lenguaje de programación

**Java** (JDK 17 o superior recomendado).

## Estructura del proyecto

| Archivo | Descripción |
|---|---|
| `PilaSimple.java` | Pila estática (arreglo de capacidad 5): `push`, `pop`, `mostrar`, `isEmpty`, `isFull`, `peek`. |
| `Nodo.java` | Elemento de la pila dinámica: un dato y la referencia al nodo siguiente. |
| `PilaDinamica.java` | Pila dinámica (nodos enlazados): `push`, `pop`, `mostrar`, `isEmpty`, `peek`. |
| `LanzadorPilaSimple.java` | Clase principal que prueba la pila estática. |
| `LanzadorPilaDinamica.java` | Clase principal que prueba la pila dinámica. |

## Almacenamiento estático vs. dinámico

| Aspecto | Pila estática | Pila dinámica |
|---|---|---|
| Almacenamiento | Arreglo: posiciones **contiguas** en memoria | Nodos enlazados: posiciones **dispersas**, unidas por referencias |
| Capacidad | Fija (se define al crearla) | Sin límite fijo; depende de la RAM disponible |
| Desbordamiento | Posible; se controla con `isFull()` | No aplica; por eso **no** usa `isFull()` |
| Memoria | Reserva toda la capacidad desde el inicio | Solo la de los nodos existentes (más una referencia por nodo) |
| Tope | Índice entero `tope` (`-1` = vacía) | Referencia `cima` (`null` = vacía) |
| `push` / `pop` / `peek` | O(1) | O(1) |

## Métodos de consulta y validación

- `isEmpty()`: estática → `tope == -1`; dinámica → `cima == null`.
- `isFull()` (solo estática): `tope == datos.length - 1`.
- `peek()`: devuelve el elemento del tope/cima **sin eliminarlo**. Si la pila está vacía imprime un aviso y devuelve `-1`, por lo que conviene llamar antes a `isEmpty()`.

## Cómo compilar y ejecutar

### Desde la terminal

1. Clona el repositorio (o descarga los archivos en una misma carpeta):
   ```bash
   git clone https://github.com/Marco-Pavia/Pilas-MarcoPavia.git
   cd Pilas-MarcoPavia
   ```
2. Compila todos los archivos:
   ```bash
   javac *.java
   ```
3. Ejecuta la pila estática:
   ```bash
   java LanzadorPilaSimple
   ```
4. Ejecuta la pila dinámica:
   ```bash
   java LanzadorPilaDinamica
   ```

### Desde IntelliJ IDEA

1. Abre la carpeta del proyecto con *File → Open*.
2. Abre `LanzadorPilaSimple.java` o `LanzadorPilaDinamica.java`.
3. Presiona el botón verde ▶ junto al método `main`.

## Ejemplo de ejecución

### Pila estática (`java LanzadorPilaSimple`)

```
=== PILA ESTÁTICA (capacidad 5) ===
¿Vacía? true

--- PUSH ---
Metiste: 10
Metiste: 20
Metiste: 30
Metiste: 40
Metiste: 50
¿Llena? true
¡Pila llena! No se pudo insertar: 60
Pila Estática (Fondo -> Tope): 10 20 30 40 50 

--- PEEK ---
Elemento en el tope: 50
Pila Estática (Fondo -> Tope): 10 20 30 40 50 

--- POP ---
Sacaste: 50
Sacaste: 40
Pila Estática (Fondo -> Tope): 10 20 30 
¿Llena? false

--- VACIAR LA PILA ---
Sacaste: 30
Sacaste: 20
Sacaste: 10
¿Vacía? true
¡Pila vacia!
¡Pila vacia! No hay elemento en el tope.
```

### Pila dinámica (`java LanzadorPilaDinamica`)

```
=== PILA DINÁMICA ===
¿Vacía? true

--- PUSH ---
Metiste: 10
Metiste: 20
Metiste: 30
Metiste: 40
Metiste: 50
Metiste: 60
Pila Dinámica (Cima -> Fondo): 60 50 40 30 20 10 

--- PEEK ---
Elemento en la cima: 60
Pila Dinámica (Cima -> Fondo): 60 50 40 30 20 10 

--- POP ---
Sacaste de la pila: 60
Sacaste de la pila: 50
Pila Dinámica (Cima -> Fondo): 40 30 20 10 

--- VACIAR LA PILA ---
Sacaste de la pila: 40
Sacaste de la pila: 30
Sacaste de la pila: 20
Sacaste de la pila: 10
¿Vacía? true
¡Pila dinámica vacía!
¡Pila dinámica vacía! No hay elemento en la cima.
```

> Nota: `mostrar()` de la pila estática imprime del fondo al tope (`10 20 30`), mientras que el de la pila dinámica imprime de la cima al fondo (`30 20 10`). Es el mismo contenido LIFO impreso en sentido contrario.
