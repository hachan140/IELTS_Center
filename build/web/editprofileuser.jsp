<%-- 
    Document   : editprofileuser
    Created on : Oct 24, 2022, 12:49:15 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <style>
           
            .parent {
                background-color: #ABD9FF;
                width: 100vw;
                height: 70vh;

                /* additional style */
                display: flex;
                justify-content: center;
                align-items: center;
            }

            .child {
                background-color: #E5F0FF;
                width: 40%;
                height: 400px;
                padding-left: 140px;
        </style>
        <form action="editprofileuser?username=${username}" method="post">
            <div class="parent">
                <div class="child">
                    <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text"name="username" value="${username}" disabled></td><br/>
                </tr>
                <tr>
                    <td>Full Name</td>
                    <td><input type="text"name="fullname" value="${fullname}"></td><br/>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><a href="changepassword" >Change password</a></td><br/>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text"name="email" value="${em}"></td><br/>
                </tr>
                <tr>
                    <td>Phone number</td>
                    <td><input type="text"name="phone" value="${pnum}"></td><br/>
                </tr>
                <tr>
                    <td>Avatar</td>
                    <td><input type="text"name="avatar" value="${ava}"></td><br/>
                </tr>
            </table>
            <input type="submit" name="submit" value="Update">
                </div>
                
            </div>
            
        </form>
               
    </body>
</html>
