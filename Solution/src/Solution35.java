/**
 * Problem
 *      35.Search Insert Position
 * Grade of difficulty
 *      Easy
 * Related topics
 *      33.Search in Rotated Sorted Array
 *      34.Find First and Last Position of Element in Sorted Array
 *      278.First Bad Version
 * @author cartoon
 * @version 1.0
 */
public class Solution35 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 use circulate to test num of nums and target as rule
     *     2.3 return left side variable
     * 3.About submit record
     *     3.1 1ms and 37.1MB memory in LeetCode China
     *     3.2 0ms and 37.98MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=i+((j-i)>>1);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }

    /**
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate 0 to nums.length-1 to compare target and num of nums
     *     2.2 it's simple,but it isn't fast
     * 3.About submit record
     *     3.1 2ms and 39.8MB memory in LeetCode China
     *     3.2 2ms and 39.8MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @param target
     * @return
     */
    public int searchInsertByTraverse(int[] nums,int target){
        if(nums.length==0||target>nums[nums.length-1]){
            return nums.length;
        }
        int result=0;
        for(int i=0,length=nums.length;i<length;i++){
            if(nums[i]<target){
                result=i+1;
            }
            else {
                break;
            }
        }
        return result;
    }
}
