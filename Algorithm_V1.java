abstract  class Algorithm_V1 {
    //attribute
    int[] sample = {1, 2, 3, 4, 5};

    //method sum (lyza)
    int sum(int[] input){
        return  new Algorithm_Lyza().sum(input);
    };

    //method average (phanith)
    abstract double average(int[] input);

    //method mean (Dara)
    abstract int mean(int[] input);
}
