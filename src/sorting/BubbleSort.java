package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,8,4,-1,7,10,5,6};
        int sortedarr[] = bubleSortArr(arr);
        for(int n : sortedarr){
            System.out.print(n+" ");
        }
    }

    private static int[] bubleSortArr(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j< arr.length-1-i; j++){
               if(arr[j] > arr[j+1]){
                   int t = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = t;
               }
            }
        }
        return arr;
    }
}
