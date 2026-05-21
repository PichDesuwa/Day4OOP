abstract  class Algorithm_V1 {
    //attribute
    int[] sample = {2,5,7,18,92,40,12,5};

    // Bubble sort (Lyza)
    int[] bubbleSort(int[] input) {
        return Algorithm_Lyza().bubbleSort(input);
    }

    // Selection sort (Phanith)
    int[] selectionSort(int[] input) {
    return Algorithm_Phanith().selectionSort(input);
    }

    // Merge sort (Pichboth)
    int[] mergeSort(int[] input) {
        return Algorithm_Pichboth().mergeSort(input);
    }

    // Heap sort (Pichboth)
    int[] heapSort(int[] input) {
        return Algorithm_Pichboth().heapSort(input);
    }

    // Insertion sort (Dara)
     int[] insertionSort(int[] input) {
        return Algorithm_Dar().insertionSort(input);
    }

}
