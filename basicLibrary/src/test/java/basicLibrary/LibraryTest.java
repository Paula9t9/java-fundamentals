/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {


    @Test public void testRoll_basicTest() {
        Library classUnderTest = new Library();
        int inputRolls = 4;
        assertEquals("Should return an array of the appropriate length",
                inputRolls, classUnderTest.roll(inputRolls).length);
    }

    //Stretch: Test if array is empty
    //Test if numbers in array are greater or less than 1-6


    @Test public void testDuplicates_basicTrue(){
        Library libraryInstance = new Library();
        int[] inputArray = new int[]{1, 2, 2, 4};
        assertTrue("Should return true if duplicates in array",
                libraryInstance.containsDuplicates(inputArray));
    }

    @Test public void testDuplicates_false(){
        Library library = new Library();
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        assertFalse("Should return false if there are no duplicates",
                library.containsDuplicates(inputArray));

    }

    //Stretch: test empty arrays, test huge arrays


    @Test public void testAverageCalculator_basicTest(){
        Library library = new Library();
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        assertEquals("Should correctly calculate the average", 3,
                library.averageCalculator(inputArray));
    }

    //Test an array where all values are the same
    @Test public void testAverageCalculator_sameValueArray(){
        Library library = new Library();
        int[] inputArray = new int[]{2, 2, 2, 2, 2, 2, 2, 2};
        assertEquals("Should correctly calculate average when all values the same",
                2, library.averageCalculator(inputArray));

    }

    //Stretch: test doubles, test empty arrays, test negative numbers, test non-numbers


}
