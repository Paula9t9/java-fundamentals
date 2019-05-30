# java-fundamentals
CodeFellows 401 practice with Java Fundamentals

___
## Basics
The basics directory contains a simple Main.java file with the methods pluralize, flipNHeads, and clock.

### pluralize (String word, int number) 
Takes a number and a string. Based on that number, it will determine if the string needs to be pluralized and returns the appropriate string. (TL;DR: it adds an 's' if the number is greater than 1 or equal to 0).

### flipNHeads(int numberOfHeadsDesired)
Takes a number for how many times in a row you want to flip heads. It then "flips a coin" until that number is achieved and returns a summary of the results. 

### clock()
Prints out the time every second. This is an intentionally infinite method. Run with caution. 

___
## BasicLibrary
The basicLibrary directory contains a basic library with functions for generating/testing arrays.

### roll(int numberOfRolls)
"Rolls a six-sided dice" the number of times specified by the caller and returns an array with the results.

### containsDuplicates(int[] arrayToCheck)
Checks if an array contains duplicates.

### averageCalculator(int[] array)
Calculates the average for a provided array.

### lowestAverageArrayCalc(int[][] inputArrayOfArrays)
Takes in an array of arrays and determines which array has the lowest average. Returns that array. 

## analyzeWeatherData(int[][] weeklyMonthTemperatures)
Analyzes temperatures to find the high, low, and which temperatures were not seen between those values

## tally(List<String> incomingList)
Counts the names in a List of Strings to determine who got the most votes
