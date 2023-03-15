/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import Models.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Admin
 */
public class StringHelper {

    public static String EncodingSHA256(String str) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        byte[] hash = digest.digest(str.getBytes(StandardCharsets.UTF_8));
        String hexString = DatatypeConverter.printHexBinary(hash);
        return hexString;
    }

    public static String getCaptcha() {

        char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9'};
        char index[] = new char[5];

        Random r = new Random();
        int i = 0;

        for (i = 0; i < (index.length); i++) {
            int ran = r.nextInt(data.length);
            index[i] = data[ran];
        }
        return new String(index);
    }
    public String getRandomNumber(){
        Random r = new Random();
        int number = r.nextInt(999999);
        return String.format("%06d", number);
    }
    public void sendEmail(String email, String code){
        
        String toEmail= email;
        String fromEmail="havu14102@gmail.com";
        String password = "usxfgabkqlsaglgd";
        try {
            Properties pr = new Properties();
            pr.setProperty("mail.smtp.host", "smtp.gmail.com");
            pr.setProperty("mail.smtp.port", "587");
            pr.setProperty("mail.smtp.auth", "true");
            pr.setProperty("mail.smtp.starttls.enable", "true");
            Session ses = Session.getInstance(pr, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(fromEmail,password);
                }
            });
            Message mess = new MimeMessage(ses);
            mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            mess.setFrom(new InternetAddress(fromEmail));
            mess.setText("Registered successfully. Please verify your account using this code: " + code);
            
            Transport.send(mess);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
//    public static String getRandom() {
//        Random rd = new Random();
//        int number = rd.nextInt(999999);
//        return String.format("%06d", number);
//    }
//
//    public static void SendMail(String to, String sub, String msg, String user, String pass) {
//        Properties prop = new Properties();
//
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true");
//        javax.mail.Session session = javax.mail.Session.getInstance(prop, new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(user, pass);
//            }
//        });
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(user));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject(sub);
//            message.setContent(msg, "text/html");
//            Transport.send(message);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void SendEmail(String pin, String emailTo) {
//        String subject = "dfdd";
//        String message = "<!DOCTYPE html>\n"
//                + "<html>\n"
//                + "    <head>\n"
//                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
//                + "        <title>JSP Page</title>\n"
//                + "    </head>\n"
//                + "    <body>\n"
//                + pin
//                + "    </body>\n"
//                + "</html>\n"
//                + "";
//        SendMail(emailTo, subject, message, "chanha1410@gmail.com", "matkhaulamatkhau");
//
//    }
   
//    public static void main(String[] args) {
//        StringHelper sh = new StringHelper();
//        sh.sendEmail("havu14102@gmail.com", "1245");
//        
//           
//    }
}
