/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author Admin
 */
public class User {
   
    private String username;
    private String fullname;
    private String password;
    private String email;
    private String phone;
    private boolean status;
    private String avatar;
    private int role;

    public User() {
    }

    public User(String username, String fullname, String password, String email, String phone, boolean status, String avatar, int role) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.avatar = avatar;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isStatus() {
        return status;
    }

    public String getAvatar() {
        return avatar;
    }

    public int getRole() {
        return role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setRole(int role) {
        this.role = role;
    }
    

    
    
    
    

    
    
}

