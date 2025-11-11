import java.util.*;
public class setMismatch {
    public static void main(String[] args) {
        int[] arr={5,2,6,1,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[]nums,int first,int end){
        int temp=nums[first];
        nums[first]=nums[end];
        nums[end]=temp;
    }
}
