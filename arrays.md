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
