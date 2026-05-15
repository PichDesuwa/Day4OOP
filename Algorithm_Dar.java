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
        int total = 0;
         for (int num : input) {
            total += num;
        }
        return (int) total / input.length;
    }
    
}