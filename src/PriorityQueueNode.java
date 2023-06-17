package eda.teo.pkg10;

// TRABAJO PRACTICO
// NOMBRES:
// FIORELA CLARIZA QUISPE QUISPE
// WILSON TURPO HUANCA

/**
 * La clase al implementar la interfaz Comparable<PriorityQueueNode<T>>, lo que
 * significa que los objetos de esta clase pueden ser comparados entre sí
 * 
 * @param <T>
 */
public class PriorityQueueNode<T extends Comparable<T>> implements Comparable<PriorityQueueNode<T>> {

    private T item;
    private int priority;

    public PriorityQueueNode(T item, int priority) {
        this.item = item;
        this.priority = priority;
    }

    public T getItem() {
        return item;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(PriorityQueueNode<T> o) {
        return Integer.compare(this.priority, o.priority);
    }
}