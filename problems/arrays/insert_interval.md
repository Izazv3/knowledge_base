# Merge Overlapping Sub-intervals

- https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/

## Problem Statement
Given an array of intervals, merge all the overlapping intervals and return an array of non-overlapping intervals.

## Brute-force

```
mergeOverlap(List<List<int>> arr, List<int> newInterval) {
  arr.add(newInterval);

  var n = arr.length;

  arr.sort((a, b) => a[0] - b[0]);

  var ans = [];

  for (var i = 0; i < n; i++) {
    var start = arr[i][0];
    var end = arr[i][1];

    if (ans.isNotEmpty && end <= ans.last[1]) {
      continue;
    }

    for (var j = i + 1; j < n; j++) {
      if (arr[j][0] <= end) {
        end = end >= arr[j][1] ? end : arr[j][1];
      } else {
        break;
      }
    }

    ans.add([start, end]);
  }

  return ans;
}

void main() {
  var res = mergeOverlap([
    [1, 3],
    [8, 10],
    [2, 6],
    [15, 18]
  ], [
    7,
    8
  ]);
  print(res);
}
```