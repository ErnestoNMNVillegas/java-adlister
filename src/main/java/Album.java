import java.io.Serializable;

public class Album implements Serializable {
    private int idNo;
    private String artistName;
    private String albumName;
    private int releaseDate;
    private double albumSales;
    private String recordGenre;

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getAlbumSales() {
        return albumSales;
    }

    public void setAlbumSales(double albumSales) {
        this.albumSales = albumSales;
    }

    public String getRecordGenre() {
        return recordGenre;
    }

    public void setRecordGenre(String recordGenre) {
        this.recordGenre = recordGenre;
    }

    public Album(String artistName, String albumName, int releaseDate, double albumSales, String recordGenre) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.albumSales = albumSales;
        this.recordGenre = recordGenre;
    }



    public Album (){

    }
}




