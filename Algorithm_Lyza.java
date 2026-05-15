public class Algorithm_Lyza extends Algorithm_V1 {
    @Override
    public int sum(int[] input) {
        int total = 0;
        for (int num : input) {
            total += num;
        }
        return total;
    }

}