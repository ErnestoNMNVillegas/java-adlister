import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album("Test Artist", "Test Album", 1999, 13.1, "Test Genre");
        Quote quote = new Quote("Test Author", "Test Quote");
        Quote quote1 = new Quote("Ricky Bobby", "You aint 1st you last");
        Quote quote2 = new Quote("Joe Blow", "Interesting quote");
        Quote quote3 = new Quote("Tyler Durlin", "Wordy quote");
        Author author = new Author("TestAuthor1stName", "TestAuthorLastName");

        System.out.println("album.getAlbumName() = " + album.getAlbumName());
        System.out.println("album.getAlbumSales() = " + album.getAlbumSales());

        System.out.println("quote.getQuoteAuthor() = " + quote.getQuoteAuthor());

        ArrayList<Object> quoteList = new ArrayList<Object>();

        quoteList.add(quote);
        quoteList.add(quote1);
        quoteList.add(quote2);
        quoteList.add(quote3);

        for (Object o : quoteList) {
            System.out.println(o + " ");
        }

        System.out.println(quoteList);


    }
}
