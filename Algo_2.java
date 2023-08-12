public class Algo_2 {
    public static void main(String[] args) {

        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

        int smallest = nums[0];
        int largest = nums[0];

        for(int i =0;i<nums.length;i++)
        {
            smallest = (nums[i]<smallest)? nums[i]: smallest;
            largest = (nums[i]>largest)? nums[i]: largest;

        }
        System.out.printf("Smallest number : %d\nLargest number : %d\n",smallest,largest);
    }
    
}
