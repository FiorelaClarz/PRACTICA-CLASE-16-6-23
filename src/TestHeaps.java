package eda.teo.pkg10;

// TRABAJO PRACTICO
// NOMBRES:
// FIORELA CLARIZA QUISPE QUISPE
// WILSON TURPO HUANCA

public class TestHeaps {

    public static void main(String[] args) {

        Heap<Integer> monticulo = new Heap<>();
        PriorityQueueHeap<Integer> heapPrioritario = new PriorityQueueHeap<>();
        // Agregar elementos a la cola de prioridad

        heapPrioritario.enqueue(4, 6);
        heapPrioritario.enqueue(6, 4);
        heapPrioritario.enqueue(7, 3);
        heapPrioritario.enqueue(9, 7);

        // Obtener y mostrar el elemento de mayor prioridad (máximo)
        System.out.println("Elemento de mayor prioridad: " + heapPrioritario.front()); // Salida: 2

        // Eliminar y mostrar los elementos en orden de prioridad (máximo a mínimo)
        System.out.println("Eliminando elementos:");
        heapPrioritario.mostrarPrioritarios(heapPrioritario);
        // Salida:
        // 9
        // 4
        // 6
        // 7
    }
}
