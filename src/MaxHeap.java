import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MaxHeap {
    private int[] a;
    private int size;


    public MaxHeap(int[] a) {
        this.size = a.length;
        this.a = new int [a.length];
//                System.arraycopy(a,0,a,a,a.length);

        for (int i = 0; i < a.length; i ++) {
            this.a[i] = a[i];
        }
    }

    public MaxHeap() {

    }

    public boolean isMaxHeap() {
        for (int i = 0; i < size / 2; i ++) {
            if ( 2 * i + 1 < size && a[i] < a[2 * i + 1] || 2 * i + 2 < size && a[i] < a[2 * i + 2]) {
                return false;
            }
        }
        return true;
    }

    public void maxHeapify (int ind) {
        //from the elements with the index ind, 2 * ind + 1, 2 * ind + 2 choose the max
        int left = 2 * ind + 1;
        int right = 2 * ind + 2;
        int maxInd = ind;

        if (left < size && a[left] > a[ind]) {
            maxInd = left;
        }

        if (right < size && a[right] > a[maxInd]) {
            maxInd = right;
        }
        //change their place with ind
        if ( ind != maxInd) {
            swap (ind, maxInd);
            maxHeapify(maxInd);
        }
        //swap maxHipify for
    }

    private void swap (int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void buildMaxHeap() {
        for (int i = a.length/2 - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }


    @Override
    public String toString() {
        return "MaxHeap = " + Arrays.toString(a);
    }

    public void readFromFile (String path) {
        try (Scanner radka = new Scanner(new File(path))){
            size = radka.nextInt();
            radka.nextLine();
            a = new int [size];
            for ( int i = 0;i < size; i ++) {
                a[i] = radka.nextInt();
            }
            if (!isMaxHeap()){
                buildMaxHeap();
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        }
    }

    public void HeapSort (String path) {
        try (Scanner radka = new Scanner (new File(path))) {

        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        }
    }

    public int[] getSortedArray () {
        return a;
    }

    public MaxHeap(int size) {
        this.a = new int [size];
        this.size = size;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
