/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SearchDAO {
    private Connection con;
    
    public SearchDAO(){
        try {
            con = new DBContext().getConnection();
            
        } catch (Exception e) {
           
        }
    }
    public List<Course> searchCourseByName(String inputSearch){
        String sql = "select * from Course_HE161475 where coursename like ?";
        List<Course> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%"+inputSearch+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
}
