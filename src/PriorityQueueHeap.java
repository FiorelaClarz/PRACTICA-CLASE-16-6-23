package eda.teo.pkg10;

// TRABAJO PRACTICO
// NOMBRES:
// FIORELA CLARIZA QUISPE QUISPE
// WILSON TURPO HUANCA

/**
 * La clase PriorityQueueHeap<T> implementa una cola de prioridad utilizando un
 * montículo
 * (Heap) como estructura de datos subyacente.El tipo genérico T se limita a
 * aquellos
 * tipos que implementan la interfaz Comparable<T>.
 * 
 * @param <T>
 */
public class PriorityQueueHeap<T extends Comparable<T>> {

    private Heap<PriorityQueueNode<T>> heap;

    public PriorityQueueHeap() {
        heap = new Heap<>();
    }

    public void enqueue(T item, int priority) {
        PriorityQueueNode<T> node = new PriorityQueueNode<>(item, priority);
        heap.insert(node);
    }

    public T dequeue() {
        PriorityQueueNode<T> node = heap.remove();
        return node.getItem();
    }

    public T front() {
        PriorityQueueNode<T> node = heap.devolverElemento();
        return node.getItem();
    }

    public T back() {
        return heap.devolverElemento().getItem();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public void mostrarPrioritarios(PriorityQueueHeap<?> priQueue) {
        System.out.println("Datos insertados en el Heap:");

        while (!priQueue.isEmpty()) {
            System.out.println(priQueue.dequeue());
        }
        System.out.println();
    }
}