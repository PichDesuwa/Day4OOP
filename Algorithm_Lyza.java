public class Algorithm_Lyza extends Algorithm_V1 {
    @Override
    public int sum(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Algorithm_Lyza lyza = new Algorithm_Lyza();
        int[] input = {1, 2, 3, 4, 5};
        int result = lyza.sum(input);     
        System.out.println("The sum is: " + result);  //
    }
    @Override
    double average(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'average'");
    }
    @Override
    int mean(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mean'");
    }
}  

 