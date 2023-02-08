import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

    private Connection connection;
    private Config config;

    public MySQLAdsDao() throws SQLException {
        try {
            config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } finally {

        } ;
    }



//    public MySQLAdsDao(Config config) throws SQLException {
//        Connection connection = DriverManager.getConnection(
//                config.getUrl(),
//                config.getUser(),
//                config.getPassword()
//        );
//    }

    @Override
    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            List<Ad> ads = new ArrayList<>();

            while (rs.next()) {
                ads.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                                ));
            }
            return ads;
        } catch(SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

//    @Override
//    public Long insert(Ad title, Ad description) throws SQLException {
//        Statement statement = null;
//        statement.executeUpdate("INSERT INTO ads (title, description) VALUES(title, description)");
//    }


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }




}
