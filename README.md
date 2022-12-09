## Number pairs

This repository contains the source code that resolve the next problem:

The task is to write a function that finds pairs of integers from a list that
sum to a given value. The function will take as input the list of numbers as
well as the target sum.

# -----------------------------------------------------------------------------

## Run the solution

To run the app with the solution, you need the JRE 11 or higher installed in
your PC.

Then open the command line preferred by you, and go to the folder where you
download the jar file SumPairs.jar.

Next write in you command line:
### java -jar SumPairs.jar listNumbers target
Where listNumbers is a list of integers numbers comma separated, then a space and 
other integer number for which the application going to look for pairs wich sum 
result the target written.

Next is an example: 

### java -jar .\SumPairs.jar 1,9,5,0,20,-4,12,16,7 8
 
 The output of this line is:
 
 [
[1, 7],
[-4, 12]]

