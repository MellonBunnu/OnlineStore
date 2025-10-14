public class Book extends ItemForSale {

    public Book(String name, String price, Author creator, String publishDate) {
        super(name, price, creator, publishDate);
    }

    public String getPublisher() {
        // In this simple model, publisher isn't stored separately. Return creator's name as placeholder.
        return getCreator().getName();
    }

    public String getAuthorBirthDate() {
        return getCreator().getBirthdate();
    }

}