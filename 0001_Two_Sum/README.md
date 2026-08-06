# Two Sum

Easy

[https://leetcode.com/problems/two-sum/description/](https://leetcode.com/problems/two-sum/description/)

---

## Problem Statement

Given an array of integers and a target sum, return the indices of the two numbers that add up to the target sum.

---

## Approach

The approach is to create a hash map that stores the numbers in the array as keys and their indices as values. Then, for each number in the array, check if the difference between the target sum and the current number exists in the hash map.

---

## Key Insight

The key insight is to use a hash map to store the numbers and their indices, allowing for constant time lookups and reducing the time complexity to O(n).

---

## Algorithm Used

Hash Table

---

## Time Complexity

O(n)

---

## Space Complexity

O(n)
