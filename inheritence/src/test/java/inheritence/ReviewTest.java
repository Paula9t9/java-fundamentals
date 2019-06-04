package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testReviewConstructor(){
        Review testReview = new Review("Gordon Ramsay", "This is awful.", 0);

        assertEquals("Author should be Gordon Ramsay",
                "Gordon Ramsay", testReview.getAuthor());
        assertEquals("Body should read: 'This is awful.'",
                "This is awful.", testReview.getBody());
        assertEquals("Stars should be 0", 0, testReview.getStars());


    }


    @Test
    public void testReviewToString(){
        Review testReview = new Review("Gordon Ramsay", "This is awful.", 0);

        String expectedString = "Review author: Gordon Ramsay, stars: 0, body: This is awful.";

        assertEquals("Should return toString for appropriate Review",
                expectedString, testReview.toString());
    }


}