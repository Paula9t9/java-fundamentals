package inheritence;

import java.util.Objects;

public class RevRestaurant extends Review{

    private Restaurant restaurant;


    public RevRestaurant(Restaurant restaurant, String author, String body, int stars) {
        super(author, body, stars);
        this.restaurant = restaurant;
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

        // If object passed in isn't a RevRestaurant object, then they definitely aren't equal
        if(!(o instanceof RevRestaurant)){
            return  false;
        }

        // Now that we know it's a Review object, let's make it one
        RevRestaurant thatReview = (RevRestaurant) o;

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


    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
