# Sort an array of 0s, 1s and 2s

- https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/

Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)


## brute force

basic sorting gives you the result -- O(NLogN), O(1)


## Better approach 

### complexities -- O(2N), O(1)

```
sortArray(List<int> arr) {
  var n = arr.length;

  var count1 = 0;
  var count2 = 0;
  var count3 = 0;

  for (var i = 0; i < n; i++) {
    if (arr[i] == 0) {
      count1++;
    } else if (arr[i] == 1) {
      count2++;
    } else {
      count3++;
    }
  }

  for (var i = 0; i < count1; i++) {
    arr[i] = 0;
  }

  for (var i = count1; i < count1 + count2; i++) {
    arr[i] = 1;
  }

  for (var i = count1 + count2; i < n; i++) {
    arr[i] = 2;
  }

  return arr;
}

void main() {
  var res = sortArray([0, 2, 1, 2, 0, 1]);
  print(res);
}
``` 


## Optimal solution -- Dutch National flag algorithm

### complexities -- O(2N), O(1)


1. arr[0….low-1] contains 0. [Extreme left part]
2. arr[low….mid-1] contains 1.
3. arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
4. The middle part i.e. arr[mid….high] is the unsorted segment.

```
sortArray(List<int> arr) {
  var n = arr.length;

  var low = 0;
  var mid = 0;
  var high = n - 1;

  while (mid <= high) {
    if (arr[mid] == 0) {
      var temp = arr[low];
      arr[low] = arr[mid];
      arr[mid] = temp;

      low++;
      mid++;
    } else if (arr[mid] == 1) {
      mid++;
    } else {
      var temp = arr[mid];
      arr[mid] = arr[high];
      arr[high] = temp;

      high--;
    }
  }

  return arr;
}

void main() {
  var res = sortArray([0, 2, 1, 2, 0, 1]);
  print(res);
}
```







