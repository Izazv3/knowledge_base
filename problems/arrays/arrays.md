# Arrays

##  Best Time to Buy and Sell Stock

```
import "dart:math";

calculateProfit({required List<int> prices}) {
  if (prices.length < 2) {
    return 0;
  }
  var minPrice = prices[0];
  var maxProfit = 0;
  for (var i = 0; i < prices.length; i++) {
    minPrice = min(minPrice, prices[i]);

    maxProfit = max(maxProfit, prices[i] - minPrice);
  }

  return maxProfit;
}

void main() {
  var result = calculateProfit(prices: [15, 6, 1, 8, 9, 10]);
  print(result);
}
```

## insert interval

```
List<List<int>> insertInterval(List<List<int>> intervals, List<int> newInterval) {
  List<List<int>> result = [];
  int i = 0;

  // Add all intervals that come before newInterval
  while (i < intervals.length && intervals[i][1] < newInterval[0]) {
    result.add(List.from(intervals[i]));
    i++;
  }

  // Merge overlapping intervals with newInterval
  while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
    newInterval[0] = newInterval[0].compareTo(intervals[i][0]) < 0
        ? newInterval[0]
        : intervals[i][0];
    newInterval[1] = newInterval[1].compareTo(intervals[i][1]) > 0
        ? newInterval[1]
        : intervals[i][1];
    i++;
  }

  // Add the merged interval to the result
  result.add(List.from(newInterval));

  // Add any remaining intervals
  while (i < intervals.length) {
    result.add(List.from(intervals[i]));
    i++;
  }

  return result;
}

void main() {
  // Example usage:
  List<List<int>> intervals1 = [[1, 3], [6, 9]];
  List<int> newInterval1 = [2, 5];
  List<List<int>> result1 = insertInterval(intervals1, newInterval1);
  print(result1); // Output: [[1, 5], [6, 9]]

  List<List<int>> intervals2 = [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]];
  List<int> newInterval2 = [4, 8];
  List<List<int>> result2 = insertInterval(intervals2, newInterval2);
  print(result2); // Output: [[1, 2], [3, 10], [12, 16]]
}
```
