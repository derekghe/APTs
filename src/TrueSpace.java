public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long multiples = 0;
        for (int i: sizes){
            if (i % clusterSize == 0) multiples += (i/clusterSize);
            else multiples += (i/clusterSize) + 1;
        }
        return multiples*clusterSize;
    }
}