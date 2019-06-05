//package inheritence;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class RevRestaurantTest {
//
//    Restaurant testRestaurant;
//    Review testReview;
//
//    @Before
//    public void initializeVariables(){
//        testRestaurant = initializeRestaurant();
//        testReview = initializeReview(testRestaurant);
//    }
//
//    @Test
//    public void testReviewConstructor(){
//        assertEquals("Author should be Gordon Ramsay",
//                "Gordon Ramsay", testReview.getAuthor());
//        assertEquals("Body should read: 'This is awful.'",
//                "This is awful.", testReview.getBody());
//        assertEquals("Stars should be 0", 0, testReview.getStars());
//        assertEquals("Should have the correct restaurant object",
//                testRestaurant, testReview.getRestaurant());
//    }
//
//
//    @Test
//    public void toString1() {
//    }
//
//    @Test
//    public void equals1() {
//    }
//
//    private Restaurant initializeRestaurant(){
//        return new Restaurant("Cash Brewery", 2);
//    }
//
//    private Review initializeReview(Restaurant restaurant){
//        return new Review( restaurant,
//                "Gordon Ramsay", "This is awful.", 0);
//    }
//}