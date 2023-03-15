/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;

import Models.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Utility.*;

/**
 *
 * @author Admin
 */
public class UserDAO {
    private Connection con;
    
    
    public String status="";

    public UserDAO() {
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
    public List<User> getAll(){
        String sql = "select * from User_HE161475";
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(5), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public User checkUser(String username, String password){
        String sql = "select * from User_HE161475 where username=? AND password=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, StringHelper.EncodingSHA256(password));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(5), rs.getString(7), rs.getInt(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public User getUserByUsername(String username){
        String sql = "select  * from User_HE161475 where username=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void signUp(String username, String password, String email){
        String sql="insert into User_HE161475 values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, "");
            ps.setString(3, StringHelper.EncodingSHA256(password));
            ps.setString(4, email);
            ps.setString(5, "");
            ps.setBoolean(6, false);
            ps.setString(7,"aaa");
            ps.setInt(8, 1);
            ps.execute();
        } catch (Exception e) {
        }
    }
    public void changePassword(String username, String password){
        String sql = "update User_HE161475 set password = ? where username = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, StringHelper.EncodingSHA256(password));
            ps.setString(2, username);
            ps.execute();
            
        } catch (Exception e) {
        }
    }
    public void updateUser(String username,String fullname, String email, String phone, String avatar){
        String sql = "update User_HE161475 set fullname=?, email=?, phone=?, avatar=? where username=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(5, username);
            ps.setString(1, fullname);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, avatar);
           
            ps.execute();
                
            
        } catch (Exception e) {
        }
    }
    public void updateStatus(boolean status, String username){
        String sql = "update User_HE161475 set status=? where username=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           ps.setBoolean(1, status);
           ps.setString(2, username);
            ps.execute();
                
            
        } catch (Exception e) {
        }
    }
    
    
    public static void main(String[] args) {
        UserDAO ud = new UserDAO();
        System.out.println(ud.getUserByUsername("mi").isStatus());
        
    }
}
