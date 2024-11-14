import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr; //array of intergers
        arr = new int[30];
        System.out.println(arr[0]);
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) { //arrays are immutable length wise, length is a final int
            arr[i] = (int)(Math.random()*365);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(findSame(arr));

        System.out.println(findMin(arr));



    }

    public static int findSame(int[] brr) {
        brr = brr.clone(); //means its no longer editing the memory of the OG
        Arrays.sort(brr);
        for(int i = 1; i < brr.length; i++) {
                if(brr[i] == brr[i-1]) {
                    return brr[i];
                }
        }
    return -1;
    }

    public static int findMin(int[] brr) {
        if(brr.length > 0) {
        

        brr = brr.clone();
        int min = brr[0];
        for (int i = 0; i < brr.length; i++) {
            if(brr[i] < min) {
                min = brr[i];
            }
        }
        return min;
    }
    return Integer.MAX_VALUE;
    }
}
