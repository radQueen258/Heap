public class MainMaxHeap {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(new int[] {3,17,10,14,12,11,15,8});
        System.out.println(heap);
        System.out.println(heap.isMaxHeap());
        System.out.println();

        System.out.println(heap);
        heap.maxHeapify(0);
        System.out.println(heap);

        System.out.println();

        MaxHeap heap1 = new MaxHeap(new int[] {17,15,13,14,12,11,8,9,1,4,2,10});
        System.out.println(heap1);
        System.out.println(heap1.isMaxHeap());

        //MaxHeap heap2 = new MaxHeap(new int[] {3,6,4,9,8,12,7,11,9});
        System.out.println("-----------------EXERCISE 2--------------------");
        MaxHeap heap3 = new MaxHeap();
        heap3.readFromFile("C:\\Users\\radka\\IdeaProjects\\Heap\\src\\data1");
        System.out.println(heap3);


    } 
}
