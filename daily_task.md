# Recursion

## problems - https://www.youtube.com/watch?v=un6PLygfXrA

1. print name at N times
2. print lenearly from 1 to N
3. print N to 1


## arrays - move zeros

```
List<int> moveZeros(List<int> numbers) {
  var nonZeroCount = 0;

  // Move non-zero elements to the front
  for (var i = 0; i < numbers.length; i++) {
    if (numbers[i] != 0) {
      numbers[nonZeroCount] = numbers[i];
      nonZeroCount++;
    }
  }

  // Fill the remaining elements with zeros
  for (var i = nonZeroCount; i < numbers.length; i++) {
    numbers[i] = 0;
  }

  return numbers;
}

void main() {
  var res = moveZeros([2, 4, 5, 0, 8, 0, 2, 1]);
  print(res);  // Output: [2, 4, 5, 8, 2, 1, 0, 0]
}

```
