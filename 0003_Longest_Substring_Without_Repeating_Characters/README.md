# Longest Substring Without Repeating Characters

Medium

[https://leetcode.com/problems/longest-substring-without-repeating-characters/description/](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

---

## Problem Statement

Given a string s, find the length of the longest substring that contains no repeating characters.

---

## Approach

Maintain a sliding window of characters that are all unique. Use a hash map to store the most recent index of each character. As the right pointer moves forward, if the current character has already appeared inside the current window, move the left pointer to one position after the previous occurrence of that character. Track the maximum window length seen during the scan.

---

## Key Insight

When a duplicate character is encountered, the valid window can be advanced directly to the position after the character's last occurrence, preserving uniqueness while avoiding repeated scanning of the same characters.

---

## Algorithm Used

Sliding Window

---

## Time Complexity

O(n)

---

## Space Complexity

O(n)
