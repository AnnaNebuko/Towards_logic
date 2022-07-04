All the weird and unnecessary logic tasks that I'm lucky enough to come across

***CountPairsInArray:***
Count the pairs in the array
int arr[] = {1,2,3,4,5,5,6,6};

***CountTheSameLettersInARow:***
Show how many repeated letters follow each other
Input: "aaaabbbcca"
Output: (a, 4), (b, 3), (c, 2), (a, 1)

***FindIdsOfTwoNumbersThatAddUpToTarget***
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

***CountNumberOfPairsWithDifferenceK***
Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k

Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]

***Count Equal and Divisible Pairs in an Array***
Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.

Input: nums = [3,1,2,2,2,1,3], k = 2
Output: 4
Explanation:
There are 4 pairs that meet all the requirements:
- nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
- nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
- nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
- nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.
