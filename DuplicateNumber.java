public class DuplicateNumber {
    public static void main(String[] args) {
        int[]arr={2,5,7,1,2,6,4};
        System.out.println(findDuplicate(arr));

    }
    public static int findDuplicate(int[] nums) {
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
                return nums[i];
            }
        }
        return -1;
    }
    public static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
