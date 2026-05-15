public class Algorithm_Phanith extends Algorithm_V1 {
    @Override
    public int sum(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    double average(int[] input) {
        int total = 0;
        for (int num : input) {
            total += num;
        }
        return (double) total / input.length;
    }

    @Override
    int mean(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mean'");
    }
}