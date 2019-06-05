package inheritence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    Restaurant testRestaurant;
    Review testReview;

    @Before
    public void initializeVariables(){
        testRestaurant = initializeRestaurant();
        testReview = initializeReview(testRestaurant);
    }

    @Test
    public void testReviewConstructor(){
        assertEquals("Author should be Gordon Ramsay",
                "Gordon Ramsay", testReview.getAuthor());
        assertEquals("Body should read: 'This is awful.'",
                "This is awful.", testReview.getBody());
        assertEquals("Stars should be 0", 0, testReview.getStars());
        assertEquals("Should have the correct restaurant object",
                testRestaurant, testReview.getRestaurant());
    }


    @Test
    public void testReviewToString(){
        String expectedString = "Review for restaurant Cash Brewery by author: Gordon Ramsay, stars: 0, body: This is" +
                " awful.";

        assertEquals("Should return toString for appropriate Review",
                expectedString, testReview.toString());
    }

    @Test
    public void testEquals(){
        Review sneakyCloneTestReview = initializeReview(testRestaurant);

        assertEquals("Review should equal itself", testReview, testReview);
        assertEquals("Restaurant should equal restaurant with same values",
                testReview, sneakyCloneTestReview);
    }

    private Restaurant initializeRestaurant(){
        return new Restaurant("Cash Brewery", 2);
    }

    private Review initializeReview(Restaurant restaurant){
        return new Review( restaurant,
                "Gordon Ramsay", "This is awful.", 0);
    }


}