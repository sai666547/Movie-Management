
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the  */
/**
 *
 * @author shreyas
 */
public class SQLDao {

    Connection con;

    public SQLDao() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "1234");

        } catch (Exception ex) {

            System.out.println(ex);

        }

    }

    public static void main(String[] args) throws SQLException {

        SQLDao obj = new SQLDao();
        System.out.println(obj.createTableMovieData());
        System.out.println(obj.createTableTheatre());
        System.out.println(obj.createTableShowData());
        System.out.println(obj.createTableBookingData());
        System.out.println(obj.createTableRegisterData());

        System.out.println(obj.insertIntRegisterData("suhas", 1234567710, "super"));
        System.out.println(obj.insertIntRegisterData("sai", 1234567743, "saikumar"));

        System.out.println(obj.insertIntoMovieData("ABCD3", "REMO D", "PRABHUDEV", "MADHURI", (float) 4.4, "HINDI", "2018-11-16"));
        System.out.println(obj.insertIntoMovieData("KGF", "PRASHANTH", "YASH", "SRINIDHI S", (float) 5.0, "KANNADA", "2018-12-21"));
        System.out.println(obj.insertIntoMovieData("D53", "THARUN SUDHIR", "DHARSHAN", "KRITHI K", (float) 4.2, "KANNADA", "2018-12-01"));
        System.out.println(obj.insertIntoMovieData("THUGS OF HINDUSTHAN", "VIJAY KRISHNA", "AK AND BIG B", "KATHRINA KAIF", (float) 3.5, "HINDI", "2018-11-13"));
        System.out.println(obj.insertIntoMovieData("SARKAR", "MURUGAD0SS", "VIJAY", "KEERTHI S", (float) 4.5, "TAMIL", "2018-11-06"));
        System.out.println(obj.insertIntoMovieData("TAXIWALA", "RAHUL S", "VIJAY D", "PRIYANKA", (float) 4.0, "TELUGU", "2018-11-14"));
        System.out.println(obj.insertIntoMovieData("ZERO", "ANAND L", "SRK", "ANUSHKA S", (float) 3.0, "HINDI", "2018-11-21"));

        System.out.println(obj.insertIntoTheatreData(1, "SOUNDARYA", "DBPUR", 1234567987));
        System.out.println(obj.insertIntoTheatreData(4, "SOUNDARYA", "DBPUR", 1234567987));
        System.out.println(obj.insertIntoTheatreData(6, "SOUNDARYA", "DBPUR", 1234567987));

        System.out.println(obj.insertIntoTheatreData(3, "KAVERI", "YASHWANTHPUR", 1234562341));
        System.out.println(obj.insertIntoTheatreData(2, "KAVERI", "YASHWANTHPUR", 1234562341));
        System.out.println(obj.insertIntoTheatreData(5, "KAVERI", "YASHWANTHPUR", 1234562341));

        System.out.println(obj.insertIntoTheatreData(3, "GANESH", "YELAHANKA", 1234567980));
        System.out.println(obj.insertIntoTheatreData(4, "GANESH", "YELAHANKA", 1234567980));
        System.out.println(obj.insertIntoTheatreData(7, "GANESH", "YELAHANKA", 1234567980));

        System.out.println(obj.insertIntoTheatreData(2, "RMZ", "YELAHANKA", 1234565436));
        System.out.println(obj.insertIntoTheatreData(1, "RMZ", "YELAHANKA", 1234565436));
        System.out.println(obj.insertIntoTheatreData(7, "RMZ", "YELAHANKA", 1234565436));

        System.out.println(obj.insertIntoShowData(1, 1, "9AM", "2PM", "5PM"));
        System.out.println(obj.insertIntoShowData(2, 4, "9:30AM", "2:30PM", "5:30PM"));
        System.out.println(obj.insertIntoShowData(3, 6, "10AM", "3PM", "6PM"));

        System.out.println(obj.insertIntoShowData(4, 3, "9AM", "2PM", "5PM"));
        System.out.println(obj.insertIntoShowData(5, 2, "9:30AM", "2:30PM", "5:30PM"));
        System.out.println(obj.insertIntoShowData(6, 5, "10AM", "3PM", "6PM"));

        System.out.println(obj.insertIntoShowData(7, 3, "9AM", "2PM", "5PM"));
        System.out.println(obj.insertIntoShowData(8, 4, "9:30AM", "2:30PM", "5:30PM"));
        System.out.println(obj.insertIntoShowData(9, 7, "10AM", "3PM", "6PM"));

        System.out.println(obj.insertIntoShowData(10, 2, "9AM", "2PM", "5PM"));
        System.out.println(obj.insertIntoShowData(11, 1, "9:30AM", "2:30PM", "5:30PM"));
        System.out.println(obj.insertIntoShowData(12, 7, "10AM", "3PM", "6PM"));

    }

    public boolean createTableBookingData() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS BOOKING\n"
                + "(\n"
                + "	CUST_ID INT(4) AUTO_INCREMENT ,\n"
                + "	CUST_NAME VARCHAR(30),\n"
                + "	PHONE BIGINT(10),\n"
                + "	MOV_ID INT(4),\n"
                + "	NO_OF_TICKETS INT(2),\n"
                + "	SHOW_TIMINGS VARCHAR(20),\n"
                + "	DAY VARCHAR(10),\n"
                + "	THEATRE_ID INT(4),\n"
                + "	CONSTRAINT PK_CUSTID PRIMARY KEY(CUST_ID),\n"
                + "	CONSTRAINT FK_MOV_ID1 FOREIGN KEY(MOV_ID) REFERENCES MOVIE_DATA(MOV_ID),\n"
                + "	CONSTRAINT FK_THEATRE_ID1 FOREIGN KEY(THEATRE_ID) REFERENCES THEATRE(THEATRE_ID)\n"
                + ");";

        PreparedStatement pst = con.prepareStatement(sql);

        return pst.execute();
    }

    public boolean createTableRegisterData() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS REGISTER\n"
                + "(\n"
                + "	USER_ID INT(4) AUTO_INCREMENT,\n"
                + "	USER_NAME VARCHAR(20),\n"
                + "	PHONE_NO BIGINT(10),\n"
                + "	PASSWORD VARCHAR(15),\n"
                + "	CONSTRAINT PK_USER_ID PRIMARY KEY(USER_ID)\n"
                + ");";

        PreparedStatement pst = con.prepareStatement(sql);

        return pst.execute();
    }

    public boolean createTableShowData() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS SHOWDATA\n"
                + "(\n"
                + "	THEATRE_ID INT(4), \n"
                + " 	MOV_ID INT(4),\n"
                + "	MORNING_SHOW VARCHAR(20),\n"
                + "	NOON_SHOW VARCHAR(20),\n"
                + " 	EVENING_SHOW VARCHAR(20),\n"
                + "	CONSTRAINT FK_MOV_ID2 FOREIGN KEY(MOV_ID) REFERENCES MOVIE_DATA(MOV_ID) ON DELETE CASCADE,\n"
                + "	CONSTRAINT FK_THEATRE_ID2 FOREIGN KEY(THEATRE_ID) REFERENCES THEATRE(THEATRE_ID) ON DELETE CASCADE \n"
                + ");";

        PreparedStatement pst = con.prepareStatement(sql);

        return pst.execute();
    }

    public boolean createTableMovieData() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS MOVIE_DATA\n"
                + "(\n"
                + "	MOV_ID INT(4) NOT NULL AUTO_INCREMENT,\n"
                + "	MOVIE_NAME  VARCHAR(30),\n"
                + "	DIR_NAME VARCHAR(30),\n"
                + "	ACT_HERO VARCHAR(30),\n"
                + "	ACT_HEROINE VARCHAR(30),\n"
                + "	RATING FLOAT(4),\n"
                + "	LANGUAGE VARCHAR(30),\n"
                + "	DATE DATE,\n"
                + "	CONSTRAINT PK_MOV_ID PRIMARY KEY(MOV_ID)\n"
                + ");";

        PreparedStatement pst = con.prepareStatement(sql);
        return pst.execute();

    }

    public boolean createTableTheatre() throws SQLException {

        String sql = "CREATE TABLE IF NOT EXISTS THEATRE\n"
                + "(\n"
                + "	THEATRE_ID INT(4) AUTO_INCREMENT, \n"
                + "	MOV_ID INT(4),\n"
                + "	THEATRE_NAME VARCHAR(30),\n"
                + "	LOCATION VARCHAR(20),\n"
                + "	CONTACT_NO BIGINT(10),\n"
                + "	CONSTRAINT PK_THEATRE_ID PRIMARY KEY(THEATRE_ID),\n"
                + "	CONSTRAINT FK_MOV_ID FOREIGN KEY(MOV_ID) REFERENCES MOVIE_DATA(MOV_ID) ON DELETE CASCADE\n"
                + ");";

        PreparedStatement pst = con.prepareStatement(sql);

        return pst.execute();

    }

    public int insertIntoMovieData(String movName, String dirName, String hero, String heroin, float rating, String lang, String date) throws SQLException {

        String sql = "INSERT INTO MOVIE_DATA (MOVIE_NAME,DIR_NAME,ACT_HERO,ACT_HEROINE,RATING,LANGUAGE,DATE) VALUES (?,?,?,?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, movName);
        pst.setString(2, dirName);
        pst.setString(3, hero);
        pst.setString(4, heroin);
        pst.setFloat(5, rating);
        pst.setString(6, lang);
        pst.setString(7, date);

        return pst.executeUpdate();

    }

    public int insertIntoTheatreData(int movie_id, String theatreName, String location, long phone_no) throws SQLException {

        String sql = "INSERT INTO THEATRE (MOV_ID,THEATRE_NAME,LOCATION,CONTACT_NO) VALUES (?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, movie_id);
        pst.setString(2, theatreName);
        pst.setString(3, location);
        pst.setLong(4, phone_no);

        return pst.executeUpdate();

    }

    public int insertIntoShowData(int theatre_id, int movie_id, String mor_show, String noon_show, String eve_show) throws SQLException {

        String sql = "INSERT INTO SHOWDATA (THEATRE_ID,MOV_ID,MORNING_SHOW,NOON_SHOW,EVENING_SHOW) VALUES (?,?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, theatre_id);
        pst.setInt(2, movie_id);
        pst.setString(3, mor_show);
        pst.setString(4, noon_show);
        pst.setString(5, eve_show);

        return pst.executeUpdate();

    }

    public int insertIntRegisterData(String u_name, long ph_no, String password) throws SQLException {

        String sql = "INSERT INTO REGISTER (USER_NAME,PHONE_NO,PASSWORD) VALUES (?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, u_name);
        pst.setLong(2, ph_no);
        pst.setString(3, password);

        return pst.executeUpdate();

    }

    public ResultSet getDataFromTable(String tableName) throws SQLException {

        String sql = "SELECT * FROM " + tableName;

        PreparedStatement pst = con.prepareStatement(sql);

        return pst.executeQuery();

    }

    boolean verifyUser(String name, String pass) throws SQLException {

        String sql = "SELECT * FROM REGISTER WHERE USER_NAME = ? AND PASSWORD = ?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, name);
        pst.setString(2, pass);
        ResultSet rs = pst.executeQuery();

        return rs.next();
    }

    boolean deleteTheRowFrom(String tableName, String primaryKey, int Id) throws SQLException {

        String sql = "DELETE FROM " + tableName + " where " + primaryKey + " = ?";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, Id);

        int n = pst.executeUpdate();
        if (n == 1) {
            return true;
        }
        return false;

    }

    ResultSet getTheatreFromOfMovie(int movieId) throws SQLException {

        String sql = "SELECT THEATRE_NAME,THEATRE_ID FROM THEATRE WHERE MOV_ID = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, movieId);
        return pst.executeQuery();

    }

    ResultSet getDataFromTableShow(int theatreId) throws SQLException {

        String sql = "SELECT * FROM SHOWDATA WHERE THEATRE_ID = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, theatreId);
        return pst.executeQuery();

    }

    public int insertIntoBookingData(String cust_name, long ph, int mov_id, int no_ticket, String show_time, String day, Integer theatre_id) throws SQLException {

        String sql = "INSERT INTO BOOKING (CUST_NAME,PHONE, MOV_ID,NO_OF_TICKETS,SHOW_TIMINGS ,DAY ,THEATRE_ID) VALUES (?,?,?,?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, cust_name);
        pst.setLong(2, ph);
        pst.setInt(3, mov_id);
        pst.setInt(4, no_ticket);
        pst.setString(5, show_time);
        pst.setString(6, day);
        pst.setInt(7, theatre_id);
        int n = pst.executeUpdate();

        if (n == 1) {
            ResultSet rs = con.prepareStatement("Select cust_id from booking").executeQuery();
            if (rs.next()) {
                rs.last();
                return rs.getInt(1);
            }

        } else if (n == 0) {
            return n;
        }

        return 0;
    }

    ResultSet getTicketDetails(Integer custId, int movieId) throws SQLException {

        String sql = "select m.movie_name ,b.cust_id,b.cust_name,b.no_of_tickets,b.show_timings,b.day from movie_data m , booking b\n" +
                        "where m.mov_id =? and b.cust_id =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(2, custId);
        pst.setInt(1, movieId);
        return pst.executeQuery();

    }

}
