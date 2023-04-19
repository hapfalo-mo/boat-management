
package dao;

import db.DBUtils;
import dto.Boat;
import dto.Reverse;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ReserveDao {

    public static int insertBoatRegister(String sid, String bid, String date) throws Exception {
        int result = 0;
        Connection conn = db.DBUtils.getConnection();
        if (conn != null) {
            String query = "INSERT INTO reserves VALUES(?,?,?)";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1, sid);
            stm.setString(2, bid);
            stm.setString(3, date);
            result = stm.executeUpdate();
        }
        return result;
    }
    public static ArrayList<Reverse> getAllRepositoryBy() throws Exception {
        ArrayList<Reverse> list = null;
        Connection conn = db.DBUtils.getConnection();
        if(conn!= null){
            String query ="SELECT * FROM reserves WHERE sid = ?";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs!=null){
                while(rs.next()){
                    int sid = rs.getInt("sid");
                    int bid = rs.getInt("bid");
                    String date = rs.getString("day");
                    Reverse re = new Reverse(sid, bid, date);
                    list.add(re);
                }
            }
        }
                
                return list;
    }
    public static  ArrayList<Reverse> getRepositoryBySId(int sid) throws Exception {
        ArrayList<Reverse> list = null;
        Connection conn = db.DBUtils.getConnection();
        if(conn!= null){
            String query ="SELECT * FROM reserves WHERE sid = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, sid);
            ResultSet rs = st.executeQuery();
            if(rs!=null){
                list = new ArrayList<>();
                while(rs.next()){
                    int id = rs.getInt("sid");
                    int bid = rs.getInt("bid");
                    String date = rs.getString("day");                   
                    Reverse re = new Reverse(sid, bid, date);
                    list.add(re);   
                }
            }
        }               
                return list;
    }
    public static  ArrayList<Reverse> getRepositoryByBId(int bid) throws Exception {
        ArrayList<Reverse> list = null;
        Connection conn = db.DBUtils.getConnection();
        if(conn!= null){
            String query ="SELECT * FROM reserves WHERE bid = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, bid);
            ResultSet rs = st.executeQuery();
            if(rs!=null){
                list = new ArrayList<>();
                while(rs.next()){
                    int sid = rs.getInt("sid");
                    int id = rs.getInt("bid");
                    String date = rs.getString("day");
                    Reverse re = new Reverse(sid, id, date);
                    list.add(re);
                }
            }
        }               
                return list;
    }
    
  
    
}
