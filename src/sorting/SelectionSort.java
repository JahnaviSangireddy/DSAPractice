package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,8,4,-1,7,10,5,6};
        int sortedarr[] = sortArr(arr);
        for(int n : sortedarr){
            System.out.print(n+" ");
        }
    }

    private static int[] sortArr(int[] arr) {
       // int min = Integer.MAX_VALUE, ind = 0;
        for(int i=0; i<arr.length-1; i++){
         int min = arr[i]; int minindx = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minindx = j;
                }
                System.out.println("min:"+min+"index:"+minindx);
            }
            System.out.println("swapping :"+arr[i]+","+arr[minindx]);
            int t = arr[i];
            arr[i] = arr[minindx];
            arr[minindx] = t;
        }
        return arr;
    }
}
