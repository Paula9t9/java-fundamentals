package inheritence;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testRestaurantConstructor() {
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 2);

        assertEquals("Name should match Cash Brewery",
                "Cash Brewery", testRestaurant.getName());
        assertEquals("Should have 3 stars", 3, testRestaurant.getStars());
        assertEquals("Should have a price category of 2",
                2, testRestaurant.getPriceCategory());
    }

    @Test
    public void testReviewToString(){
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 2);

        String expectedString = "Restaurant name: Cash Brewery, stars: 3, priceCategory: 2";

        assertEquals("Should return toString for appropriate Restaurant",
                expectedString, testRestaurant.toString());
    }

    @Test
    public void testEquals(){
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 2);
        Restaurant sneakyCloneTestRestaurant = new Restaurant("Cash Brewery", 2);

        assertEquals("Restaurant should equal itself", testRestaurant, testRestaurant);
        assertEquals("Restaurant should equal restaurant with same values",
                testRestaurant, sneakyCloneTestRestaurant);
    }

    @Test
    public void testAddReview(){
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 2);
        Review testReview = new Review( testRestaurant,
                "Gordon Ramsay", "This is awful.", 0);

        //Test that star rating properly updates
        testRestaurant.addReview(testReview);
        assertEquals("Star rating should properly update after adding new review.",
                1, testRestaurant.getStars());

        //Test that adding the same review twice doesn't change the star rating
        testRestaurant.addReview(testReview);
        assertEquals("Star rating should not update if review already added",
                1, testRestaurant.getStars());

        //Test that review list contains the right reviews
        Review secondTestReview = new Review(testRestaurant,
                "Paula Deen", "This is great! So much butter!", 5);
        testRestaurant.addReview(secondTestReview);

        ArrayList<Review> expectedReviewList = new ArrayList<>();
        expectedReviewList.add(testReview);
        expectedReviewList.add(secondTestReview);

        assertEquals("Review list should contain the added reviews",
                expectedReviewList, testRestaurant.getReviewList());

        //Test that review score properly updates with multiple reviews
        assertEquals("Stars should properly update with multiple reviews",
                2, testRestaurant.getStars());
    }
}