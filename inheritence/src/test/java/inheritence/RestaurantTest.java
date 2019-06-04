package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void tesRestaurantConstructor() {
        Restaurant testRestaurant = new Restaurant("Cash Brewery", 3, 2);

        assertEquals("Name should match Cash Brewery",
                "Cash Brewery", testRestaurant.getName());
        assertEquals("Should have 3 stars", 3, testRestaurant.getStars());
        assertEquals("Should have a price category of 2",
                2, testRestaurant.getPriceCategory());
    }
}