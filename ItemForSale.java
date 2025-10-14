// Author: quinn
// Base item for sale: stores name, price, creator, publish date.
public class ItemForSale {
    protected String name;
    protected String price;
    protected Author creator;
    protected String publishDate;

    // Pre: name, price, creator and publishDate are valid.
    // Post: constructs an ItemForSale with provided values.
    public ItemForSale(String name, String price, Author creator, String publishDate) {
        this.name = name;
        this.price = price;
        this.creator = creator;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getPrice() {
        return price;
    }

    public Author getCreator() {
        return creator;
    }

}