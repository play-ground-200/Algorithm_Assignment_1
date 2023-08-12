public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] temparray = new int[nums.length];

        for(int i =0;i<nums.length;i++)
        {
            temparray[nums.length-i-1]  = nums[i];
        }
        nums = temparray;
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
    
}
