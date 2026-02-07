public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Given an integer array nums, find a subarray that has the largest product, and return the product.
        
        The test cases are generated so that the answer will fit in a 32-bit integer.
        
        Note that the product of an array with a single element is the value of that element.
        
        
        
        Example 1:
        
        Input: nums = [2,3,-2,4]
        Output: 6
        Explanation: [2,3] has the largest product 6.
        Example 2:
        
        Input: nums = [-2,0,-1]
        Output: 0
        Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
        
         */
        int[] nums = { 2, 3, -2, 4 };
        Solution solution = new Solution();
        int result = solution.maxProduct(nums);
        System.out.println("The maximum subarray product that we can get for the input given above is: "+result);
    }
}
