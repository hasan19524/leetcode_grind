# Rotate String

Easy

[https://leetcode.com/problems/rotate-string/submissions/2161404324/](https://leetcode.com/problems/rotate-string/submissions/2161404324/)

---

## Problem Statement

Given two strings s and goal, determine whether s can be transformed into goal by repeatedly moving its first character to the end.

---

## Approach

Check that the two strings have the same length and that goal appears as a contiguous substring of s concatenated with itself. Every rotation of s is represented as a substring of s + s, so this test is sufficient when the lengths match.

---

## Key Insight

All possible left rotations of a string are exactly the substrings of length n in the string formed by concatenating it with itself, so the rotation check reduces to a substring membership test.

---

## Algorithm Used

String Concatenation and Substring Search

---

## Time Complexity

O(n^2)

---

## Space Complexity

O(n)
