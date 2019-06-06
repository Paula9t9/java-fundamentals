package inheritence;

public class RevShop extends Review {

    private Shop shop;

    public RevShop(Shop shop, String author, String body, int stars) {
        super(author, body, stars);
        this.shop = shop;
        this.shop.addReview(this);
    }
}
