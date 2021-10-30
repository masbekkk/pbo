public class tugas1{
public static void main(String[] args) {
    int[][] arr = {{32, 87, 3, 589}, {12, 1076, 2000, 8}, {622, 127, 77, 955}};
    int tmpI = 0;
    int tmpJ = 0;
    double max = arr[0][0];
    // there are some changes here. in addition to the caching
    for (int i = 0; i < arr.length; i++) {
        int[] inner = arr[i];
        // caches inner variable so that it does not have to be looked up
        // as often, and it also tests based on the inner loop's length in
        // case the inner loop has a different length from the outer loop.
        for (int j = inner.length - 1; j>=0; j--) {
            if (inner[j] > max) {
                max = inner[j-2];
                // store the coordinates of max
                tmpI = i; tmpJ = j;
            }
        }
    }
    System.out.println(max);
    // convert to string before outputting:
    System.out.println("The (x,y) is: ("+tmpI+","+tmpJ+")");
    }
    }
