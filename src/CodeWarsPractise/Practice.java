package CodeWarsPractise;
/*Leet Code algorithm practise
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

public class Practice {
    public static int solution(int[] nums, int target) {

        int i, x = 0;
        for (i = 0; i < nums.length; i++) {
            // accessing each element of array
            x = nums[i];
            if (x == target) {
                x = i;
                break;
            }
            else x=-1;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        solution(nums, target);
    }
    }
 */
/*You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version.
You should minimize the number of calls to the API.
 */

public class Practice {
    //    public static int main(String[] args) {
//        int n = 5, i, result = 0;
//        for (i = n; i >= 0; i--) {
//
//            if (isBadVersion(i) == true)
//                result = i;
////            else if (isBadVersion(i) == false)
////                break;
//        }
//        System.out.println(result);
//        return n;
//    }
//    public static boolean isBadVersion(int version) {
//        boolean re = false;
//        if (version == 5 || version == 4)
//            re = true;
//        return re;
//    }
//
//    int firstBadVersion(int n) {
//        int low = 0, high = n;
//        while (low <= high) {
///* This loop will work like it finding the
//first occurence of the bad versions
//*/
//            int mid = low + (high - low) / 2;
//            if (isBadVersion(mid))
//                high = mid - 1;
//            else
//                low = mid + 1;
//        }
//        return low;
//    }
    /*Given a sorted array of distinct integers and a target value,
    return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
     */
    public int searchInsert(int[] nums, int target) {
//Binary Search
//        int start=0;
//        int end=nums.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(target<nums[mid]){
//                end=mid-1;
//            }else if(target>nums[mid]){
//                start=mid+1;
//            }else{
//                return mid;
//            }
//        }
//        return start;
//    }
//        Answer two
        int numlen = nums.length;
        for (int i = 0; i < numlen; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        if (target > nums[numlen-1]) return numlen;
        return 0;
}

}