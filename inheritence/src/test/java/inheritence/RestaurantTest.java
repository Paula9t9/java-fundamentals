package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testRestaurantConstructor() {
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 3, 2);

        assertEquals("Name should match Cash Brewery",
                "Cash Brewery", testRestaurant.getName());
        assertEquals("Should have 3 stars", 3, testRestaurant.getStars());
        assertEquals("Should have a price category of 2",
                2, testRestaurant.getPriceCategory());
    }

    @Test
    public void testReviewToString(){
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 3, 2);

        String expectedString = "Restaurant name: Cash Brewery, stars: 3, priceCategory: 2";

        assertEquals("Should return toString for appropriate Restaurant",
                expectedString, testRestaurant.toString());
    }

    @Test
    public void testEquals(){
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 3, 2);
        Restaurant sneakyCloneTestRestaurant = new Restaurant("Cash Brewery", 3, 2);

        assertEquals("Restaurant should equal itself", testRestaurant, testRestaurant);
        assertEquals("Restaurant should equal restaurant with same values",
                testRestaurant, sneakyCloneTestRestaurant);
    }

    @Test
    public void testAddReview(){

        //Test that star rating properly updates
        //Test that review list contains the right reviews
        //Test that adding the same review twice doesn't change the star rating

    }
}