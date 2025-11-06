import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[]nums={34,90,56,-7,0,43,-31};
        selSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr,max,last);
        }
    }
    public static void swap(int[]arr,int f,int e){
        int temp=arr[f];
        arr[f]=arr[e];
        arr[e]=temp;
    }
    public static int getmax(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
