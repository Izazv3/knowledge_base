//Program to generate Pascal's Triangle

// output
// [1]
// [1, 1]
// [1, 2, 1]
// [1, 3, 3, 1]
// [1, 4, 6, 4, 1]

void main() {
  int rows = 5; // You can set this to any number of rows you want.
  generatePascalsTriangle(rows);
}

void generatePascalsTriangle(int rows) {
  List<List<int>> triangle = [];

  for (int i = 0; i < rows; i++) {
    triangle.add(List.filled((i + 1), 1));

    for (int j = 1; j < i; j++) {
      triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
    }
  }
  printTriangle(triangle);
}

void printTriangle(List<List<int>> triangle) {
  for (var row in triangle) {
    print(row);
  }
}
