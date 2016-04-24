Connect Four
------------

By: Baking Soda
	Leader: Honglu Xu
	Members:Qili Ou, Zhixin Liu, ZekunTang

------------
Project Info
------------
 
The obeject primary goal is to implement the two-player connection game: connect four. The 2D game Connect Four is processing in a six-row, a seven-column vertically suspended grid. Each player chooses a color and then drop one discs into certain column. As the pieces fall straight down, it occupy the available position in that column. Once there are four discs in same color connecting in a line, the player who control that color wins. Here, our team is going to use the C++ (with some C code) to  implement the game with an AI rival in the Unix environment(we decide to use the Macbook mechine to develop the project). 

-------
Credits
-------

Honglu Xu: Team leader, main back-end coder, AI Algorithm Design.
Qili Ou: GUI Design.
Zhixin Liu: General programing architecture, AI Algorithm Design.
Zekun Tang: Mouse event responsing.

---------
User Case
---------

Please use the latest version of the Qt-creator to open the Ågtry.proÅh file, and compile the project to run the game.

Selecting mode phase
--------------------
Use the mouse clicking on the button to choose the mode: ÅgPVPÅh or ÅgAIÅh.

Gaming mode (general)
---------------------
Buttons:
Replay: Clear the checkerboard and restart the game.
Credits: Show the Credits.
Display counters: Weather to show the corner-board.

Rules: Once one of the players have reached 4 discs in a row, lengthways, transverse or diagonally, that player will win the game.

Displaying:
Checkboard: player 1 will be showed as the black disc, player 2 or AI will be showed as the red disc.
Corner-board: Show the largest number that one playerÅfs discs have reached in a row.

Gaming mode (PVP)
-----------------
Use the mouse clicking on one column to drop one disc. Players will take turns to drop the discs.

Gaming mode (AI)
----------------
Use the mouse clicking on one column to drop one disc. Player and AI will take turns to drop the discs.
