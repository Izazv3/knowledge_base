package JAVA.HEAP;

import java.util.ArrayList;

public class MaxHeap {

    ArrayList<Integer> heap;

    public void initializeHeap() {

        this.heap = new ArrayList<>();

    }

    public void insert(int key) {
        heap.add(key);
        int i = heap.size() - 1;
        while (i > 0 && heap.get(parent(i)) < heap.get(i)) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public void changeKey(int index, int newVal) {
        if (index < 0 || index >= heap.size())
            return;
        int oldVal = heap.get(index);
        heap.set(index, newVal);
        if (newVal > oldVal) {
            // bubble up
            while (index > 0 && heap.get(parent(index)) < heap.get(index)) {
                swap(index, parent(index));
                index = parent(index);
            }
        } else {
            // bubble down
            heapify(index);
        }
    }

    public void extractMax() {
        if (heap.isEmpty())
            return;
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heapify(0);
        }
    }

    public boolean isEmpty() {

        return heap.isEmpty();

    }

    public int getMax() {

        if (isEmpty())
            return -1;

        return heap.get(0);

    }

    public int heapSize() {

        return heap.size();

    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    private void heapify(int i) {
        int largest = i;
        int l = left(i);
        int r = right(i);
        if (l < heap.size() && heap.get(l) > heap.get(largest)) {
            largest = l;
        }
        if (r < heap.size() && heap.get(r) > heap.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

}
