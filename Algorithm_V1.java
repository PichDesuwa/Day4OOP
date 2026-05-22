abstract  class Algorithm_V1 {
    //attribute
    int[] sample = {2,5,7,18,92,40,12,5};

    // Bubble sort (Lyza)
    @Override
    abstract int[] bubbleSort(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {

                if (input[j] > input[j + 1]) {

                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        return input;
    }
    
    // Selection sort (Phanith)
    abstract  int[] selectionSort(int[] input);

    // Merge sort (Pichboth)
    abstract int[] mergeSort(int[] input);

    // Heap sort (Pichboth)
    abstract int[] heapSort(int[] input);

    // Insertion sort (Dara)
    abstract int[] insertionSort(int[] input);

}
