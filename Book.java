// Author: quinn
// Book item extends ItemForSale. Simple model: publisher uses creator name as placeholder.
public class Book extends ItemForSale {

    // Pre: input values valid.
    // Post: constructs a Book.
    public Book(String name, String price, Author creator, String publishDate) {
        super(name, price, creator, publishDate);
    }

    // Pre: book has a creator.
    // Post: returns publisher (placeholder = creator name).
    public String getPublisher() {
        return getCreator().getName();
    }

    // Pre: book has a creator with a birthdate.
    // Post: returns the birthdate of the author.
    public String getAuthorBirthDate() {
        return getCreator().getBirthdate();
    }

}