# Full-Interest-Calculator
A more advanced version of the previously uploaded interest calculator.

This was an interesting project for a number of reasons. The first being that I discovered that it is basically impossible to solve for the number of times compounded. I guess the only way to solve it or get close is to perform a numerical approximation...

Getting into the development process..

Originally I thought it a good idea to just have the user enter every value they had and if they didn't have on they would just enter "0". This proved to be a little cumbersome as it asked the user more questions than neccessary. My thoughts are that the more you take out of the user's hands, the less possibilites of errors.

So after I junked the idea of entering "0" for the variable to be found, I got caught up on how to perform the operations for the solution. Originally I was going to call a method for each variable that could be solved, but that was just inefficient as you still needed to either send the variables to the method or send the scanner. 

Everything could be done in the main method and that's how the code works now. Based on the user's entry the code will perform simple if-statements then ask the user for the information known to them.
