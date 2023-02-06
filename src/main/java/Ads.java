import java.util.List;

public interface Ads {
    List<Ad> all();

    void insert(Ad ad); // persist new product to the database


}
