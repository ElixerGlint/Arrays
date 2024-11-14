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

        System.out.println(countInRange(arr, 0, 100));


        String[] lyrics = new String[] {
            "Someone"
            ,"pour"
            ,"me"
            ,"a"
            ,"shot"
            ,"of"
            ,"coffee"
            ,"please"
            ,"i need it"
            ,"!"
        };

        //System.out.println(countwords(lyrics,"o"));
        for(int i = 0; i < 1000; i++) {
            Thread.sleep(100);
            System.out.print(kaeroke(lyrics) + " ");
            if(i%lyrics.length==lyrics.length-1) {
                System.out.println();
                messup(lyrics);
            }
        }
    }

    public static void messup(String[] words) {
        int ran1 = (int) (Math.random()*words.length);
        int ran2 = (int) (Math.random()*words.length);
        String temp = words[ran1];
        words[ran1] = words[ran2];
        words[ran2] = temp;
    }

    public static String kaeroke(String[] words) {
        String tempword = words[0];
        for(int i = 0; i < words.length-1; i++) {
            words[i] = words[i + 1];
        }
        words[words.length-1] = tempword;

        return tempword;
    }





    public static int countwords(String[] words, String letters) {
        int count = 0;
        for(String elem:words) {
            if(elem.indexOf(letters) > -1) {
                count++;
            }
        }

        return count;
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
        for (int i = 1; i < brr.length; i++) {
            if(brr[i] < min) {
                min = brr[i];
            }
        }
        return min;
    }
    return Integer.MAX_VALUE;
    }


    public static int countInRange(int[] brr, int min, int max) {
        int count = 0;
        for (int elem:brr) {
            if(elem>=min&&elem<=max) {
                count++;
            }
        }
        return count;
    }
}
