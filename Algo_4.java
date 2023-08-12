public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int j =0;
        for(int i =0;i<nums.length/2;i++){
            j = nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[i];
            nums[i] = j;

        }
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
    
}
