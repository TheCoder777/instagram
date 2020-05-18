import java.util.Arrays;

public class bubble {
    public static double[] sort(double[] toSort) {
        int c = 0;
        while(true) {
            c++;
            for(int i = 0; i + 1 < toSort.length; i++) {
                if(toSort[i] > toSort[i + 1]) {
                    double v = toSort[i];
                    toSort[i] = toSort[i + 1];
                    toSort[i + 1] = v;
                }
            }
            if( c >= toSort.length) {break;}
        }
        return toSort; // return sorted array
    }


    public static void main(String[] args) {
        double[] arr = {0.95, 5.78, 4.93, 7.36, 3.25, 4.23};
	// unsorted
        System.out.println(Arrays.toString(arr));

        double[] sorted = sort(arr);
	// sorted
        System.out.println(Arrays.toString(arr));
    }
}
