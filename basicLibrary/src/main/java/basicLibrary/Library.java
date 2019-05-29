/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

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


}
