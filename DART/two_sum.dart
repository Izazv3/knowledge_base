void twoSum() {
  List<int> arr = [2, 4, 6, 8, 10];

  int target = 14;

  Map<int, int> map = {};

  for (int i = 0; i < arr.length; i++) {
    int need = target - arr[i];
    if (map.containsKey(need)) {
      print([map[need], i]);
      return;
    } else {
      map[arr[i]] = i;
    }
  }
}
