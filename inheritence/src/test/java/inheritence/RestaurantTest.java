package inheritence;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant testRestaurant;

    @Before
    public void initializeTestVariables(){
        testRestaurant = initializeRestaurant();
    }

    @Test
    public void testRestaurantConstructor() {
        assertEquals("Name should match Cash Brewery",
                "Cash Brewery", testRestaurant.getName());
        assertEquals("Should have 3 stars", 3, testRestaurant.getStars());
        assertEquals("Should have a price category of 2",
                2, testRestaurant.getPriceCategory());
    }

    @Test
    public void testReviewToString(){
        String expectedString = "Restaurant name: Cash Brewery, stars: 3, priceCategory: 2";

        assertEquals("Should return toString for appropriate Restaurant",
                expectedString, testRestaurant.toString());
    }

    @Test
    public void testEquals(){
        Restaurant sneakyCloneTestRestaurant = initializeRestaurant();

        assertEquals("Restaurant should equal itself", testRestaurant, testRestaurant);
        assertEquals("Restaurant should equal restaurant with same values",
                testRestaurant, sneakyCloneTestRestaurant);
    }

    //Test that star rating properly updates
    @Test
    public void testAddReview_starRatingUpdate(){
        //addReview is called in review constructor
        Review testReview = initializeSadReview(testRestaurant);

        assertEquals("Star rating should properly update after adding new review.",
                1, testRestaurant.getStars());

    }

    //Test that adding the same review twice doesn't change the star rating
    @Test
    public void testAddReview_addingTwice(){
        //addReview is called in review constructor
        Review testReview = initializeSadReview(testRestaurant);

        testRestaurant.addReview(testReview);
        assertEquals("Star rating should not update if review already added",
                1, testRestaurant.getStars());

    }

    //Test that review list contains the right reviews
    @Test
    public void testAddReview_List(){
        //addReview is called in review constructor
        Review testReview = initializeSadReview(testRestaurant);

        Review secondTestReview = initializeHappyReview(testRestaurant);

        ArrayList<Review> expectedReviewList = new ArrayList<>();
        expectedReviewList.add(testReview);
        expectedReviewList.add(secondTestReview);

        assertEquals("Review list should contain the added reviews",
                expectedReviewList, testRestaurant.getReviewList());
    }

    //Test that review score properly updates with multiple reviews
    @Test
    public void testAddReview_starMultiple(){
        //addReview is called in review constructor
        Review testReview = initializeSadReview(testRestaurant);
        Review testReview2 = initializeHappyReview(testRestaurant);

        assertEquals("Stars should properly update with multiple reviews",
                2, testRestaurant.getStars());
    }

    private Restaurant initializeRestaurant(){
        return new Restaurant("Cash Brewery", 2);
    }

    private Review initializeSadReview(Restaurant restaurant){
        return new RevRestaurant(restaurant,
                "Gordon Ramsay", "This is awful.", 0);
    }

    private Review initializeHappyReview(Restaurant restaurant){
        return new RevRestaurant(restaurant,
                "Paula Deen", "This is great! So much butter!", 5);
    }
}