package inheritence;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop testShop;

    @Before
    public void initializeTestVariables(){
        testShop = initializeShop();
    }

    @Test
    public void testRestaurantConstructor() {
        assertEquals("Name should match GameStop",
                "GameStop", testShop.getName());
        assertEquals("Should have 3 stars", 3, testShop.getStars());
        assertEquals("Should have a price category of 2",
                2, testShop.getPriceCategory());
    }

    @Test
    public void testReviewToString(){
        String expectedString = "Shop name: GameStop, stars: 3, priceCategory: 2";

        assertEquals("Should return toString for appropriate Restaurant",
                expectedString, testShop.toString());
    }

    @Test
    public void testEquals(){
        Shop sneakyCloneTestShop = initializeShop();

        assertEquals("Shop should equal itself", testShop, testShop);
        assertEquals("Restaurant should equal restaurant with same values",
                testShop, sneakyCloneTestShop);
    }

    //Test that star rating properly updates
    @Test
    public void testAddReview_starRatingUpdate(){
        //addReview is called in review constructor
        Review testReview = initializeSadReview(testShop);

        assertEquals("Star rating should properly update after adding new review.",
                1, testShop.getStars());

    }

    //Test that adding the same review twice doesn't change the star rating
    @Test
    public void testAddReview_addingTwice(){
        //addReview is called in review constructor
        RevShop testReview = initializeSadReview(testShop);

        testShop.addReview(testReview);
        assertEquals("Star rating should not update if review already added",
                1, testShop.getStars());

    }

    //Test that review list contains the right reviews
    @Test
    public void testAddReview_List(){
        //addReview is called in review constructor
        RevShop testReview = initializeSadReview(testShop);

        RevShop secondTestReview = initializeHappyReview(testShop);

        ArrayList<RevShop> expectedReviewList = new ArrayList<>();
        expectedReviewList.add(testReview);
        expectedReviewList.add(secondTestReview);

        assertEquals("Review list should contain the added reviews",
                expectedReviewList, testShop.getReviewList());
    }

    //Test that review score properly updates with multiple reviews
    @Test
    public void testAddReview_starMultiple(){
        //addReview is called in review constructor
        RevShop testReview = initializeSadReview(testShop);
        RevShop testReview2 = initializeHappyReview(testShop);

        assertEquals("Stars should properly update with multiple reviews",
                2, testShop.getStars());
    }

    private Shop initializeShop(){
        return new Shop("GameStop", 2);
    }

    private RevShop initializeSadReview(Shop shop){
        return new RevShop(shop,
                "Gordon Ramsay", "This is awful.", 0);
    }

    private RevShop initializeHappyReview(Shop shop){
        return new RevShop(shop,
                "Paula Deen", "This is great! So much butter!", 5);
    }
}