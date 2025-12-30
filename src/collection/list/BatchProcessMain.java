package collection.list;

public class BatchProcessMain {
    public static void main(String[] args) {
        BatchProcessor batchProcessor1 = new BatchProcessor(new MyArrayList<>());
        batchProcessor1.logic(100_000);

        BatchProcessor batchProcessor2 = new BatchProcessor(new MyLinkedList<>());
        batchProcessor2.logic(100_000);
    }
}
