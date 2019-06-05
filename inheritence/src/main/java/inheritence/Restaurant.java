package inheritence;

import java.util.ArrayList;
import java.util.Objects;

public class Restaurant implements Business{
    private String name;
    private int stars;
    private int priceCategory;
    private ArrayList<RevRestaurant> reviewList;

    // Don't initialize with user-defined stars because only reviews should update stars
    public Restaurant(String name, int priceCategory) {
        this.name = name;
        // initialize starSum at 3 so new restaurants don't default to 0 stars
        this.stars = 3;
        this.priceCategory = priceCategory;
        this.reviewList = new ArrayList<>();
    }


    public void addReview(Review incomingReview){
        // Check that it's an instanceOf() RevReview
        // If not, we have the wrong review - IllegalArgumentException ?
        // If so, cast it and use it

        if(!(incomingReview instanceof RevRestaurant)){
            throw new IllegalArgumentException("Should provide a review of type RevRestaurant");
        }

        RevRestaurant newReview = (RevRestaurant) incomingReview;

        //Don't add if review is already in list
        if(this.reviewList != null && this.reviewList.contains(newReview)){
            System.out.println("Unable to add review. Already exists.");
        }else {

            this.reviewList.add(newReview);

            // calculate new restaurant star rating
            // initialize starSum at 3 so new restaurants don't default to 0 stars
            // Don't use this.stars because we
            // want to iterate through reviews every time for best accuracy since we are using ints
            int starSum = 3;
            for (Review review : this.reviewList){
                starSum += review.getStars();
            }

            int starAverage = starSum / (this.reviewList.size() + 1);
            this.stars = starAverage;
        }
    }


    public String toString(){
        return String.format("Restaurant name: %s, stars: %d, priceCategory: %d",
                this.name, this.stars, this.priceCategory);
    }


    public boolean equals (Object o){
        // check if passed in object is literally this object
        if(o == this){
            return true;
        }

        // If object passed in isn't a Restaurant object, then they definitely aren't equal
        if(!(o instanceof Restaurant)){
            return  false;
        }

        // Now that we know it's a Restaurant object, let's make it one
        Restaurant thatRestaurant = (Restaurant) o;

        // compare restaurant-specific values for equality.
        // for now, it doesn't check that restaurants have the same list of reviews
        if(this.name == thatRestaurant.getName() &&
                this.stars == thatRestaurant.getStars() &&
                this.priceCategory == thatRestaurant.getPriceCategory() ){
            return true;
        }else {
            return false;
        }
    }


    //Getters and Setters

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<RevRestaurant> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<RevRestaurant> reviewList) {
        this.reviewList = reviewList;
    }


}
