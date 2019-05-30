/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import java.net.Inet4Address;
import java.util.HashMap;

public class Library {


    public int[] roll(int numberOfRolls){

        int[] newArray = new int[numberOfRolls];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = (int) (Math.random() * 6);
        }

        return newArray;
    }


    public boolean containsDuplicates(int[] arrayToCheck){

        boolean duplicateFound = false;
        for (int i = 0; i < arrayToCheck.length; i++){

            for (int j = 0; j < arrayToCheck.length; j++){
                if(i == j){
                    continue;
                } else if (arrayToCheck[j] == arrayToCheck[i]){
                    duplicateFound = true;
                    break;
                }
            }

            if (duplicateFound){
                break;
            }
        }
        return duplicateFound;
    }


    public int averageCalculator(int[] array){
        int total = 0;
        for(int number : array){
            total += number;
        }
        return (total / array.length);
    }


    public int[] lowestAverageArrayCalc(int[][] inputArrayOfArrays){

        int[] returnArray = inputArrayOfArrays[0];
        int lowScore = Integer.MAX_VALUE;

        for (int[] array : inputArrayOfArrays){
            int thisAverage = averageCalculator(array);
            if (thisAverage < lowScore){
                lowScore = thisAverage;
                returnArray = array;
            }

        }

        return returnArray;
    }



    //Analyzes temperatures to find the high, low, and which temperatures were not seen between those values
    public String analyzeWeatherData(int[][] weeklyMonthTemperatures){
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = 0;
        HashMap<String, Integer> temperatures = new HashMap<>();
        //String builder recommended by Tim, used this site for examples:
        // https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
        StringBuilder returnStringBuilder = new StringBuilder();


        for (int[] array : weeklyMonthTemperatures){
            for (int temperature : array){
                //Check if number is max or min temp so far and set it.
                if (temperature > maxTemp){
                    maxTemp = temperature;
                } else if (temperature < minTemp){
                    minTemp = temperature;
                }

                String stringyTemperature = Integer.toString(temperature);

                //If the temp is already in HashSet, increment it. Otherwise, add it
                if(temperatures.containsKey(stringyTemperature)){
                    int countSoFar = temperatures.get(stringyTemperature);
                    temperatures.put(stringyTemperature, countSoFar + 1);
                } else {
                    temperatures.put(stringyTemperature, 1);
                }
            }
        }

        returnStringBuilder.append("High: " + maxTemp +
                "\nLow: " + minTemp);

        //Find temps that were dodged
        for (int i = minTemp; i < maxTemp; i++){
            if(temperatures.containsKey(i)){
                continue;
            }else {
                returnStringBuilder.append("\nNever saw temperature: " + Integer.toString(i));
            }


        }


        //Return string (StringBuilder)

        return returnStringBuilder.toString();
    }

}
