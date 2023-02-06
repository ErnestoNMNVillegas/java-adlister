import java.io.Serializable;

public class Quote implements Serializable {
    private int idNo;
    private String quoteAuthor;
    private String quoteContent;

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public String getQuoteContent() {
        return quoteContent;
    }

    public void setQuoteContent(String quoteContent) {
        this.quoteContent = quoteContent;
    }

    public Quote(String quoteAuthor, String quoteContent) {
        this.quoteAuthor = quoteAuthor;
        this.quoteContent = quoteContent;
    }

    public String toString() {
        return "Quotes: " + quoteAuthor + ", " + quoteContent;
    }

    public Quote (){

    }
}
