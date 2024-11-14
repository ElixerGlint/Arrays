import java.lang.reflect.Array;
import java.util.Arrays;

public class RayRay {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
int[] arr;
arr = new int[30]; // fills up 30 slots with default values 0. Starts at array number 0
System.out.println(arr[0]);
System.out.println(arr);

for (int i = 0; i < arr.length; i++) { // length of an array is variable inside the object, but is final
arr[i] = (int) (Math.random() * 366) + 1;
}
System.out.println(Arrays.toString(arr));
System.out.println(findSame(arr));
System.out.println(findMin(arr));

String[] lyrics = new String[] { "Someone", "pour", "me", "a", "shot", "of", "coffee" };
// declare and instantiate objects if u already know the stuff inside
System.out.println(countWords(lyrics, "a"));
String[] original = lyrics.clone();

for (int i = 0; i < 200000; i++) {
System.out.print(kaeroke(lyrics) + " ");
//Thread.sleep(10);
if (i % lyrics.length == lyrics.length - 1) {
if (i > lyrics.length) {
int samesies = 0;
for (int j = 0; j < lyrics.length; j++) {
if (lyrics[j].equals(original[j])) {
samesies++;
}
}
if (samesies == lyrics.length) {
break;
}
}
System.out.println(" ");
messUp(lyrics);
}
}

}

public static int findSame(int[] brr) {
brr = brr.clone();
Arrays.sort(brr);
for (int i = 1; i < brr.length; i++) { // can have out of bounds errors
if (brr[i] == brr[i - 1]) {
return brr[i];
}
}
return -1;
}

public static int findMin(int[] crr) {
int lowest = crr[0];

if (crr.length == 0) {
return Integer.MAX_VALUE;
} else {
for (int i = 1; i < crr.length; i++) {
if (crr[i] < lowest) {
lowest = crr[i];
}
}
}

return lowest;
}

public static int countInRange(int[] brr, int min, int max) {
int count = 0;
for (int elem : brr) { // for each loop: each integer element inside the array
if (elem >= min && elem <= max) { // check if the element is inside the range
count++;
}
}
// pros: ez to write, hard to go out of bounds cuz doesn't use the index
// cons: don't have the index, can't do some things
// elem is a reference variable
return count;
}

public static int countWords(String[] words, String letters) {
int count = 0;
for (String word : words) {
if (word.indexOf(letters) != -1) {
count++;
}
}
return count;
}

public static String kaeroke(String[] words) { // Doesn't work
String output = words[0];
for (int i = 0; i < words.length - 1; i++) {
words[i] = words[i + 1];
}
words[words.length - 1] = output;
return output;
}

public static String messUp(String[] words) {
int randomIndex1 = (int) (Math.random() * words.length); // random index in the array
int randomIndex2 = (int) (Math.random() * words.length);

String word = words[randomIndex1];
words[randomIndex1] = words[randomIndex2];
words[randomIndex2] = word;

return words[randomIndex1] + " " + words[randomIndex2];
}

}
