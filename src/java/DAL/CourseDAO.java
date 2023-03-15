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
public class CourseDAO {
    private Connection con;
    
    
    public String status="";

    public CourseDAO() {
        try {
            con = new DBContext().getConnection();
            status = "Ket noi thanh cong";
        } catch (Exception e) {
            status = "ket noi that bai " + e.getMessage();
        }
    }

    public Connection getCon() {
        return con;
    }
    public List<Course> getAll(){
        String sql = "select * from Course_HE161475";
        List<Course> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void insertCourse(String id, String name, String detail, int fee){
        String sql = "insert into Course_HE161475 values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, detail);
            ps.setInt(4, fee);
            ps.execute();
        } catch (Exception e) {
        }
    }
    public boolean checkCourse(String id){
        String sql = "select * from Course_HE161475 where courseid=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public void deleteCourse(String courseId){
        ClassDAO cd = new ClassDAO();
        cd.deleteClass(courseId);
        LessonDAO ld = new LessonDAO();
        ld.deleteLessonbyCId(courseId);
        StudentProgressDAO spd = new StudentProgressDAO();
        spd.deleteStudentProgress(courseId);
        String query="delete from Course_HE161475 where courseid=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, courseId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void updateCourse(String courseId, String courseName, String detail, int fee){
        String query = "update Course_HE161475 set coursename=?,detail=?,fee=? where courseid=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, courseName);
            ps.setString(2, detail);
            ps.setInt(3, fee);
            ps.setString(4, courseId);
            ps.execute();
        } catch (Exception e) {
            
        }
    }
    public Course getCourseByCourseId(String courseId){
        String query = "select * from Course_HE161475 where courseid=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, courseId);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                return new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
        } catch (Exception e) {
        }
        return null;
    }
    public int getTotalCourse(){
        String query = "select count(*) from Course_HE161475";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return rs.getInt(1);
                
            }
        } catch (Exception e) {
        }
        return 0;
    }
    public List<Course> getListByPage(List<Course> list, int start, int end){
        List<Course> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
    
    public static void main(String[] args) {
        CourseDAO cd=new CourseDAO();
        
        
       
    }
    
    
}
