import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Algorithm_V1 algorithm = new Algorithm_Pichboth();
        int[] sample = {2,5,7,18,92,40,12,5};
        System.out.println("Original array: " + Arrays.toString(sample));
        int[] mergeSorted = algorithm.mergeSort(sample);
        System.out.println("Merge sorted array: " + Arrays.toString(mergeSorted));
        int[] heapSorted = algorithm.heapSort(sample);
        System.out.println("Heap sorted array: " + Arrays.toString(heapSorted));
    }
}