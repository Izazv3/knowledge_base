# Find the Majority Element that occurs more than N/2 times

## Problem Statement: 
Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

## Brute force

Approach:
The steps are as follows:

1. We will run a loop that will select the elements of the array one by one.
2. Now, for each element, we will run another loop and count its occurrence in the given array.
3. If any element occurs more than the floor of (N/2), we will simply return it.

```
majorityElement(List<int> nums) {
  var total = nums.length;

  for (var i = 0; i < total; i++) {
    var count = 0;

    for (var j = 0; j < total; j++) {
      if (nums[i] == nums[j]) {
        count++;
      }
    }

    if (count > (total / 2)) {
      return nums[i];
    }
  }

  return -1;
}

void main() {
  var res = majorityElement([2, 2, 1, 1, 1, 2, 2]);
  print(res); // 2
}
```


### Complexity Analysis
Time Complexity: O(N2), where N = size of the given array. Reason: For every element of the array the inner loop runs for N times. And there are N elements in the array. So, the total time complexity is O(N2). Space Complexity: O(1) as we use no extra space.


## Better solution

### Intuition:
Use a better data structure to reduce the number of look-up operations and hence the time complexity. Moreover, we have been calculating the count of the same element again and again – so we have to reduce that also.

### Approach: 
1. Use a hashmap and store as (key, value) pairs. (Can also use frequency array based on the size of nums) 
2. Here the key will be the element of the array and the value will be the number of times it occurs. 
3. Traverse the array and update the value of the key. Simultaneously check if the value is greater than the floor of N/2. 
    1. If yes, return the key 
    2. Else iterate forward.


