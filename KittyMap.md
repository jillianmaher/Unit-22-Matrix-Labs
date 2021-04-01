# Kitty Map
The lab was designed to teach you more about nested loops and matrices. Kitties are all over a grid map. The goal is to mark how many kitties are next to a given cell. 

## Lab Description 
Each cell in the boolean matrix that contains a kitty will be set to true.  Each cell that contains no kitty will be set to false.  Use   Math.random()  to randomly place the 0s and 1s in the grid – try multiplying by numbers larger than 2 if you want fewer kitties in the grid.

Next, create an integer matrix that stores the number of kitties near each cell.  Each cell that contains a kitty is set to 9.  All other cells are set to the value of how many kitties are around them.  This integer grid will be used to determine the best location from which to start collecting kitties. 


### Sample Boolean and Int grids
```
0 0 0 0 0 0 0 1 0 0 0 0 0 1 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 1 0
0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 1
0 0 0 0 1 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 1 0 0 1 0 0 0 0 0 0 0 0 0
0 0 1 0 0 0 0 1 0 0 0 1 1 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 1 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 1 0 0 0 0 0 1 0 1 0 0 0 0 0 0
0 0 0 0 0 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 1 0 0
0 0 0 0 0 0 0 1 0 0 1 0 0 1 1 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0


0 0 0 0 0 0 1 9 1 0 0 0 2 9 2 0 0 1 1 1
0 0 0 0 0 0 1 1 1 0 0 0 3 9 4 1 1 1 9 2
0 0 0 1 1 1 1 1 2 1 1 0 2 9 3 9 1 1 2 9
0 0 0 1 9 1 1 9 3 9 3 2 2 2 2 1 1 0 1 1
0 0 0 1 1 1 2 2 4 9 9 3 9 1 0 0 0 0 0 0
0 1 1 1 0 0 2 9 3 3 9 5 3 2 0 0 0 0 0 0
1 2 9 1 0 0 2 9 2 1 2 9 9 1 0 0 0 0 1 1
1 9 2 1 0 0 1 1 1 0 1 2 3 2 1 0 0 0 1 9
1 1 1 0 0 0 0 0 0 0 1 1 2 9 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 0 1 9 2 1 1 1 9 1 1 1
0 0 0 0 0 0 1 1 1 0 1 1 1 0 0 1 1 1 1 9
0 0 0 0 1 1 2 9 1 0 1 1 2 1 1 0 0 0 1 1
0 0 0 0 2 9 3 1 2 1 2 9 2 9 1 0 0 0 0 0
0 0 1 1 3 9 2 1 2 9 2 1 2 1 1 0 0 0 0 0
0 0 2 9 3 1 2 2 9 2 1 0 0 0 0 0 0 0 0 0
1 1 2 9 2 0 1 9 2 1 0 0 0 0 0 0 0 0 0 0
9 1 1 1 1 0 1 1 1 0 0 1 1 2 1 1 1 1 1 0
1 1 0 0 0 0 1 1 1 1 1 2 9 4 9 2 1 9 1 0
0 0 0 0 0 0 1 9 1 1 9 2 3 9 9 3 2 1 1 0
0 0 0 0 0 0 1 1 1 1 1 1 2 9 4 9 1 0 0 0
```