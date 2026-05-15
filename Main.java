public class Main{
    public static void main(String[] args) {
        Algorithm_V1 algorithm = new Algorithm_Lyza();
        int[] sample = {1, 2, 3, 4, 5};
        algorithm.sum(sample);
        System.out.println("The sum is: " + algorithm.sum(sample));
    }
}