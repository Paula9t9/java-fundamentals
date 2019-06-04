package inheritence;

public class Restaurant {
    private String name;
    // TODO: I'm pretty sure there's a way to limit stars to 0-5, and price category to 1-3;
    private int stars;
    private int priceCategory;

    public Restaurant(String name, int stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public String toString(){
        return String.format("Restaurant name: %s, stars: %d, priceCategory: %d",
                this.name, this.stars, this.priceCategory);
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
}
