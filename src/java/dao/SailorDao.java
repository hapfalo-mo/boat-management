package dao;

import dto.Sailor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;

public class SailorDao {

    public static ArrayList<Sailor> getAllSailors() throws Exception {
        ArrayList<Sailor> list = null;
        Connection conn = db.DBUtils.getConnection();
        if (conn != null) {
            String query = "SELECT*FROM sailors";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs != null) {
                list = new ArrayList<>();
                while (rs.next()) {
                    int sid = rs.getInt("sid");
                    String sname = rs.getString("sname");
                    String password = rs.getString("password");
                    int rating = rs.getInt("rating");
                    int age = rs.getInt("age");
                    Sailor s = new Sailor(sid, sname, password, rating, age);
                    list.add(s);
                }
            }
        }

        return list;
    }

    public static Sailor getSailorById(int id) throws Exception {
        Sailor sailor = null;
        Connection conn = db.DBUtils.getConnection();
        if (conn != null) {
            String query = "SELECT * FROM sailors WHERE sid=? ";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int sid = rs.getInt("sid");
                    String sname = rs.getString("sname");
                    String password = rs.getString("password");
                    int rating = rs.getInt("rating");
                    int age = rs.getInt("age");
                    sailor = new Sailor(sid,sname, password, rating, age);
                }
            }
        }
        return sailor;
    }

    public static int addNewSailor(int sid, String sname, String password, int rating, int age) throws Exception {
        int result = 0;
        Connection conn = db.DBUtils.getConnection();
        if (conn != null) {
            String query = "INSERT INTO sailors "
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, sid);
            stm.setString(2, sname);
            stm.setString(3, password);
            stm.setInt(4, rating);
            stm.setInt(5, age);
            result = stm.executeUpdate();
        }
        return result;
    }
}
