/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.StudentProgress;
import Models.User;
import Utility.StringHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StudentProgressDAO {
     private Connection con;
    String status ="";
    public StudentProgressDAO(){
        try {
            con = new DBContext().getConnection();
            status="Ket noi thanh cong";
        } catch (Exception e) {
            status="Ket noi that bai";
        }
    }
    public List<StudentProgress> getAll(){
        String sql = "select * from StudentProgress_HE161475";
        List<StudentProgress> list = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new StudentProgress(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
                
                
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public List<StudentProgress> getAllByUsername(String username){
        String sql = "select * from StudentProgress_HE161475 where username=?";
        List<StudentProgress> list = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new StudentProgress(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
                
                
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public void addStudentProgress(String username, String courseId, String classId){
        String sql = "insert into StudentProgress_HE161475(username, courseid, progress, classId) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, courseId);
            ps.setInt(3, 0);
            ps.setString(4, classId);
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("===========================================");
        }
    }
     public StudentProgress checkEnrollCourse(String username, String courseId){
        String sql = "select  * from StudentProgress_HE161475 where username=? and courseId=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, courseId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new StudentProgress(username, courseId, rs.getInt(3),rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("===========================================");
            
        }
        return null;
    }
     public void updateStudentProgress(String username, String courseId){
         String sql="update StudentProgress_HE161475\n" +
"set progress = (select cast((select count(lessonId) from LessonProgress_HE161475\n" +
"  where username=? and courseid=?\n" +
"  group by username,courseId)*100 / (select count(*)\n" +
"  from Lesson_HE161475\n" +
"  where courseId=?\n" +
"  group by courseId) as int)\n" +
")\n" +
"where username=? and courseid = ?";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, username);
             ps.setString(2, courseId);
             ps.setString(3, courseId);
             ps.setString(4, username);
             ps.setString(5, courseId);
             ps.execute();
         } catch (Exception e) {
         }
     }
     public void deleteStudentProgress(String courseid){
         String sql=" delete  from StudentProgress_HE161475 where  courseid=?";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ps.setString(1, courseid);
             ps.execute();
         } catch (Exception e) {
         }
     }
     
    
     
    public static void main(String[] args) {
        StudentProgressDAO spd = new StudentProgressDAO();
        spd.deleteStudentProgress("IE6");
        
        
                
    }
}
