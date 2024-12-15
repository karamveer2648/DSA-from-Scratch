# LeetCode Problem Solutions

This repository contains solutions for two LeetCode problems.

## 1. [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/)

### Problem Description:
Given an array `nums` of integers, return how many of them contain an even number of digits.

### Example:
```python
Input: nums = [12, 345, 2, 6, 7896]
Output: 2
Explanation: 
- 12 contains 2 digits (even number of digits).
- 345 contains 3 digits (odd number of digits).
- 2 contains 1 digit (odd number of digits).
- 6 contains 1 digit (odd number of digits).
- 7896 contains 4 digits (even number of digits).
Thus, there are 2 numbers with an even number of digits.

## Problem Description:
You are given a 2D array `accounts` where each `accounts[i]` is an array representing the wealth of the i-th customer. The wealth of a customer is the sum of the money they have in each bank. Return the wealth of the richest customer.

### Example:
```python
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation: 
- The first customer has wealth = 1 + 2 + 3 = 6.
- The second customer has wealth = 3 + 2 + 1 = 6.
Thus, the richest customer has wealth = 6.