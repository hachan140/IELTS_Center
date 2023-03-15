/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.Class;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ClassDAO {
    private Connection con;
    String status ="";
    public ClassDAO(){
        try {
            con = new DBContext().getConnection();
            status="Ket noi thanh cong";
        } catch (Exception e) {
            status="Ket noi that bai";
        }
    }
    public List<Class> getAll(){
        String sql = "select * from Class_HE161475";
        List<Class> list = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Class(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getString(5)));
                
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public void deleteClass(String courseId){
        
       String query = "delete from Class_HE161475 where courseId=?";
       try {
           PreparedStatement ps = con.prepareStatement(query);
           ps.setString(1, courseId);
           ps.executeUpdate();
       } catch (Exception e) {
       }
   }
    public List<Class> getClassByCourseId(String courseId){
        String query = "select * from Class_HE161475 where courseId=?";
        List<Class> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, courseId);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new Class(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getString(5)));
            }
            
        } catch (Exception e) {
        }
        return list;
    }
   public Class getEnrollClass(String courseId){
       String query = "  select * from Class_HE161475  where courseid = ? and classId in (select classId from StudentProgress_HE161475)";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, courseId);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               return new Class(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getString(5));
            }
            
        } catch (Exception e) {
        }
        return null;
   }
    public static void main(String[] args) {
        ClassDAO classd = new ClassDAO();
     
       
        
    }
}
