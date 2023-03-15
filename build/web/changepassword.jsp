<%-- 
    Document   : changepassword
    Created on : Oct 23, 2022, 5:43:32 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change password</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <form action="changepassword" method="post">
            Enter old password <input type="password" name="oldpass"><br/>
            Enter new password <input type="password" name="newpass"><br/><!-- comment -->
            Re-enter password <input type="password" name="repass"><br/>
            <button type="submit">Save</button>
        </form>
    </body>
</html>
