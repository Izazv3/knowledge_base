# Patterns

link - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

## Nested loops

1. for the outer loop just count the number of lines
2. for the inner loop focus on the column and try to connect them somehow to the row
3. print the (*) inside the inner for loop
4. observe symmetry (optional)


### pattern 1

```
****
****
****
****

for(var i =0; i<4;i++){
  for(var j=0;j<4;j++){
    print("* ");
  }
  print(next line);
}
```

### pattern 2

```
*
**
***
****
*****

for(var i =0; i<4;i++){
  for(var j=0;j<=i;j++){  // with respect to i
    print("* ");
  }
  print(next line);
}
```


### pattern 3

```
1
12
123
1234
12345

import 'dart:io';

printPattern() {
    for (var i = 1; i <= 5; i++) {

        for (var j = 1; j <= i; j++) {
            stdout.write("* ");
        }

        print("");
    }
}

void main() {
    printPattern();
}
```

### pattern 4

```
1
22
333
4444
55555

  for (var i = 1; i <= 5; i++) {
    var row = " ";
    for (var j = 1; j <= i; j++) {
      row += i.toString();
    }

    print(row);
  }
```

### pattern 5  -- formula (n-i+1)

```
******
*****
****
***
**
*

   for (var i = 1; i <= 5; i++) {

        for (var j = 1; j <= 5-i+1; j++) {
            stdout.write("* ");
        }

        print("");
    }
```

### pattern 6  -- formula (n-i+1)

```
12345
1234
123
12
1

   for (var i = 1; i <= 5; i++) {

        for (var j = 1; j <= 5-i+1; j++) {
            stdout.write("${j} ");
        }

        print("");
    }
```

### pattern 7  -- (space, star, space) --> (n-i-1, 2*i+1, n-i-1)

```
    *    
   ***   
  *****  
 ******* 
*********

  for (var i = 0; i < 5; i++) {

        for (var j = 0; j < 5-i-1; j++) {
            stdout.write(" ");
        }
          for (var j = 0; j < 2*i+1; j++) {
            stdout.write("*");
        }
          for (var j = 0; j < 5-i-1; j++) {
            stdout.write(" ");
        }

        print("");
    }
```

### pattern 8  -- (space, star, space) --> (i,2*n-(2*i+1), i)

```
*********
 ******* 
  *****  
   ***   
    *    

  for (var i = 0; i < 5; i++) {

        for (var j = 0; j < i; j++) {
            stdout.write(" ");
        }
          for (var j = 0; j <2*5-(2*i+1); j++) {
            stdout.write("*");
        }
          for (var j = 0; j < i; j++) {
            stdout.write(" ");
        }

        print("");
    }
```