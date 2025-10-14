// Author: quinn
// Movie item extends ItemForSale and stores length/duration.
public class Movie extends ItemForSale
{
    private String length;

    // Pre: all params valid.
    // Post: constructs a Movie.
    public Movie(String name, String price, Author creator, String publishDate ,String length) {
        super(name, price, creator, publishDate);
        this.length = length;
    }

    // Pre: length is set.
    // Post: returns the stored length string.
    public String getLength() {
        return length + " hours";
    }

}
}
