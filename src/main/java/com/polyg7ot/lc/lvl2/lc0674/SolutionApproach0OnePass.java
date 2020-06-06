/**
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 * 
 * Time Complexity:     O(N)
 * Space Complexity:    O(1)
 */
package com.polyg7ot.lc.lvl2.lc0674;

public class SolutionApproach0OnePass {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i - 1] < nums[i]) ans = Math.max(ans, ++count);
            else count = 1;
        }
        return ans;
    }
}