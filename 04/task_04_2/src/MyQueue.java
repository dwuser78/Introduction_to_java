import java.util.LinkedList;

public class MyQueue<T> {
    LinkedList<T> queue;

    public MyQueue() {
        this.queue = new LinkedList<>();
    }
    public void enqueue(T element){
        this.queue.addLast(element);
    }

    public T dequeue(){
        T first_elem = this.queue.getFirst();
        this.queue.removeFirst();

        return first_elem;
    }

    public T first(){
        return this.queue.getFirst();
    }

    public LinkedList<T> getElements() {
        return this.queue;
    }
}
