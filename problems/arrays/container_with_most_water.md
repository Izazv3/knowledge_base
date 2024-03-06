# Container With Most Water

- https://www.youtube.com/watch?v=UuiTKBwPgAo

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.


## two-pointer approach

```
maxarea(List<int> height) {
  var l = 0;
  var r = height.length - 1;
  var area = 0;

  while (l < r) {
    var h = height[l] < height[r] ? height[l] : height[r];

    var w = r - l;

    area = area > h * w ? area : h * w;

    if (height[l] < height[r]) {
      l++;
    } else {
      r--;
    }
  }

  return area;
}

void main() {
  var res = maxarea([1, 8, 6, 2, 5, 4, 8, 3, 7]);
  print(res); //49
}
```


## TC and SC

TC = O(N);
SC = O(1);