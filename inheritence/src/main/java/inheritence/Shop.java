package inheritence;

import java.util.ArrayList;

public class Shop implements Business {
    private String name;
    private int stars;
    private int priceCategory;
    private ArrayList<RevShop> reviewList;

    // Don't initialize with user-defined stars because only reviews should update stars
    public Shop(String name, int priceCategory) {
        this.name = name;
        // initialize starSum at 3 so new restaurants don't default to 0 stars
        this.stars = 3;
        this.priceCategory = priceCategory;
        this.reviewList = new ArrayList<>();
    }

    @Override
    public void addReview(Review incomingReview) {
        if(!(incomingReview instanceof RevShop)){
            throw new IllegalArgumentException("Should provide a review of type RevShop");
        }

        RevShop newReview = (RevShop) incomingReview;

        // Don't add if review is already in the list
        // TODO: refactor to Hashmap so we won't need dup checking (will affect all businesses)
        if(this.reviewList != null && this.reviewList.contains(newReview)){
            System.out.println("Unable to add review. Already exists.");
        }else {
            this.reviewList.add(newReview);

            // calculate new restaurant star rating
            // initialize starSum at 3 so new restaurants don't default to 0 stars
            // Don't use this.stars because we
            // want to iterate through reviews every time for best accuracy since we are using ints
            int starSum = 3;
            for (RevShop review : this.reviewList) {
                starSum += review.getStars();
            }

            int starAverage = starSum / (this.reviewList.size() + 1);
            this.stars = starAverage;
        }
    }

    public String toString(){
        return String.format("Shop name: %s, stars: %d, priceCategory: %d",
                this.name, this.stars, this.priceCategory);
    }


    // Overrides default equality method for proper comparison
    public boolean equals (Object o){
        // check if passed in object is literally this object
        if(o == this){
            return true;
        }

        // If object passed in isn't a Restaurant object, then they definitely aren't equal
        if(!(o instanceof Shop)){
            return  false;
        }

        // Now that we know it's a Restaurant object, let's make it one
        Shop thatShop = (Shop) o;

        // compare restaurant-specific values for equality.
        // for now, it doesn't check that restaurants have the same list of reviews
        if(this.name == thatShop.getName() &&
                this.stars == thatShop.getStars() &&
                this.priceCategory == thatShop.getPriceCategory() ){
            return true;
        }else {
            return false;
        }
    }


    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public ArrayList<RevShop> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<RevShop> reviewList) {
        this.reviewList = reviewList;
    }
}
