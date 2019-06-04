package inheritence;

public class Review {
    private Restaurant restaurant;
    private String author;
    private String body;
    private int stars;


    public Review (Restaurant restaurant, String author, String body, int stars){
        this.restaurant = restaurant;
        this.author = author;
        this.body = body;
        this.stars = stars;

    }


    public String toString(){
        return String.format("Review for restaurant %s by author: %s, stars: %d, body: %s",
                this.restaurant.getName(), this.author, this.stars, this.body);
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
