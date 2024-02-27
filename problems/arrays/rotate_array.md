# Left rotate an array by D places

- https://takeuforward.org/arrays/right-rotate-an-array-by-d-places/
- https://www.youtube.com/watch?v=wvcQg43_V8U


## D=1

```
List<int> leftRotateArray(List<int> arr) {
  var temp = arr[0];
  var n = arr.length;

  for (var i = 1; i < n; i++) {
    arr[i - 1] = arr[i];
  }
  arr[n - 1] = temp;

  return arr;
}

void main() {
  var res = leftRotateArray([1, 2, 5, 7, 11]);

  print(res);
}
```

## D places

```
List<int> leftRotateArray(List<int> arr, int d) {
  var temp = <int>[];
  var n = arr.length;

  if (n == 0) return arr;

  d = d % n;

  print("d : $d");

  if (d == 0) return arr;

  for (var i = 0; i < d; i++) {
    temp.add(arr[i]);
  }

  print(temp);

  for (var i = d; i < n; i++) {
    arr[i - d] = arr[i];
  }

  for (var i = n - d; i < n; i++) {
    arr[i] = temp[i - (n - d)];
  }

  return arr;
}

void main() {
  var res = leftRotateArray([1, 2, 5, 7, 11], 3);

  print(res);
}
```


## optimal solution

```
void reverse(List<int> arr, int start, int end) {
  while (start <= end) {
    var temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
}

List<int> leftRotateArray(List<int> arr, int d) {
  var n = arr.length;

  if (n == 0) return arr;

  d = d % n;

  print("d : $d");

  if (d == 0) return arr;

  reverse(arr, 0, d - 1);
  reverse(arr, d, n - 1);
  reverse(arr, 0, n - 1);

  return arr;
}

void main() {
  var res = leftRotateArray([1, 2, 5, 7, 11], 3);

  print(res);
}
```


# Right rotate

```

List<int> rightRotateArray(List<int> arr, int d) {
  var n = arr.length;

  if (n == 0) return arr;

  d = d % n;

  print("d : $d");

  if (d == 0) return arr;

  // Step 1: Reverse last d elements
  reverse(arr, n - d, n - 1);

  // Step 2: Reverse first (n-d) elements
  reverse(arr, 0, n - d - 1);

  // Step 3: Reverse the whole array
  reverse(arr, 0, n - 1);


  return arr;
}
```