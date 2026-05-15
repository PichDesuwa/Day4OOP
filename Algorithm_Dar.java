import java.util.Arrays;

public class Algorithm_Dar extends Algorithm_V1{
    @Override
    int sum(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    double average(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'average'");
    }

    @Override
    int mean(int[] input) {
        int sum = 0;
         for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        int mean = (int) sum / input.length;
        return mean;
    }
    public static void main(String[] args) {
        //
        Algorithm_V1 al = new Algorithm_Dar();
        System.out.println(Arrays.toString(al.sample));
    }
}