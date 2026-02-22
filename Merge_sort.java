import java.util.Arrays;
public class Merge_sort {
    public static void main(String[] args) {
        int[] array={4,8,1,3,0,-2,6,7,2};
        int start=0;
        int end=array.length;
        array=merge(array,start,end);
        System.out.println(Arrays.toString(array));

    }
    public static int[] merge(int[] arr, int start,int end){
        if(end-start<=1) return Arrays.copyOfRange(arr, start, end);;
        int mid=(start+end)/2;
        int[] left=merge(arr,start,mid);
        int[] right=merge(arr,mid,end);
        return mergesort(left,right);
    }
    public static int[] mergesort(int[] first,int[] second){
        int[] resultant=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                resultant[k]=first[i];
                i++;
            }
            else{
                resultant[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            resultant[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            resultant[k]=second[j];
            j++;
            k++;
        }
        return resultant;
    }
}
