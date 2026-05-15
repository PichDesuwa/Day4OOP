public class Algorithm_Phanith extends Algorithm_V1{

    @Override
    int sum(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    double average(int[] input) {
         int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        double average = (double) sum / input.length;
        return average;
    }

    @Override
    int mean(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mean'");
    }

    
}