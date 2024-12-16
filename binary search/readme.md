# Binary Search Algorithm

## Introduction
Binary Search is an efficient algorithm for finding an item from a sorted list of items. It works by repeatedly dividing in half the portion of the list that could contain the item, until you've narrowed down the possible locations to just one.

## How It Works
1. **Initial Setup**: Start with the middle element of the sorted array.
2. **Comparison**: Compare the target value to the middle element.
    - If the target value is equal to the middle element, the search is complete.
    - If the target value is less than the middle element, repeat the search on the left half of the array.
    - If the target value is greater than the middle element, repeat the search on the right half of the array.
3. **Repeat**: Continue the process until the target value is found or the subarray size becomes zero.

## Time Complexity
- **Best Case**: O(1) - The target value is the middle element.
- **Average Case**: O(log n) - The target value is found after log n comparisons.
- **Worst Case**: O(log n) - The target value is not in the array, and the algorithm has to check log n elements.

## Example

## Files in the Binary Search Folder
- **BINARYSEARCHASCENDING.JAVA**: Contains the implementation of the binary search algorithm for an ascending sorted array in Java.
- **BINARYSEARCHDESCENDING.JAVA**: Contains the implementation of the binary search algorithm for a descending sorted array in Java.
- **BINARYSEARCHOPTIMIZED.JAVA**: Contains the implementation of an optimized binary search algorithm that can handle both ascending and descending sorted arrays in Java.