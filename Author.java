// Author: quinn
// Simple class representing an author (name and birthdate).
public class Author {

    private String name;
    private String birthdate;

    // Pre: name and birthdate are non-null strings.
    // Post: constructs an Author with provided name and birthdate.
    public Author(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

}