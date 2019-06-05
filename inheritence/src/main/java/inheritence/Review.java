package inheritence;

import java.util.Objects;

public class Review {
    private Restaurant restaurant;
    private String author;
    private int stars;
    private String body;


    public Review (Restaurant restaurant, String author, String body, int stars){
        this.restaurant = restaurant;
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.restaurant.addReview(this);

    }


    public String toString(){
        return String.format("Review for restaurant %s by author: %s, stars: %d, body: %s",
                this.restaurant.getName(), this.author, this.stars, this.body);
    }


    // equals override for easier testing. Provides a Review-specific definition of equals
    @Override
    public boolean equals (Object o){
        // check if passed in object is literally this object
        if(o == this){
            return true;
        }

        // If object passed in isn't a Review object, then they definitely aren't equal
        if(!(o instanceof Review)){
            return  false;
        }

        // Now that we know it's a Review object, let's make it one
        Review thatReview = (Review) o;

        // compare review-specific values for equality.
        // final .equals checks restaurant equality and handles nulls
        if(this.author == thatReview.getAuthor() &&
                this.stars == thatReview.getStars() &&
                this.body == thatReview.getBody() &&
                (Objects.equals(this.restaurant, thatReview.getRestaurant()))){
            return true;
        }else {
            return false;
        }
    }


    //Getters and Setters

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
