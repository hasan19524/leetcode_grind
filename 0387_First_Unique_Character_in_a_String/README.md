# First Unique Character in a String

Easy

[https://leetcode.com/problems/first-unique-character-in-a-string/submissions/2161378621/](https://leetcode.com/problems/first-unique-character-in-a-string/submissions/2161378621/)

---

## Problem Statement

Given a string s consisting of lowercase English letters, return the index of the first character that appears exactly once. If no such character exists, return -1.

---

## Approach

The solution counts how many times each character appears in the string, then scans the string from left to right and returns the index of the first character whose total count is one. If no character has a count of one, it returns -1.

---

## Key Insight

A character is unique if and only if its total frequency in the string is one, so the problem reduces to first counting all character frequencies and then finding the earliest position with frequency one.

---

## Algorithm Used

Frequency Counting

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)
