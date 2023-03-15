/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.LessonProgress;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LessonProgressDAO {
    private Connection con;
    String status ="";
    public LessonProgressDAO(){
        try {
            con = new DBContext().getConnection();
            status="Ket noi thanh cong";
        } catch (Exception e) {
            status="Ket noi that bai";
        }
    }
    public List<LessonProgress> getAll(){
        String sql = "select * from LessonProgress_HE161475";
        List<LessonProgress> list = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new LessonProgress(rs.getString(1), rs.getString(2), rs.getString(3)));
                
                
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public List<LessonProgress> getAllByUsername(String username){
        String sql = "select * from LessonProgress_HE161475 where username=?";
        List<LessonProgress> list = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new LessonProgress(rs.getString(1), rs.getString(2), rs.getString(3)));
                
                
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public void addLessonProgress(String username, String courseId, String lessonId){
        String sql = "insert into LessonProgress_HE161475(username, courseid,lessonid) values(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, courseId);
          
            ps.setString(3, lessonId);
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("===========================================");
        }
    }
    
    public static void main(String[] args) {
        LessonProgressDAO lpd = new LessonProgressDAO();
        List<LessonProgress> list = lpd.getAll();
//        System.out.println(list.size());
        System.out.println(lpd.getAllByUsername("havu").size());
        
    }
}
