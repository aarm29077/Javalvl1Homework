package com.aca.homework.week5.light.out;
/*
  12345
-------
1|++0++
2|+0+0+
3|0+++0
4|+0+0+
5|++0++
Create a Light class that can be either in 'on' or 'off' state.

Create a Game class that container matrix of lights of 5x5.

Create an initialzie() method that will fill the matrix with the light having the above depicted state where + means that the light is 'on' and 0 is 'off'.

To make the Game graphic more understandable fill the board with numbers, |s and -s.

The Game class should have start method that start asking light position in a format '(x,y)' and will switch the light state located at (x,y), (x-1,y), (x+1,y), (x,y-1) and (x,y+1) coordinates.

The game ends when all light are off.

for instance to win the game user should input the following strings

(3,3)
(1,1)
(5,5)
(5,1)
(1,5)

After each user input the moves count and the updated game graphic should be printed.

The game should be started in the folllowing way:
----------------------------------------------------------
The game started!!
moves: 0
  12345
-------
1|++0++
2|+0+0+
3|0+++0
4|+0+0+
5|++0++
please enter a hit coordinates in '(x,y)' format:
(3,3)
moves: 1
  12345
-------
1|++0++
2|+000+
3|00000
4|+000+
5|++0++
please enter a hit coordinates in '(x,y)' format:
.
.
.
You won!

 */

public class Light {
}
