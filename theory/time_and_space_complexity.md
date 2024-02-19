# Time complexity


## what is time complexity?
   
   TC != time taken (time taken varies depending of systems)

Rate at which the time taken increases with respect to the input size.

## Bio -On Notation  -> O(time taken)

    ```
    for(i=1; i<N ; i++)
    {
        print("izaz");
    }
    ```
there is 3 steps with N of times so O(N*3) -> O(3N) is a time complexity

-> TC, worst case scenerio  (calculate avg, best and worst cases and stick with worst case)
-> awoid constants
-> awoid lower values

## example

1 example.
```
  for(i=1; i<N ; i++)
    {
       for(j=1; j<N ; j++)
        {
           some code
        }
    }
```

N+N+N....+N  N*N = N square;

Time complexity is O(N*2)


2 example.
```
  for(i=1; i<N ; i++)
    {
       for(j=1; j<i ; j++)
        {
           some code
        }
    }
```

1+2+3+4....N

Time complexity is O(N*2)  


# Space complexity - Big-O notation

## Auxillary space
space that you take to execute the problem

## Input space
space that you take to store the input

sum of 2 numbers => O(3N) - 3 variables used


### code -> server 

server executes 1 second ~ 10^8 operations

if time limit to execute a function in 1 second ~ O(10^8)