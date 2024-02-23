# Find the Majority Element that occurs more than N/2 times

- https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/

## Problem Statement: 
Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

## Brute force

### Approach:
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


```
majorityElement(List<int> nums) {
  var total = nums.length;

  var map = {};

  for (var i = 0; i < total; i++) {
    var num = nums[i];

    if (map.containsKey(num)) {
      map[num] = map[num] + 1;
    } else {
      map[num] = 1;
    }
  }

  print(map);

  for (final entry in map.entries) {
    var count = entry.value;

    if (count > (total / 2)) {
      return entry.key;
    }

    print(count);
  }

  return -1;
}

void main() {
  var res = majorityElement([4, 4, 2, 4, 3, 4, 4, 3, 2, 4]);
  print(res);
}
```

### Complexity Analysis
Time Complexity: O(N*logN) + O(N), where N = size of the given array.
Reason: We are using a map data structure. Insertion in the map takes logN time. And we are doing it for N elements. So, it results in the first term O(N*logN). The second O(N) is for checking which element occurs more than floor(N/2) times. If we use unordered_map instead, the first term will be O(N) for the best and average case and for the worst case, it will be O(N2).

Space Complexity: O(N) as we are using a map data structure.


## Optimal Approach: Moore’s Voting Algorithm:

### Intuition:
If the array contains a majority element, its occurrence must be greater than the floor(N/2). Now, we can say that the count of minority elements and majority elements is equal up to a certain point in the array. So when we traverse through the array we try to keep track of the count of elements and the element itself for which we are tracking the count. 

After traversing the whole array, we will check the element stored in the variable. If the question states that the array must contain a majority element, the stored element will be that one but if the question does not state so, then we need to check if the stored element is the majority element or not. If not, then the array does not contain any majority element.

### Approach: 
1. Initialize 2 variables:
   Count –  for tracking the count of element
   Element – for which element we are counting
2. Traverse through the given array.
       1. If Count is 0 then store the current element of the array as Element.
       2. If the current element and Element are the same increase the Count by 1.
       3. If they are different decrease the Count by 1.
3. The integer present in Element should be the result we are expecting 


```
majorityElement(List<int> nums) {
  var total = nums.length;

  var count = 0;
  var el;

  for (var i = 0; i < total; i++) {
    if (count == 0) {
      count = 1;
      el = nums[i];
    } else if (el == nums[i]) {
      count++;
    } else {
      count--;
    }
  }

  var count1 = 0;

  for (var i = 0; i < total; i++) {
    if (el == nums[i]) {
      count1++;
    }
  }

  if (count1 > (total / 2)) {
    return el;
  }

  return -1;
}

void main() {
  var res = majorityElement([4, 4, 2, 4, 3, 4, 4, 3, 2, 4]);
  print(res);
}
```

## Complexity Analysis
Time Complexity: O(N) + O(N), where N = size of the given array.
Reason: The first O(N) is to calculate the count and find the expected majority element. The second one is to check if the expected element is the majority one or not.

Note: If the question states that the array must contain a majority element, in that case, we do not need the second check. Then the time complexity will boil down to O(N).

Space Complexity: O(1) as we are not using any extra space.