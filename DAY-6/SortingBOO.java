//Sorting based on occurences
//import java.util.Arrays;
public class SortingBOO {
    public static void main(String args[]) {
        int arr[] = { 5, 4, 4, 2, 2, 1, 3 };
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int freq[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        // int[] over =new int[largest+1];
        // Arrays.fill(over , 1);

        // for(int i=0;i<arr.length;i++){
        // for(int j=arr[i];j<arr.length;j++){
        // while (freq[j]!=0 && over[j]>0){

        // System.out.print(j);
        // freq[j]--;

        // }over[j]--;

        // }

        // }
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < freq.length; j++) {
                if (freq[j] == i) {
                    for (int k = 0; k < i; k++) {
                        System.out.print(j);
                    }
                }
            }
        }

    }
}
// find freq
// create 2d array {element,frequency}
// sort the 2d array
// print the elemnet for freq times
