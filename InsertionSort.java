import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
       int[]arr={4,6,0,-2,7,12,-8,9};
       insSort(arr);
       System.out.println(Arrays.toString(arr));
    }
    public static void insSort(int[]arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
