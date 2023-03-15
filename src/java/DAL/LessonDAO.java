/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.Lesson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LessonDAO {
   private Connection con;
   public String status="";
   public LessonDAO(){
       try {
           con = new DBContext().getConnection();
           status="Ket noi thanh cong";
       } catch (Exception e) {
           status ="Ket noi that bai "+ e.getMessage();
       }
   }
   public Connection getCon(){
       return con;
       
   }
   public List<Lesson> getAll(){
       String sql="select*from Lesson_HE161475";
       List<Lesson> list = new ArrayList<>();
       try {
           PreparedStatement ps=con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               list.add(new Lesson(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
               
           }
       } catch (Exception e) {
       }
       return list;
   }
   public void deleteLesson(String lessonId){
       String query = "delete from Lesson_HE161475 where lessonId=?";
       try {
           PreparedStatement ps = con.prepareStatement(query);
           ps.setString(1, lessonId);
           ps.executeUpdate();
       } catch (Exception e) {
       }
   }
   public void deleteLessonbyCId(String courseId){
       String query = "delete from Lesson_HE161475 where courseId=?";
       try {
           PreparedStatement ps = con.prepareStatement(query);
           ps.setString(1, courseId);
           ps.executeUpdate();
       } catch (Exception e) {
       }
   }
   public void insertLesson(String lessonId, String lessonName, String detail, String courseId){
       String query ="insert into Lesson_HE161475(lessonId, lessonName, detail, courseId) values(?,?,?,?)";
       try {
           PreparedStatement ps = con.prepareStatement(query);
           ps.setString(1, lessonId);
           ps.setString(2, lessonName);
           ps.setString(3, detail);
           ps.setString(4, courseId);
           ps.execute();
       } catch (Exception e) {
       }
   }
   public void updateLesson(String lessonId, String lessonName, String detail){
       String query ="update Lesson_HE161475 set lessonName=?, detail=? where lessonId=?";
       try {
           PreparedStatement ps = con.prepareStatement(query);
           ps.setString(1, lessonName);
           ps.setString(2, detail);
          
           ps.setString(3, lessonId);
           ps.executeUpdate();
       } catch (Exception e) {
       }
   }
   public List<Lesson> getLessonByCourseId(String cid){
       List<Lesson> list = new ArrayList<>();
       String sql = "select * from Lesson_HE161475 where courseId=?";
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, cid);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               list.add(new Lesson(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
           }
       } catch (Exception e) {
       }
       return list;
   }
   public Lesson getLessonByLessonId(String lid){
       
       String sql = "select * from Lesson_HE161475 where lessonId=?";
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, lid);
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
               return new Lesson(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
           }
       } catch (Exception e) {
       }
       return null;
   }
   public boolean checkLessonExist(String id){
        String sql = "select * from Lesson_HE161475 where lessonid=?";
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
    public static void main(String[] args) {
        LessonDAO ld = new LessonDAO();
        List<Lesson> list = ld.getAll();
//        System.out.println(list.size());

    }
   
    
    
    
}
