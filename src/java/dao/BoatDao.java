    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import dto.Boat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BoatDao {
    
    public static ArrayList<Boat> getAllBoat() throws Exception {
      ArrayList<Boat> list = null;
      Connection conn = DBUtils.getConnection();
      if(conn!= null){
          String query="SELECT * FROM dbo.boats";
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery(query);
          if(rs!=null){
              list = new ArrayList<>();
              while(rs.next()){
                  int id =rs.getInt("bid");
                  String name = rs.getString("bname");
                  String color = rs.getString("color");
                  Boat b = new Boat(id, name, color);
                  list.add(b);
              }
          }
      }      
      return list;
    }
    
    public static int addNewBoat(int bid, String bname, String color) throws Exception {
            int result = 0;
            Connection conn = DBUtils.getConnection();
            if(conn!= null){
                String query = "INSERT boats VALUES (?,?,?)";
                PreparedStatement stm = conn.prepareStatement(query);
                stm.setInt(1, bid);
                stm.setString(2, bname);
                stm.setString(3, color);
                result= stm.executeUpdate();
            }
    return result;
    }
        public static Boat getBoatByID(int id) throws Exception {
        Boat boat = null;

        Connection conn = DBUtils.getConnection();
        if (conn != null) {
            String query = "SELECT bid,bname,color FROM boats\n"
                    + "	WHERE bid=?";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs != null && rs.next()) {
                int bid = rs.getInt("bid");
                String bname = rs.getString("bname");
                String color = rs.getString("color");
                boat = new Boat(bid, bname, color);
            }
        }
        return boat;
    }
        
    public static int updateBoat(int bid, String bname, String color) throws Exception{
            int result = 0;
            Connection conn = DBUtils.getConnection();
            if (conn!= null){
                String query = "UPDATE boats SET bname =?,color = ? WHERE bid =?";
                PreparedStatement stm = conn.prepareStatement(query);
                stm.setString(1, bname);
                stm.setString(2, color);
                stm.setInt(3, bid);
                result =stm.executeUpdate();
            }
            return result;
    }
}
 