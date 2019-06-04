package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testReviewConstructor(){
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 3, 2);
        Review testReview = new Review(testRestaurant,
                "Gordon Ramsay", "This is awful.", 0);

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
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 3, 2);
        Review testReview = new Review( testRestaurant,"Gordon Ramsay", "This is awful.", 0);

        String expectedString = "Review for restaurant Cash Brewery by author: Gordon Ramsay, stars: 0, body: This is" +
                " awful.";

        assertEquals("Should return toString for appropriate Review",
                expectedString, testReview.toString());
    }


}