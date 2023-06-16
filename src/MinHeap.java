// AVANCE TRABAJO PRACTICO
// NOMBRES:
// FIORELA CLARIZA QUISPE QUISPE
// WILSON TURPO HUANCA

public class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap(int maxsize) {
        this.size = 0;
    }

    public MinHeap(int[] arr) {
        this.size = arr.length;
        heap = arr;
        buildHeap();
    }

    public int size() {
        return size;

    }

    public void insert(int dato) {
        if (size == heap.length) {
            throw new IllegalStateException("Min-Heap Leno");
        } else {
            int posActual = size;
            heap[posActual] = dato;

            size++;

            while (heap[posActual] < heap[parent(posActual)]) {
                Intercambia(posActual, parent(posActual));
                posActual = parent(posActual);
            }
        }
    }

    private void Intercambia(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private int parent(int pos) {
        return ((pos - 1) / 2);
    }

    private int leftChild(int pos) {
        return ((2 * pos) + 1);
    }

    private int rigthChild(int pos) {
        return ((2 * pos) + 2);
    }

}
